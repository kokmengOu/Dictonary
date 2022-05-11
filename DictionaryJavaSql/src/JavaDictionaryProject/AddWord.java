package JavaDictionaryProject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import Input_FileIO.Filewriter;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author kokmeng
 */
public class AddWord implements ActionListener{
    
    JFrame frame;
    
    JPanel mainPanelNorth;
    
    
        JPanel SubPanelNorth_TOP; // gridlayOut
        
            JLabel labeltitle;
        
        JPanel SubPanelNorth_Button;
        
            JLabel labelWord;
            JTextField textfield;
                    
    JPanel mainPanelWest;
    
        JLabel labelMeaning;
    
    JPanel mainPanelCenter;
    
        JPanel SubPanelCenter_Top;
            
            JTextArea textfieldMeaning;
        
        JPanel SubPanelCenter_buttom;
        
            JPanel SubPanelCenter_buttom_West;
            
                JPanel SubPanelCenter_buttom_North;
                
                    JButton ButtonAdd;
                    JButton ButtonSave;
                    JButton ButtonClose;
                    
                JPanel SubPanelCenter_buttom_South;
            
            JPanel SubPanelCenter_buttom_East;
            
    JPanel mainPanelEast;
    
    Font myFont1 = new Font("Lucida Grande",Font.BOLD,20);
    Font myFont2 = new Font("Lucida Grande",Font.BOLD,13);
    
    AddWord(){
                
                labeltitle = new JLabel("Input Dictionary");
                labeltitle.setBounds(50, 0, 380, 50);
                labeltitle.setFont(myFont1);
        
            SubPanelNorth_TOP = new JPanel();
            SubPanelNorth_TOP.setLayout(null);
            SubPanelNorth_TOP.setBackground(new java.awt.Color(255, 255, 255));
            
            SubPanelNorth_TOP.add(labeltitle);
            
                labelWord = new JLabel("Word");
                labelWord.setBounds(50, 0, 100, 50);
                
                textfield = new JTextField();
                textfield.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));
                textfield.setBounds(150, 5, 388, 40);
            
            SubPanelNorth_Button = new JPanel();
            SubPanelNorth_Button.setBackground(new java.awt.Color(255, 255, 255));
            SubPanelNorth_Button.setLayout(null);
            
            SubPanelNorth_Button.add(labelWord);
            SubPanelNorth_Button.add(textfield);
        
        mainPanelNorth = new JPanel();
        mainPanelNorth.setLayout(new GridLayout(2,1,0,0));
        mainPanelNorth.setBackground(new java.awt.Color(255, 255, 255));
        mainPanelNorth.setPreferredSize(new Dimension(100,100));
        
        mainPanelNorth.add(SubPanelNorth_TOP);
        mainPanelNorth.add(SubPanelNorth_Button);
        
            labelMeaning = new JLabel("Meaning");
            labelMeaning.setBounds(52, 0, 380, 50);
        
        mainPanelWest = new JPanel();
        mainPanelWest.setBackground(new java.awt.Color(255, 255, 255));
        mainPanelWest.setPreferredSize(new Dimension(150,50));
        
        mainPanelWest.add(labelMeaning);
        
                textfieldMeaning = new JTextArea();
                textfieldMeaning.setLineWrap(true);
                textfieldMeaning.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));
            
            SubPanelCenter_Top = new JPanel();
            SubPanelCenter_Top.setBackground(new java.awt.Color(255, 255, 25));
            SubPanelCenter_Top.setLayout(new GridLayout());
            SubPanelCenter_Top.setBounds(0, 0, 650, 400);
            SubPanelCenter_Top.setPreferredSize(new Dimension(650,400));
            
            SubPanelCenter_Top.add(textfieldMeaning);
                       
                        ButtonAdd = new JButton("Add");
                        ButtonAdd.setForeground(new java.awt.Color(153,102,255));
                        ButtonAdd.addActionListener(this);
                        
                        ButtonSave= new JButton("Save");
                        ButtonSave.setForeground(new java.awt.Color(153,102,255));
                        ButtonSave.addActionListener(this);
                        
                        ButtonClose= new JButton("Close");
                        ButtonClose.setForeground(new java.awt.Color(153,102,255));
                        ButtonClose.addActionListener(this);

                    SubPanelCenter_buttom_North = new JPanel();
                    SubPanelCenter_buttom_North.setBackground(new java.awt.Color(255, 255, 255));
                    SubPanelCenter_buttom_North.setLayout(new GridLayout(1,3,10,10));
                    
                    SubPanelCenter_buttom_North.add(ButtonAdd);
                    SubPanelCenter_buttom_North.add(ButtonSave);
                    SubPanelCenter_buttom_North.add(ButtonClose);
            
                SubPanelCenter_buttom_West = new JPanel();
                SubPanelCenter_buttom_West.setBackground(new java.awt.Color(255, 255, 255));
                SubPanelCenter_buttom_West.setLayout(new GridLayout(2,0,0,0));
                
                SubPanelCenter_buttom_West.add(SubPanelCenter_buttom_North);
                
                SubPanelCenter_buttom_East = new JPanel();
                SubPanelCenter_buttom_East.setBackground(new java.awt.Color(255, 255, 255));
            
            SubPanelCenter_buttom = new JPanel();
            SubPanelCenter_buttom.setBackground(new java.awt.Color(255, 255, 255));
            SubPanelCenter_buttom.setLayout(new GridLayout(1,2,0,0));
            SubPanelCenter_buttom.setPreferredSize(new Dimension(650,78));
            
            SubPanelCenter_buttom.add(SubPanelCenter_buttom_West);
            SubPanelCenter_buttom.add(SubPanelCenter_buttom_East);
        
        mainPanelCenter = new JPanel();
        mainPanelCenter.setBackground(new java.awt.Color(255, 255, 25));
        mainPanelCenter.setLayout(new BorderLayout());
        mainPanelCenter.setPreferredSize(new Dimension(0,100));
        
        mainPanelCenter.add(SubPanelCenter_Top, BorderLayout.NORTH );
        mainPanelCenter.add(SubPanelCenter_buttom, BorderLayout.SOUTH );
        
        mainPanelEast = new JPanel();
        mainPanelEast.setBackground(new java.awt.Color(255, 255, 255));
        mainPanelEast.setPreferredSize(new Dimension(20,10));
        
        frame = new JFrame("Add Dictionary");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // frame ( close window )
        frame.setSize(800,600); // set size for frame
        frame.setLayout(new BorderLayout()); 
        frame.setResizable(false); // unable to resize
        
        frame.add(mainPanelNorth , BorderLayout.NORTH);
        frame.add(mainPanelWest, BorderLayout.WEST);
        frame.add(mainPanelCenter, BorderLayout.CENTER);
        frame.add(mainPanelEast, BorderLayout.EAST);
        
        frame.setVisible(true); // frame ( display window )
        
    }
    
    public static void main(String[] arg){
        
        AddWord aw = new AddWord();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == ButtonAdd){
            
        }
        
        if(e.getSource() == ButtonSave){
            
            String text = textfield.getText();
            String textArea = textfieldMeaning.getText();
            
            if(text.equalsIgnoreCase(""))
            {
                JOptionPane.showMessageDialog(null, "Add word in textfield");
            }
            else if(textArea.equalsIgnoreCase(""))
            {
                JOptionPane.showMessageDialog(null, "Add Meaning in textArea");
            }
            else
            {
                Filewriter fw = new Filewriter(text.toUpperCase(), textArea.replace(". ", "£"));
                fw.saveRecord();
            }
        }
        if(e.getSource() == ButtonClose){
            int getInt = JOptionPane.showOptionDialog(null, "Do you really want to close !!! 😢 ", "Close", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE,null, null, 0);
            
            if(getInt == 0){
                frame.dispose();
            }
        }
    }
    
}
