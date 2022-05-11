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
public class userInfor {
    
    Connection con;
    PreparedStatement pstmt = null;
    
    HashMap<String, String> userInfo = new HashMap<String , String>();
    
    public boolean checkPasswordAndPassword(String email,String password){
        
        con = ConnectingDB.connect();
        boolean trueAndFalse = false;
        String getEmail = """
                          SELECT *
                            FROM user
                            where emailAddress = ?;
                          """;
        try{
            pstmt = con.prepareStatement(getEmail);
            pstmt.setString(1, email);
            ResultSet results_email = pstmt.executeQuery();
            int n =0;
            
            while(results_email.next()){
                    if(results_email.getString("emailAddress").equals(email)){
                        System.out.println(results_email.getString("emailAddress"));
                        trueAndFalse = true;
                        this.userInfo.put(results_email.getString("emailAddress"), results_email.getString("user_ID"));
                        boolean passwordMatch = PasswordUtils.verifyUserPassword(password, results_email.getString("encryptedPassword"), results_email.getString("encrypted"));
                        if(passwordMatch){
                            trueAndFalse = true;
                            JOptionPane.showMessageDialog(null, "Your Information is Correct");
                        }else{
                            trueAndFalse = false;
                            JOptionPane.showMessageDialog(null, "Your Password Incorrect");
                        }
                        
                    }
            }
            
            results_email.close();
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex+"Error Login");
        }
        return trueAndFalse;
    }
    
    public HashMap userInfo(){
        return userInfo;
    }
    
    public static void main(String[] arg){
        
        userInfor UIF = new userInfor();
        
//        UIF.checkPasswordAndPassword("King.Kong@mail.com","king.kong");
        
        System.out.println(UIF.checkPasswordAndPassword("King.Kong@mail.com","king.kong"));
    }
    
}
