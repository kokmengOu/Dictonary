/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Input_FileIO;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author kokmeng
 */
public class Filereader {
    
    private Scanner input;
    private String search;
    private String File = "fileIo.csv";
    
    public ArrayList<String> getmeaning = new ArrayList<>();
    
    BufferedReader reader = null;
    ArrayList<String> list = new ArrayList<>();
    
    public boolean SearchRecord(String search){
        
        boolean found = false;
        
        String word = ""; String meaning = "";
        
        try
        {
            input = new Scanner(new File(File));
            
            input.useDelimiter("[,\n]");
            
            while(input.hasNext() && !found)
            {
                word = input.next();
                meaning = input.next();
                
                if(word.toLowerCase().contains(search.toLowerCase().trim()))
                {
                    found= true;
                    this.getmeaning.add(meaning);
                }
                
            }
            
//            if(found){
//                JOptionPane.showMessageDialog(null, "Word : " + word + " found meaning " + meaning);
//            }else{
//                JOptionPane.showMessageDialog(null, "Word not found");
//            }
            
        }
        catch(IOException ex)
        {
            JOptionPane.showMessageDialog(null, "Search word in file Error");
        }
        finally{
            input.close();
        }
        
        return found;
    }
    
    public ArrayList<String> getMeaning(){
        return getmeaning;
    }
    
    public boolean printAllOut(){
        
        String line = ""; 
        
        try
        {
            FileReader fr = new FileReader(File);
            reader = new BufferedReader(fr);
            
            int n = 0;
            
            while((line = reader.readLine()) != null){
                n++;
                String[] row = line.split(",");
                System.out.println("Word : " + row[0]);
                
                this.list.add(row[0]);
                
                System.out.println("");
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
    
    public ArrayList<String> getList(){
        return list;
    }
    
}
