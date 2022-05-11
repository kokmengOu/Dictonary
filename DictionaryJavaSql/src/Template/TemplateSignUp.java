/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Template;

import Validation_Account.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author kokmeng
 */
public class TemplateSignUp implements ActionListener {
    
    //main panel 
    JFrame frame;
    
    JPanel main_panel;
    
    JPanel main_Panel_north;
    JPanel main_Panel_south;
    JPanel main_Panel_west;
    JPanel main_Panel_east;
    JPanel main_Panel_center;
    //main panel
    
    // panel in center for text field , password, and submit
    JPanel[] Panel_center1;
    // panel in center for text field , password, and submit
    
    //Jlabel for SignUp and link back to signIn 
    JLabel SignUp;
    JLabel back_To_SignIn;
    JButton buttonSignIn;
    //Jlabel for SignUp and link back to signIn 
    
    // text Last , First Name , Email , password and comfirm password and Submit 
    JTextField userFtext;
    JTextField userLtext;
    JTextField userEtext;
    JPanel panel_checkBox;  JCheckBox gender ,displayPassword; String gen =""; // for check box //  
    JPasswordField passwordText;
    JPasswordField re_passwordText;
    JButton SubmitButton;
    // text Last , First Name , Email , password and comfirm password and Submit 
    
    Font myFont1 = new Font("Lucida Grande",Font.BOLD,40);
    
    ImageIcon icon = new ImageIcon("view.png");
    ImageIcon icon2 = new ImageIcon("hide.png");
    ImageIcon icon1 = new ImageIcon("male1.png");
    ImageIcon icon3 = new ImageIcon("woman1.png");
    
    Image img;
    Image newImg;
    Image img1;
    Image newImg1;
    
    TemplateSignUp(){
        // main panel 
        
        JPanel main_panel = new JPanel();
        main_panel.setSize(800,600);
        main_panel.setBackground(new java.awt.Color(255, 255, 255));
        main_panel.setLayout(new BorderLayout(30,30));
        
        main_Panel_north = new JPanel();
        main_Panel_south = new JPanel();
        main_Panel_west = new JPanel();
        main_Panel_east = new JPanel();
        main_Panel_center = new JPanel();
        
        main_Panel_north.setPreferredSize(new Dimension(100,50));
        main_Panel_south.setPreferredSize(new Dimension(100,50));
        main_Panel_west.setPreferredSize(new Dimension(50,100));
        main_Panel_east.setPreferredSize(new Dimension(50,100));
        main_Panel_center.setPreferredSize(new Dimension(100,100));
        
        main_Panel_north.setLayout(new GridLayout());
        main_Panel_south.setLayout(new GridLayout(1,2,0,0));
        main_Panel_west.setLayout(new GridLayout());
        main_Panel_east.setLayout(new GridLayout(3,1,0,0));
        main_Panel_center.setLayout(new GridLayout(6,1,0,0));
        
        main_Panel_north.setBackground(new java.awt.Color(255, 255, 255));
        main_Panel_south.setBackground(new java.awt.Color(255, 255, 255));
        main_Panel_west.setBackground(new java.awt.Color(255, 255, 255));
        main_Panel_east.setBackground(new java.awt.Color(255, 255, 255));
        main_Panel_center.setBackground(new java.awt.Color(255, 255, 255));
        
        frame = new JFrame("Sign In");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // frame ( close window )
        frame.setSize(800,600); // set size for frame
        frame.setResizable(false); // unable to resize
        
        //main panel
        
        //panel in center for text field , password, and submit
        Panel_center1 = new JPanel[6];
        for(int i = 0; i < Panel_center1.length; i++ ){
            Panel_center1[i] = new JPanel();
            Panel_center1[i].setLayout(new GridLayout());
            Panel_center1[i].setBackground(new java.awt.Color(255, 255, 255));
        } 
        //panel in center for text field , password, and submit
        
        //Jlabel for SignUp and link back to signIn 
        SignUp = new JLabel("Sign Up");
        SignUp.setForeground(new java.awt.Color(153,102,255));
        SignUp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SignUp.setFont(myFont1);
        back_To_SignIn = new JLabel("Go Back   ||");
        back_To_SignIn.setForeground(new java.awt.Color(249,77,109));
        back_To_SignIn.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        back_To_SignIn.setVerticalAlignment(javax.swing.JTextField.TOP);
        buttonSignIn = new JButton("  SignIn");
        buttonSignIn.setBorder(null);
        buttonSignIn.setForeground(new java.awt.Color(153,102,255));
        buttonSignIn.setHorizontalAlignment(javax.swing.JTextField.LEADING);
        buttonSignIn.setVerticalAlignment(javax.swing.JTextField.TOP);
        buttonSignIn.addActionListener(this);
        //Jlabel for SignUp and link back to signIn
        
        // text Last , First Name , Email , password and comfirm password and Submit 
        userFtext = new JTextField();
        userFtext.setForeground(new java.awt.Color(249,77,109));
        userFtext.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "FRIST-NAME", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 13), new java.awt.Color(153,102,255)), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5))); 
        userLtext = new JTextField();
        userLtext.setForeground(new java.awt.Color(249,77,109));
        userLtext.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "LAST-NAME", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 13), new java.awt.Color(153,102,255)), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5))); 
        userEtext = new JTextField();
        userEtext.setForeground(new java.awt.Color(249,77,109));
        userEtext.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "EMAIL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 13), new java.awt.Color(153,102,255)), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5))); 
        panel_checkBox = new JPanel();
        panel_checkBox.setBackground(new java.awt.Color(255, 255, 255));
        panel_checkBox.setLayout(new GridLayout());
        passwordText = new JPasswordField();
        passwordText.setForeground(new java.awt.Color(249,77,109));
        passwordText.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "PASSWORD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 13), new java.awt.Color(153,102,255)), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5))); 
        re_passwordText = new JPasswordField();
        re_passwordText.setForeground(new java.awt.Color(249,77,109));
        re_passwordText.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "RE-PASSWORD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 13), new java.awt.Color(153,102,255)), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5))); 
        SubmitButton = new JButton("SUBMIT");
        SubmitButton.setForeground(new java.awt.Color(153,102,255));
        SubmitButton.addActionListener(this);
        // text Last , First Name , Email , password and comfirm password and Submit 
        
        // icon for checker
        img = icon1.getImage();
        newImg = img.getScaledInstance(35, 35, java.awt.Image.SCALE_SMOOTH);
        icon1= new ImageIcon(newImg);
        img1 = icon.getImage();
        newImg1 = img1.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        icon= new ImageIcon(newImg1);
        // icon for checker
        
        // check box for male and female
        gender = new JCheckBox();
        gender.setIcon(icon1);
        gender.setFocusable(false);
        gender.addActionListener(this);
        gender.setHorizontalAlignment(javax.swing.JCheckBox.CENTER);
        gender.setVerticalAlignment(javax.swing.JCheckBox.CENTER);
        displayPassword = new JCheckBox();
        displayPassword.setIcon(icon);
        displayPassword.setFocusable(false);
        displayPassword.addActionListener(this);
        displayPassword.setHorizontalAlignment(javax.swing.JCheckBox.SOUTH_EAST);
        //displayPassword.setVerticalAlignment(javax.swing.JCheckBox.BOTTOM);
        
        panel_checkBox.add(gender);//Add to panel
        panel_checkBox.add(displayPassword);//Add to panel
        
        // check box for male and female
        
        
        // Add ( Jlabel for SignUp and link back to signIn ) (text Last , First Name , Email , password and comfirm password and Submit )  Panel_center1 to 6
        Panel_center1[0].add(SignUp);
        Panel_center1[1].add(userFtext);
        Panel_center1[1].add(userLtext);
        Panel_center1[2].add(userEtext);
        Panel_center1[2].add(panel_checkBox);
        Panel_center1[3].add(passwordText);
        Panel_center1[3].add(re_passwordText);
        Panel_center1[4].add(SubmitButton);
        Panel_center1[5].add(back_To_SignIn);
        Panel_center1[5].add(buttonSignIn);
        // Add ( Jlabel for SignUp and link back to signIn ) (text Last , First Name , Email , password and comfirm password and Submit )  Panel_center1 to 6
        
        //ADD Panel_center1 to 6 to main_Panel_center
        for(int i = 0; i < Panel_center1.length; i++ ){
            main_Panel_center.add(Panel_center1[i]);
        }    
        //ADD Panel_center1 to 6 to main_Panel_center
        
        // frame display
        frame.add(main_panel);
        main_panel.add(main_Panel_north , BorderLayout.NORTH );
        main_panel.add(main_Panel_south , BorderLayout.SOUTH );
        main_panel.add(main_Panel_west , BorderLayout.WEST );
        main_panel.add(main_Panel_east , BorderLayout.EAST );
        main_panel.add(main_Panel_center , BorderLayout.CENTER );
        
        frame.setVisible(true); // frame ( display window )
        
        // frame display
        
    }
    
    public static void main(String[] arg){
        
        TemplateSignUp t = new TemplateSignUp();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==gender) // this check box it using to choosing male or female
        {
            if(gender.isSelected())
            {
                gender.setIcon(icon1);
                gen = "Male";
            }
            else
            {
                img = icon3.getImage();
                newImg = img.getScaledInstance(35, 35, java.awt.Image.SCALE_SMOOTH);
                icon3 = new ImageIcon(newImg);
                gender.setIcon(icon3);
                gen = "Female";
            }
        }
        
        if(e.getSource()==displayPassword) // this check box it using to display password and make hidden 
        {
            if(displayPassword.isSelected())
            {
                displayPassword.setIcon(icon);
                passwordText.setEchoChar((char)0);
                re_passwordText.setEchoChar((char)0);
                
            }
            else
            {
                img1 = icon2.getImage();
                newImg1 = img1.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
                icon2= new ImageIcon(newImg1);
                displayPassword.setIcon(icon2);
                passwordText.setEchoChar('\u25cf');
                re_passwordText.setEchoChar('\u25cf');
                
            }
        }
        
        if(e.getSource() == SubmitButton){
            
            String lnametext = userLtext.getText();
            String fnametext = userFtext.getText();
            String emailtext = userEtext.getText();
            String passwordtext = String.valueOf(passwordText.getPassword());
            String re_passwordtext = String.valueOf(re_passwordText.getPassword());
            
            if(lnametext.equals("") || fnametext.equals("") || emailtext.equals("") || passwordtext.equals("") || re_passwordtext.equals("")  )
            {
                JOptionPane.showMessageDialog(null, "Require < Please Complete Blank box before submit >");
            }
            else if(Validation_Email.validationEmail(emailtext) == false)
            {
                JOptionPane.showMessageDialog(null, "Email Require < @example.com >");
            }
            else if(Validation_Password.validationPassword(passwordtext) == false)
            {
                JOptionPane.showMessageDialog(null, """
                                                    Password Require :
                                                    One Captital Letter.
                                                    One Lower Letter.
                                                    One Digit.
                                                    One SpecialCharactor.
                                                    No Space.
                                                    """);
            }
            else if(!passwordtext.equals(re_passwordtext))
            {
                JOptionPane.showMessageDialog(null, "Require < Password Must Match with Comfirm Password >");
            }
            else if(gen.equals(""))
            { 
                JOptionPane.showMessageDialog(null, "Require < Are you Male or Female >"); 
            }
            else
            {
                InforToData ITD = new InforToData(fnametext.trim(),lnametext.trim(),emailtext.toUpperCase().trim(),gen,passwordtext.trim() );
                ITD.EmailExit();
            }
            
        }
        
        if(e.getSource() == buttonSignIn){
            TemplateSignIn TSI = new TemplateSignIn();
            frame.dispose();
        }
        
    }
    
}
