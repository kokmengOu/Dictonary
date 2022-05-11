/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validation_Account;

import java.sql.*;
import java.util.*;
import javadb.ConnectingDB;
import javax.swing.*;

/**
 *
 * @author kokmeng
 */

public class InforToData extends PasswordUtils{
    
    private String fname;
    private String lname;
    private String emailtext;
    private String gender;
    private String passwordtext;
    private int x;
    
    Connection con;
    PreparedStatement pstmt = null;
    
    public InforToData(String fn, String ln, String et,String gen, String pwd)
    {
        this.fname = fn;
        this.lname = ln;
        this.emailtext = et;
        this.gender = gen;
        this.passwordtext = pwd;

    }
    
    private String setfName()
    {
        return fname;
    }
    
    private String setlName()
    {
        return lname;
    }
    
    private String setGender()
    {
        return gender;
    }
    
    private String setEmail()
    {
        return emailtext;
    }
    
    private String setPwd()
    {
        return passwordtext;
    }
    
    private int setRandom()
    {
        Random rand = new Random();
        int number = rand.nextInt(100000);
        String formatNum =  String.format("%05d",number);
        x = Integer.parseInt(formatNum);
        return x;
    }
    
    public boolean EmailExit(){
        
        con = ConnectingDB.connect();
        boolean trueAndFalse = false;
        
        String EmailInSQL = 
                        """
                          SELECT *
                            FROM user
                            where emailAddress = ?;
                        """;
        try{
            pstmt = con.prepareStatement(EmailInSQL);
            pstmt.setString(1, setEmail());
            ResultSet results_email = pstmt.executeQuery();
            int n =0;
            
            while(results_email.next()){
                    if(results_email.getString("emailAddress").equals(setEmail())){
                        trueAndFalse = true;
                        JOptionPane.showMessageDialog(null, "Sorry This Email Already Exit in Our Data ");
                    }else{
                        trueAndFalse = false;
                    }
            }
            
            if(trueAndFalse == false ){
                WriteEmailandPassword();
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex+" Error Login");
        }
        return trueAndFalse;
    }
    
    public boolean WriteEmailandPassword()
    {   
        
        String salt = PasswordUtils.getSalt(10);
        String securePassword = PasswordUtils.generateSecurePassword(setPwd(), salt);
        
        con = ConnectingDB.connect();
        
        try
        {
            String insertUser = """
                                INSERT INTO user (
                                                     user_ID,
                                                     username,
                                                     firstname,
                                                     lastName,
                                                     gender,
                                                     emailAddress,
                                                     Password,
                                                     encrypted,
                                                     encryptedPassword
                                                 )
                                                 VALUES (
                                                      ?,?,?,?,?,?,?,?,?                                                          
                                                 );
                            """;
            pstmt = con.prepareStatement(insertUser);
            pstmt.setInt(1, setRandom());
            pstmt.setString(2, setfName()+"."+setlName());
            pstmt.setString(3, setfName());
            pstmt.setString(4, setlName());
            pstmt.setString(5, setGender());
            pstmt.setString(6, setEmail());
            pstmt.setString(7, setPwd());
            pstmt.setString(8, salt);
            pstmt.setString(9, securePassword);
            
            pstmt.execute();
            
            JOptionPane.showMessageDialog(null, "Your Information , Record to Our Data ");
            
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        return false;
    }
    
}
