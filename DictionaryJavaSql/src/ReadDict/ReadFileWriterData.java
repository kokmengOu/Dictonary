/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ReadDict;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
import javadb.ConnectingDB;
import javax.swing.JOptionPane;

/**
 *
 * @author kokmeng
 */
public class ReadFileWriterData {

    Connection con;
    PreparedStatement pstmt = null;
    
    private Scanner input;
    private String search;
    private final String File = "Fword.csv";
    private final String File1 = "F.csv";
    
    BufferedReader reader = null;
    BufferedReader reader1 = null;
    
    private final ArrayList<String> list = new ArrayList<>();
    private final ArrayList<String> meaning = new ArrayList<>();
    
    public boolean readCSVFileWORD(){
        
        String line = ""; 
        String line1 = "";
        
        try{
            FileReader fr = new FileReader(File);
            reader = new BufferedReader(fr);
            
            int n = 0;
            
            while((line = reader.readLine()) != null){
                System.out.println(line);
                list.add(line);
            }
            reader.close();
            
        }
        catch(FileNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, "Search word in file Error");
        }
        catch(IOException ex)
        {
            JOptionPane.showMessageDialog(null, "Search word in file Error");
        }
        
        return false;
        
    }
    
    public boolean readCSVFileMeaning(){
        
        String line1 = ""; 
        
        try{
            FileReader fr = new FileReader(File1);
            reader = new BufferedReader(fr);
            int n = 0;
            
            while((line1 = reader.readLine()) != null){
                
                if(!line1.isBlank()){
                    System.out.println(line1);
                    meaning.add(line1);
                }
            }
            reader.close();
        }
        catch(FileNotFoundException ex)
        {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Search word in file Error");
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Search word in file Error");
        }
        
        return false;
        
    }
    
    
    ArrayList<String> getL(){
        
        return list;
        
    }    
    
    ArrayList<String> getMeaning(){
        
        return meaning;
        
    }    
    
    
    public boolean WriteWord(String word , String meaning){
        con = ConnectingDB.connect();
        
        try
        {
            String insertDict = """
                                INSERT INTO Dictonary (
                                                          Word,
                                                        Meaning
                                                      )
                                                      VALUES (
                                                          ?,?
                                                      );
                            """;
            pstmt = con.prepareStatement(insertDict);
            
                pstmt.setString(1, word);
                pstmt.setString(2, meaning);
            
            pstmt.execute();
            
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        
        return false;
        
    }
    
    

    public static void main(String args[]) {
        ReadFileWriterData g = new ReadFileWriterData();
        g.readCSVFileWORD();
        g.readCSVFileMeaning();
//        g.WriteWord();

        System.out.println(g.getL());
        System.out.println(g.getMeaning());
        
        
        for(int i  = 0; i < g.getL().size() ; i++){
            g.WriteWord(g.getL().get(i), g.getMeaning().get(i));
        }
    }
}
