/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Template;

import ReadDict.ReadDict;
import Validation_Account.userINOUTtime;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;

// https://www.youtube.com/watch?v=qPMesvqZsmA  ( important for search bar ) //

/**
 *
 * @author kokmeng
 */
public class TemplateMainDictonary implements ActionListener {
    
    ReadDict RD = new ReadDict();
    ArrayList<String> list  = new ArrayList<>();
    
    HashMap<String, String> userInformation = new HashMap<>();
    String iD;
    
    //main panel 
    JFrame frame;
    
    JPanel main_panel;
    
    JPanel main_Panel_north;
    JPanel main_Panel_south;
    JPanel main_Panel_west;
    JPanel main_Panel_east;
    JPanel main_Panel_center;
    //main panel
    
    // panel inside main_Panel_center
    JPanel Panel_center_north;
    JPanel Panel_center_south;
    JPanel Panel_center_west;
    JPanel Panel_center_east;
    JPanel Panel_center_center;
    // panel inside main_Panel_center
    
    //JLabel Dictonary textfieldsearch word and meaning Panel_center_north
    JLabel Dictonary;
    JTextField search;
    
//    JPanel Container_Word_Meaing;
//    JLabel Word;
//    JLabel Meaning;
    
    //JLabel Dictonary word and meaning Panel_center_north
    
    //JList listMeaning and ListWord Panel_center_center;
    JList listWord;
    JScrollPane ScrollPane;
    DefaultListModel defaultListModel = new DefaultListModel(); // help list crushing
    JScrollPane ScrollPane1;
    JTextArea TextAreaMeaning;
    DefaultListModel defaultListModel1 = new DefaultListModel(); 

    //JList listMeaning and ListWord Panel_center_center;
    
    // JButton ( next , prevouis , viewall and logout )
    JButton next;
    JButton Previous;
    JButton viewall;
    JButton logout;
    // JButton ( next , prevouis , viewall and logout )
    
    Font myFont1 = new Font("Lucida Grande",Font.BOLD,20);
    
    int n = 0;
    
    TemplateMainDictonary(HashMap<String, String> userInfo , String id)
    {
        
        userInformation = userInfo;
        iD = id;
        
        // main panel 
        main_panel = new JPanel();
        main_panel.setSize(800,600);
        main_panel.setBackground(new java.awt.Color(255, 255, 255));
        main_panel.setLayout(new BorderLayout(5,5));
        
        main_Panel_north = new JPanel();
        main_Panel_south = new JPanel();
        main_Panel_west = new JPanel();
        main_Panel_east = new JPanel();
        main_Panel_center = new JPanel();
        
        main_Panel_north.setPreferredSize(new Dimension(100,30));
        main_Panel_south.setPreferredSize(new Dimension(100,30));
        main_Panel_west.setPreferredSize(new Dimension(30,100));
        main_Panel_east.setPreferredSize(new Dimension(30,100));
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
        
        frame = new JFrame("Dictonary");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // frame ( close window )
        frame.setSize(800,600); // set size for frame
        frame.setResizable(false); // unable to resize
        // main panel
        
        // panel inside main_Panel_center
        
        Panel_center_north = new JPanel();
        Panel_center_south = new JPanel();
        Panel_center_west = new JPanel();
        Panel_center_east = new JPanel();
        Panel_center_center = new JPanel();
        
        Panel_center_north.setPreferredSize(new Dimension(100,100));
        Panel_center_south.setPreferredSize(new Dimension(100,40));
        Panel_center_west.setPreferredSize(new Dimension(363,0));
        Panel_center_east.setPreferredSize(new Dimension(363,0));
        Panel_center_center.setPreferredSize(new Dimension(100,30));
        
        Panel_center_north.setBackground(new java.awt.Color(255, 255, 255));
        Panel_center_south.setBackground(new java.awt.Color(255, 255, 255));
        Panel_center_west.setBackground(new java.awt.Color(255, 255, 255));
        Panel_center_east.setBackground(new java.awt.Color(255, 255, 255));
        Panel_center_center.setBackground(new java.awt.Color(255, 255, 255));
        
        Panel_center_north.setLayout(new GridLayout(2,1,0,0));
        Panel_center_south.setLayout(new GridLayout(1,4,10,0));
        Panel_center_west.setLayout(new GridLayout(1,1,0,0));
        Panel_center_east.setLayout(new GridLayout(1,1,0,0));
        Panel_center_center.setLayout(new GridLayout());
        
        // panel inside main_Panel_center
        
        //JLabel Dictonary textfieldsearch word and meaning Panel_center_north
        Dictonary = new JLabel("Dictonary");
        Dictonary.setForeground(new java.awt.Color(153,102,255));
        Dictonary.setFont(myFont1);
        search = new JTextField();
        search.setForeground(new java.awt.Color(249,77,109));
        search.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "SEARCH", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 10), new java.awt.Color(153,102,255)), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5))); 
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                
                DefaultListModel filtedItems = new DefaultListModel();  
                
                for(String value : list){
                    //Example 1  ( 8/10 )
                    if (value.toLowerCase().contains(search.getText().toLowerCase().trim())){
                        filtedItems.addElement(value);
                    }
                    //Example 2 not 100 % yet ( have some error) 
    //                if(SearchRecord(TextFieldSearch.getText())){
    //                    filtedItems.addElement(TextFieldSearch.getText());
    //                }
                }

                defaultListModel = filtedItems;
                listWord.setModel(defaultListModel);
                
            }
        });
//        Container_Word_Meaing = new JPanel();
//        Container_Word_Meaing.setLayout(new GridLayout(1,2,0,0));
//        
//        Word = new JLabel("Word");
//        Meaning = new JLabel("  Meaning");
//        
//        Container_Word_Meaing.add(Word);
//        Container_Word_Meaing.add(Meaning);
        
        //JLabel Dictonary textfieldsearch word and meaning Panel_center_north
        
        //Lists IN dat stroe in defaultListModel
        for(String word: RD.ReadDictWord()){  // Remove Duplicate Elements From an ArrayList in Java 
            if(!list.contains(word)){
                list.add(word);
            }
        }
        
        list.stream().forEach((list1)->{ // connect with listWord 
            defaultListModel.addElement(list1);
        }); 
        //
        
        //JList listMeaning and ListWord Panel_center_center;
        listWord = new JList();
        listWord.setForeground(new java.awt.Color(249,77,109));
        listWord.setModel(defaultListModel);
        listWord.addListSelectionListener((ListSelectionEvent e) -> {
            if(!e.getValueIsAdjusting()){
                
//                defaultListModel1.clear();
                
                System.out.println(listWord.getSelectedValue().toString());
//                RD.ReadDictMeaning(listWord.getSelectedValue().toString()).stream().forEach((getmeaning)->{ // connect with listWord 
////                    defaultListModel1.addElement(getmeaning);
//                        String str ="";
//                        TextAreaMeaning.setText(getmeaning);
//                    
//                      
//                }); 
                String str = "";
                 for(String meaning : RD.ReadDictMeaning(listWord.getSelectedValue().toString())){
                    TextAreaMeaning.setText( str+=meaning+ "\n\n");
                 }

            }
        });
        
            ScrollPane = new JScrollPane();
            ScrollPane.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "Word", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 12), new java.awt.Color(153,102,255)), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
            ScrollPane.setViewportView(listWord);
        
        TextAreaMeaning = new JTextArea();
        TextAreaMeaning.setText("");
        TextAreaMeaning.setEnabled(false);
        TextAreaMeaning.setLineWrap(true);
        TextAreaMeaning.setBounds(0,0,200,200);
        TextAreaMeaning.setDisabledTextColor(new java.awt.Color(249,77,109));
        TextAreaMeaning.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 5));
//        TextAreaMeaning.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "Meaning", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 12), new java.awt.Color(153,0,255)), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5))); 
        
            ScrollPane1 = new JScrollPane(TextAreaMeaning,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            ScrollPane1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "Meaning", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 12), new java.awt.Color(153,102,255)), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1)));
        
        //JList listMeaning and ListWord Panel_center_center;
        
        // JButton ( next , prevouis , viewall and logout ) Panel_center_south
        next = new JButton("NEXT");
        next.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(153,102,255), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)));
        next.addActionListener(this);
        next.setForeground(new java.awt.Color(153,102,255));
        Previous = new JButton("PREVIOUS");
        Previous.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(153,102,255), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)));
        Previous.addActionListener(this);
        Previous.setForeground(new java.awt.Color(153,102,255));
        viewall = new JButton("VIEWALL");
        viewall.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(153,102,255), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)));
        viewall.addActionListener(this);
        viewall.setForeground(new java.awt.Color(153,102,255));
        logout = new JButton("LOGOUT");
        logout.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 55, 255), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)));
        logout.addActionListener(this);
        logout.setForeground(new java.awt.Color(255, 55, 255));
        // JButton ( next , prevouis , viewall and logout ) Panel_center_south
        
        // Add (JLabel Dictonary textfieldsearch word and meaning )Panel_center_north
        Panel_center_north.add(Dictonary);
        Panel_center_north.add(search);
        // Add (JLabel Dictonary textfieldsearch word and meaning )Panel_center_north
        
        // Add (List word and meaning )Panel_center_west and  Panel_center_east
        Panel_center_west.add(ScrollPane);
        Panel_center_east.add(ScrollPane1);
        // Add (List word and meaning )Panel_center_west and  Panel_center_east
        
        // +Add  JButton ( next , Previous , viewall and logout ) Panel_center_south
        Panel_center_south.add(next);
        Panel_center_south.add(Previous);
        Panel_center_south.add(viewall);
        Panel_center_south.add(logout);
        //+Add  JButton ( next , prevouis , viewall and logout ) Panel_center_south
        
        // Add ( panel_center_--- ) inside main_Panel_center
        main_Panel_center.setLayout(new BorderLayout());
        main_Panel_center.add(Panel_center_north , BorderLayout.NORTH );
        main_Panel_center.add(Panel_center_south , BorderLayout.SOUTH );
        main_Panel_center.add(Panel_center_west , BorderLayout.WEST );
        main_Panel_center.add(Panel_center_east , BorderLayout.EAST );
        main_Panel_center.add(Panel_center_center , BorderLayout.CENTER );
        // Add ( panel_center_--- ) inside main_Panel_center
        
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
        
        HashMap<String, String> userInfo = new HashMap<String , String>();
        
        TemplateMainDictonary t = new TemplateMainDictonary(userInfo , "s");
        
    }
    
    private void showPosInfo(int next){
        DefaultListModel filtedItems = new DefaultListModel(); 
        filtedItems.addElement(list.get(next));

        defaultListModel = filtedItems;
        listWord.setModel(defaultListModel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == next){
            n++;
            
            if(n < list.size()){
                
                 showPosInfo(n);
                
            }else{
                 n = list.size() -1;
                 showPosInfo(n);
                
                JOptionPane.showMessageDialog(null, "END");
                
            }
        }
        
        if(e.getSource() == Previous){
          n--;  
          
            if(n > 0){
                
                showPosInfo(n);
                
            }else{
                n = 0;
                showPosInfo(n);
                JOptionPane.showMessageDialog(null, "END");
            }
            
        }
        
        if(e.getSource() == viewall){
            list.stream().forEach((list1)->{ // connect with listWord 
                defaultListModel.addElement(list1);
            }); 
        }
        
        if(e.getSource() == logout){
            
            userINOUTtime UTNT = new userINOUTtime((String)userInformation.get(iD.toUpperCase()));
            UTNT.userLogoutTime();
            
            TemplateSignIn TSI = new TemplateSignIn();
            frame.dispose();
        }
    }
}
