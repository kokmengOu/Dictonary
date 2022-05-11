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
public class userINOUTtime {
    
    Connection con;
    Statement stmt = null;
    PreparedStatement pstmt = null;
    
    private String store ;
    
    public userINOUTtime(String s){
        this.store = s;
    }
    
    String setHashMap(){
        return store;
    }
    
    
    public boolean userLoginTime(){
        
        String writerLoginTime = """
                                 
                                    INSERT INTO userActivity (
                                                              loginTime,
                                                              user_ID
                                                          )
                                                          VALUES (
                                                              ?,?
                                                          );
                                 
                                 """;
        
        con = ConnectingDB.connect();
        
        java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
        
        System.out.println("Date : " + date);
        
        try
        {
            pstmt = con.prepareStatement(writerLoginTime);
            pstmt.setTimestamp(1, date);
            pstmt.setString(2, setHashMap());
            
            pstmt.executeUpdate();
            
            pstmt.close();
            
            con.commit();
            
        }
        catch(SQLException ex)
        {
            
        }
        
        return false;
    }
    
    public boolean userLogoutTime(){
        
        String writerLogoutTime = """
                                  
                                    INSERT INTO userActivity (
                                                               logoutTime,
                                                               user_ID
                                                           )
                                                           VALUES (
                                                           ?,?
                                                           );
                                  
                                  """;
        
        con = ConnectingDB.connect();
        
        java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
        
        System.out.println("Date : " + date);
        
        try
        {
            pstmt = con.prepareStatement(writerLogoutTime);
            pstmt.setTimestamp(1, date);
            pstmt.setString(2, setHashMap());
            
            pstmt.executeUpdate();
            
            pstmt.close();
            
            con.commit();
            
        }
        catch(SQLException ex)
        {
            
        }
        
        return false;
    }
    
    
    
    public static void main(String arg[]){
        
    }
    
}
