/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ReadDict;

import java.io.*;
import java.sql.*;
import java.util.*;
import javadb.ConnectingDB;
import javax.swing.*;

/**
 *
 * @author kokmeng
 */
public class ReadDict {
    
    Connection con;
    PreparedStatement pstmt = null;

    public ArrayList<String> ReadDictWord(){
        
        con = ConnectingDB.connect();
        ArrayList<String> getlistWord = new ArrayList<>();
        
        String getWord = """
                         
                         SELECT * FROM Dictonary;
                         
                         """;
        
        try{
            pstmt = con.prepareStatement(getWord);
            ResultSet results_word = pstmt.executeQuery();
            
            int n = 0;
            
            while(results_word.next()){
                
                getlistWord.add((String)results_word.getString("Word"));
            }
            
            pstmt.close();
            results_word.close();
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
        return getlistWord;
        
    }
    
    public ArrayList<String> ReadDictMeaning(String word){
        
        con = ConnectingDB.connect();
        ArrayList<String> listMeanning = new ArrayList<>();
        
        String getWord = """
                         
                         SELECT * FROM Dictonary WHERE Word =?;
                         
                         """;
        
        try{
            pstmt = con.prepareStatement(getWord);
            pstmt.setString(1, word);
            
            ResultSet results_word = pstmt.executeQuery();
            
            int n =0;
            
            while(results_word.next())
            {
                    listMeanning.add( (String) results_word.getString("Meaning"));

            }
            
            results_word.close();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
        return listMeanning;

    }
    
    
    public static void main(String args[]) {
        ReadDict RD = new ReadDict();
        RD.ReadDictWord();
        
        System.out.println(RD.ReadDictWord().size());
        System.out.println(RD.ReadDictMeaning("a "));
    }
}
