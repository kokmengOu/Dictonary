/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Input_FileIO;

import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author kokmeng
 */
public class Filewriter {
    
    private final String word;
    private final String Meaning;
    
    private final String File = "fileIo.csv";
    
    public Filewriter(String word, String meaning){

        this.word =  word;
        this.Meaning = meaning;
        
    }
    
    public String getWord(){
        return word;
    }
    
    public String getMeaning(){
        return Meaning;
    }
    
    public String toString(){
        return String.format("%s meaning: %d", getWord(), getMeaning());
    }
    
    public boolean saveRecord()
    {
       try
       {
           
           FileWriter Fw = new FileWriter(File,true);
           
           BufferedWriter bw = new BufferedWriter(Fw);
           
           PrintWriter  pw = new PrintWriter(bw);
           
           pw.println(getWord() +","+ getMeaning() + ",");
           pw.flush();
           pw.close();
           
           JOptionPane.showMessageDialog(null, "Recored Save");
           
       }
       catch(IOException ex)
       {
           JOptionPane.showMessageDialog(null, "Error Recored Saving");
       }
        
        return false;
    }
    
}
