package Template;

import Validation_Account.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.HashMap;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kokmeng
 */
public class TemplateSignIn implements ActionListener {
    userInfor UIF = new userInfor();
    // main panel 
    JFrame frame;
    
    JPanel main_panel;
    
    JPanel main_Panel_north;
    JPanel main_Panel_south;
    JPanel main_Panel_west;
    JPanel main_Panel_east;
    JPanel main_Panel_center;
    // main panel 
    
    // text passeword and email
    JTextField userText;
    JPasswordField passwordText;
    // text passeword and email
    
    // label for signIn and link to sign in 
    JLabel SignIn;
    JLabel create_user;
    // label for signIn and link to sign in 
    
    // empty label for panel
    JLabel empty;
    JLabel empty0;
    JPanel emptyPanel;
    // emply label for panel
    
    //Label for reset , check box , and empty label
    JLabel empty1;
    JLabel resetpassword;
    JCheckBox displayPassword;
    // button for Submit and Sign Up
    JButton ButtonSubmit;
    JButton ButtonSignUp;
    // button for Submit and Sign Up
    
    Font myFont1 = new Font("Lucida Grande",Font.BOLD,40);
    
    ImageIcon icon = new ImageIcon("view.png");
    ImageIcon icon1 = new ImageIcon("hide.png");
    
    Image img;
    Image newImg;
    Image img1;
    Image newImg1;
    
    TemplateSignIn(){
        
        // main panel 
        
        JPanel main_panel = new JPanel();
        main_panel.setSize(800,600);
        main_panel.setBackground(new java.awt.Color(255, 255, 255));
        main_panel.setLayout(new BorderLayout(10,10));
        
        JPanel main_Panel_north = new JPanel();
        JPanel main_Panel_south = new JPanel();
        JPanel main_Panel_west = new JPanel();
        JPanel main_Panel_east = new JPanel();
        JPanel main_Panel_center = new JPanel();
        
        main_Panel_north.setPreferredSize(new Dimension(100,150));
        main_Panel_south.setPreferredSize(new Dimension(100,230));
        main_Panel_west.setPreferredSize(new Dimension(200,100));
        main_Panel_east.setPreferredSize(new Dimension(200,100));
        main_Panel_center.setPreferredSize(new Dimension(100,100));
        
        main_Panel_north.setLayout(new GridLayout());
        main_Panel_south.setLayout(new GridLayout(1,2,0,0));
        main_Panel_west.setLayout(new GridLayout());
        main_Panel_east.setLayout(new GridLayout(3,1,0,0));
        main_Panel_center.setLayout(new GridLayout(3,1,0,0));
        
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
        
        // text passeword and email 
        userText = new JTextField();
        userText.setForeground(new java.awt.Color(249,77,109));
        userText.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "EMAIL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 13), new java.awt.Color(153,102,255)), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5))); 
        passwordText = new JPasswordField();
        passwordText.setForeground(new java.awt.Color(249,77,109));
        passwordText.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "PASSWORD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 13), new java.awt.Color(153,102,255)), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5))); 
        // text passeword and email
        
        // empty label for panel
        empty = new JLabel();
        // empty label for panel
        
        // label for signIn and link to sign in 
        SignIn = new JLabel("Sign In");
        SignIn.setForeground(new java.awt.Color(153,102,255));
        SignIn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SignIn.setVerticalAlignment(javax.swing.JTextField.BOTTOM);
        SignIn.setFont(myFont1);
        create_user = new JLabel("Create account ||");
        create_user.setForeground(new java.awt.Color(249,77,109));
        create_user.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        create_user.setVerticalAlignment(javax.swing.JTextField.TOP);
        // label for signIn and link to sign in 
        
        // empty label for panel
        empty0 = new JLabel();
        // empty label for panel
        
        // add panel for button
        emptyPanel = new JPanel();
        emptyPanel.setBackground(new java.awt.Color(255, 255, 255));
        emptyPanel.setLayout(new BorderLayout());
        // add panel for button
        
        // button for Submit and Sign Up
        ButtonSubmit = new JButton("Submit");
        ButtonSubmit.addActionListener(this);
        ButtonSubmit.setForeground(new java.awt.Color(153,102,255));
        ButtonSignUp = new JButton("  Sign Up");
        ButtonSignUp.setForeground(new java.awt.Color(153,102,255));
        ButtonSignUp.setBorder(null);
        ButtonSignUp.setPreferredSize(new Dimension(50,50));
        ButtonSignUp.setHorizontalAlignment(javax.swing.JTextField.LEADING);
        ButtonSignUp.setVerticalAlignment(javax.swing.JTextField.TOP);
        ButtonSignUp.addActionListener(this);
        // button for Submit and Sign Up
        
        // icon for checker
        img = icon.getImage();
        newImg = img.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(newImg);
        img1 = icon1.getImage();
        newImg1 = img1.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        icon1 = new ImageIcon(newImg1);
        // icon for checker
        
        // ADD (Reset and Checkbox and emptylabel ) east panel
        resetpassword = new JLabel("REST PASSWORD");
        resetpassword.setForeground(new java.awt.Color(153,102,255));
        resetpassword.setHorizontalAlignment(javax.swing.JTextField.LEADING);
        resetpassword.setVerticalAlignment(javax.swing.JTextField.TOP);
        resetpassword.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e)  
            {  
               // you can open a new frame here as
               // i have assumed you have declared "frame" as instance variable
               //
                frame.dispose();

            }  
        });
        empty1 = new JLabel();
        displayPassword = new JCheckBox();
        displayPassword.setIcon(icon);
        displayPassword.setFocusable(false);
        displayPassword.addActionListener(this);
        // ADD (Reset and Checkbox and emptylabel ) east panel

        // Add ( text password email  and Submit in main_Panel_center ) and ( signIn  in  main_Panel_north )
        main_Panel_north.add(SignIn);
        main_Panel_center.add(userText);
        main_Panel_center.add(passwordText);
        main_Panel_center.add(ButtonSubmit);
        // Add ( text password email in main_Panel_center ) and ( signIn  in  main_Panel_north )
        
        // Add ( create_user and ButtonSignUp in main_Panel_south ) 
        main_Panel_south.add(empty);
        main_Panel_south.add(create_user);
        emptyPanel.add(ButtonSignUp, BorderLayout.NORTH);
        main_Panel_south.add(emptyPanel);
        main_Panel_south.add(empty0);
        // Add ( create_user and ButtonSignUp in main_Panel_south ) 
        
        //Add (reset password and checkbox)
        main_Panel_east.add(empty1);
        main_Panel_east.add(displayPassword);
        main_Panel_east.add(resetpassword);
        //Add (reset password and checkbox)
        
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
        
        TemplateSignIn t = new TemplateSignIn();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==displayPassword) // this check box it using to display password and make hidden 
        {
            if(displayPassword.isSelected())
            {
                displayPassword.setIcon(icon);
                passwordText.setEchoChar((char)0);
                
            }
            else
            {
                displayPassword.setIcon(icon1);
                passwordText.setEchoChar('\u25cf');
                
            }
        }
        
        if(e.getSource() == ButtonSubmit){
            
            String textEmail = userText.getText();
            String password = String.valueOf(passwordText.getPassword());
            
            //Check password and email validation 
            if(textEmail.equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Text Require Input ");
            }else if(password.equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Password Require Input ");
            }
            else if(Validation_Email.validationEmail(textEmail) == false)
            {
                JOptionPane.showMessageDialog(null, "Email Require < @example.com >");
            }
            else{
                if(UIF.checkPasswordAndPassword(textEmail.toUpperCase(), password)){
                    TemplateMainDictonary TMD = new TemplateMainDictonary(UIF.userInfo() ,textEmail.toUpperCase());
                    userINOUTtime UTNT = new userINOUTtime((String)UIF.userInfo().get(textEmail.toUpperCase()));
                    UTNT.userLoginTime();
                    frame.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Your Email is Incorrect");
                }
            }
            //Check password and email validation 
        }
        
        if(e.getSource() == ButtonSignUp){
            TemplateSignUp TSU = new TemplateSignUp();
            frame.dispose();
        }
        
    }
    
}
