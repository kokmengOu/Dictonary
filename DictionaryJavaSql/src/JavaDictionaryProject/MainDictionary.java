/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaDictionaryProject;

import Input_FileIO.Filereader;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.event.ListSelectionEvent;

// https://www.youtube.com/watch?v=qPMesvqZsmA  ( important for search bar ) //

/**
 *
 * @author kokmeng
 */
public class MainDictionary extends Filereader implements ActionListener{
    
    Filereader fr = new Filereader();
    
    ArrayList <String> getValue = new ArrayList<>();
    
    ArrayList <String> getvalue_Select = new ArrayList();
    
    JFrame frame; // frame
    
    JPanel MainPanelCenter; // using panel to cover over frame and input colour 
    
        JPanel MainPanelCenter_TOP;
        JPanel MainPanelCenter_Center;
        JPanel MainPanelCenter_Center1;
        
            JButton buttonPrevious; // 
            JButton buttonNext; // 
            JButton buttonViewAll; // 
        
        JPanel MainPanelCenter_Button;
        
            
    
    JPanel MainPanelWest; // using panel to cover over frame and input colour 

        JPanel MainPanelWest_TOP; // using panel to cover over frame and input colour 
        
            JLabel labelTitle; // title dictonary

            JPanel PanelSearch; //Contain search
            JLabel labelSearch; // search
            JPanel PanelTextFieldSearch;
            JTextField TextFieldSearch; // text
            JButton buttonSearch; // button actionlistener click for search
        
        JPanel MainPanelWest_BOTTOM; // using panel to cover over frame and input colour 
        
            JPanel MainPanelWest_BOTTOM_TOP;
            
                JLabel labelWord;
            
            JPanel MainPanelWest_BOTTOM_BOTTON;
            
                JList listWord;
                JScrollPane ScrollPane ;
    
    JPanel MainPanelEast; // using panel to cover over frame and input colour 

        JPanel MainPanelEast_TOP; // using panel to cover over frame and input colour 
                
            JPanel emplayPanel;
        
        JPanel MainPanelEast_BOTTOM; // using panel to cover over frame and input colour 
        
            JPanel MainPanelEast_BOTTOM_TOP;
            
                JLabel labelMeaing;
            
            JPanel MainPanelEast_BOTTOM_BOTTON;
            
                JList listMeaning;
                JScrollPane ScrollPane1;
                
    DefaultListModel defaultListModel = new DefaultListModel(); // help list crushing
    DefaultListModel defaultListModel1 = new DefaultListModel();
        
    JPanel MainPanelSouth; // using panel to cover over frame and input colour 
    ImageIcon icon1 = new ImageIcon("Search.png"); //image for button
    Image img;
    Image newImg;
    
    Font myFont1 = new Font("Lucida Grande",Font.BOLD,20);
    Font myFont2 = new Font("Lucida Grande",Font.BOLD,13);
    
    int next = 0;
    int previous = 0;
    
    MainDictionary(){
        
        fr.printAllOut();
        
        //best example for list
        fr.getList().stream().forEach((list)->{ // connect with listWord 
            defaultListModel.addElement(list);
        }); 
        
        
            MainPanelCenter_TOP = new JPanel();
            MainPanelCenter_TOP.setBackground(new java.awt.Color(255, 255, 255));
            
            MainPanelCenter_Center = new JPanel();
            MainPanelCenter_Center.setBackground(new java.awt.Color(255, 255, 255));
            
                buttonPrevious = new JButton("Previous");
                buttonPrevious.setForeground(new java.awt.Color(153,102,255));
                buttonPrevious.addActionListener(this);
                
                buttonNext = new JButton("Next");
                buttonNext.setForeground(new java.awt.Color(153,102,255));
                buttonNext.addActionListener(this);
                
                buttonViewAll = new JButton("ViewAll");
                buttonViewAll.setForeground(new java.awt.Color(153,102,255));
                buttonViewAll.addActionListener(this);
            
            MainPanelCenter_Center1 = new JPanel();
            MainPanelCenter_Center1.setBackground(new java.awt.Color(255, 255, 255));
            MainPanelCenter_Center1.setLayout(new GridLayout(3,1,0,0));
            
                MainPanelCenter_Center1.add(buttonPrevious);
                MainPanelCenter_Center1.add(buttonNext);
                MainPanelCenter_Center1.add(buttonViewAll);
            
            MainPanelCenter_Button = new JPanel();
            MainPanelCenter_Button.setBackground(new java.awt.Color(255, 255, 255));
        
        MainPanelCenter = new JPanel();
        MainPanelCenter.setBackground(new java.awt.Color(255, 255, 255));
        MainPanelCenter.setLayout(new GridLayout(4,1,0,0));
        
        MainPanelCenter.add(MainPanelCenter_TOP);
        MainPanelCenter.add(MainPanelCenter_Center);
        MainPanelCenter.add(MainPanelCenter_Center1);
        MainPanelCenter.add(MainPanelCenter_Button);
                
                labelTitle = new JLabel("   Dictionary");
                labelTitle.setFont(myFont1);
                
                    labelSearch = new JLabel("Search");
                    labelSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    labelSearch.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    labelSearch.setFont(myFont2);
                    labelSearch.setPreferredSize(new Dimension(100,50));
                    
                        TextFieldSearch = new JTextField();
                        TextFieldSearch.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10)));
                        TextFieldSearch.setBounds(1,10,330,40);
                        
                    PanelTextFieldSearch = new JPanel();
                    PanelTextFieldSearch.setBackground(new java.awt.Color(255, 255, 255));
                    PanelTextFieldSearch.setLayout(null);
                    
                    PanelTextFieldSearch.add(TextFieldSearch);
                    
                        img = icon1.getImage();
                        newImg = img.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
                        icon1 = new ImageIcon(newImg);
                    
                    buttonSearch = new JButton();
                    buttonSearch.setIcon(icon1);
                    buttonSearch.setBorder(null);
                    buttonSearch.setPreferredSize(new Dimension(100,50));
                    buttonSearch.addActionListener(this);
                    
                PanelSearch = new JPanel();
                PanelSearch.setBackground(new java.awt.Color(255, 255, 255));
                PanelSearch.setLayout(new BorderLayout());
                
                PanelSearch.add(labelSearch, BorderLayout.WEST);
                PanelSearch.add(PanelTextFieldSearch , BorderLayout.CENTER);
                PanelSearch.add(buttonSearch,  BorderLayout.EAST);
        
            MainPanelWest_TOP = new JPanel();
            MainPanelWest_TOP.setLayout(new GridLayout(2,1,0,0));
            MainPanelWest_TOP.setBackground(new java.awt.Color(255, 255, 255));
            MainPanelWest_TOP.setPreferredSize(new Dimension(0,120));
            
            MainPanelWest_TOP.add(labelTitle);
            MainPanelWest_TOP.add(PanelSearch);
            
                    labelWord = new JLabel("Word");
                    labelWord.setBounds(0,25, 95,100);
                    labelWord.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    labelWord.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    labelWord.setFont(myFont2);
            
                MainPanelWest_BOTTOM_TOP = new JPanel();
                MainPanelWest_BOTTOM_TOP.setLayout(null);
                MainPanelWest_BOTTOM_TOP.setBackground(new java.awt.Color(255, 255, 255));
                MainPanelWest_BOTTOM_TOP.setPreferredSize(new Dimension(10,90));
                
                MainPanelWest_BOTTOM_TOP.add(labelWord);
                
                    listWord = new JList();
                    listWord.setBounds(10, 10, 200, 200);
                    listWord.setModel(defaultListModel); 
                    
                    listWord.addListSelectionListener((ListSelectionEvent e) -> {
                        if(!e.getValueIsAdjusting()){
                            
                            fr.getMeaning().clear();
                            defaultListModel1.clear();
                            
                            System.out.println(listWord.getSelectedValue().toString());
                            fr.SearchRecord(listWord.getSelectedValue().toString()); // important
                            fr.getMeaning().stream().forEach((getmeaning)->{ // connect with listWord 
                                String takeMeaning = getmeaning;
                                for(String meaning : takeMeaning.split("£")){
                                    defaultListModel1.addElement(meaning);
                                }
                                
                            }); 
                        }
                    });
                    
                    ScrollPane = new JScrollPane();
                    ScrollPane.setBounds(10, 10, 200, 200);
                    ScrollPane.setViewportView(listWord);
                
                MainPanelWest_BOTTOM_BOTTON = new JPanel();
                MainPanelWest_BOTTOM_BOTTON.setLayout(null);
                MainPanelWest_BOTTOM_BOTTON.setBackground(new java.awt.Color(255, 255, 255));
                MainPanelWest_BOTTOM_BOTTON.setPreferredSize(new Dimension(10,460));
                MainPanelWest_BOTTOM_BOTTON.setSize(502, 460);
                
                ScrollPane.setBounds(30,0, MainPanelWest_BOTTOM_BOTTON.getWidth(), MainPanelWest_BOTTOM_BOTTON.getHeight());
                MainPanelWest_BOTTOM_BOTTON.add(ScrollPane);
                
            MainPanelWest_BOTTOM = new JPanel();
            MainPanelWest_BOTTOM.setLayout(new BorderLayout());
            MainPanelWest_BOTTOM.setBackground(new java.awt.Color(255, 255, 255));
            MainPanelWest_BOTTOM.setPreferredSize(new Dimension(0,560));
            
            MainPanelWest_BOTTOM.add(MainPanelWest_BOTTOM_TOP , BorderLayout.PAGE_START);
            MainPanelWest_BOTTOM.add(MainPanelWest_BOTTOM_BOTTON , BorderLayout.SOUTH);
        
        MainPanelWest = new JPanel();
        MainPanelWest.setBackground(new java.awt.Color(255, 155, 255));
        MainPanelWest.setLayout(new BorderLayout(0,0));
        MainPanelWest.setPreferredSize(new Dimension(533,398));
        
        MainPanelWest.add(MainPanelWest_TOP, BorderLayout.NORTH);
        MainPanelWest.add(MainPanelWest_BOTTOM, BorderLayout.SOUTH);
        
        ///END _ Start
        
            MainPanelEast_TOP = new JPanel();
            MainPanelEast_TOP.setBackground(new java.awt.Color(255, 255, 255));
            MainPanelEast_TOP.setPreferredSize(new Dimension(0,120));
            
                    labelMeaing = new JLabel("Meaning");
                    labelMeaing.setBounds(0,25, 95,100);
                    labelMeaing.setFont(myFont2);
            
                MainPanelEast_BOTTOM_TOP = new JPanel();
                MainPanelEast_BOTTOM_TOP.setLayout(null);
                MainPanelEast_BOTTOM_TOP.setBackground(new java.awt.Color(255, 255, 255));
                MainPanelEast_BOTTOM_TOP.setPreferredSize(new Dimension(10,90));
                
                MainPanelEast_BOTTOM_TOP.add(labelMeaing);
                
                    listMeaning = new JList();
                    listMeaning.setBounds(10, 10, 200, 200);
                    //bad example
//                    listMeaning.setModel(new javax.swing.AbstractListModel<String>() {
////                        public int getSize() { return strings.length; }
////                        public String getElementAt(int i) { return strings[i]; }
//                    });
                    listMeaning.setModel(defaultListModel1); 
                    
                    ScrollPane1 = new JScrollPane();
                    ScrollPane1.setBounds(10, 10, 200, 200);
                    ScrollPane1.setViewportView(listMeaning);
                
                MainPanelEast_BOTTOM_BOTTON = new JPanel();
                MainPanelEast_BOTTOM_BOTTON.setLayout(null);
                MainPanelEast_BOTTOM_BOTTON.setBackground(new java.awt.Color(255, 255, 255));
                MainPanelEast_BOTTOM_BOTTON.setPreferredSize(new Dimension(10,460));
                MainPanelEast_BOTTOM_BOTTON.setSize(502, 460);
                
                ScrollPane1.setBounds(0,0, MainPanelEast_BOTTOM_BOTTON.getWidth(), MainPanelEast_BOTTOM_BOTTON.getHeight());
                MainPanelEast_BOTTOM_BOTTON.add(ScrollPane1);
            
            MainPanelEast_BOTTOM = new JPanel();
            MainPanelEast_BOTTOM.setLayout(new BorderLayout(0,0));
            MainPanelEast_BOTTOM.setBackground(new java.awt.Color(255, 255, 255));
            MainPanelEast_BOTTOM.setPreferredSize(new Dimension(0,560));
            
            MainPanelEast_BOTTOM.add(MainPanelEast_BOTTOM_TOP,  BorderLayout.PAGE_START);
            MainPanelEast_BOTTOM.add(MainPanelEast_BOTTOM_BOTTON , BorderLayout.SOUTH);
        
        MainPanelEast = new JPanel();
        MainPanelEast.setBackground(new java.awt.Color(255, 255, 255));
        MainPanelEast.setLayout(new BorderLayout());
        MainPanelEast.setPreferredSize(new Dimension(533,398));
        
        MainPanelEast.add(MainPanelEast_TOP, BorderLayout.NORTH);
        MainPanelEast.add(MainPanelEast_BOTTOM, BorderLayout.SOUTH);
        
        MainPanelSouth = new JPanel();
        MainPanelSouth.setBackground(new java.awt.Color(255, 255, 255));
        MainPanelSouth.setLayout(null);
        MainPanelSouth.setPreferredSize(new Dimension(1200,50));
        
        frame = new JFrame("Dictionary");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // frame ( close window )
        frame.setSize(1200,710); // set size for frame
        frame.setLayout(new BorderLayout()); 
        frame.setResizable(false); // unable to resize
        
        frame.add(MainPanelCenter, BorderLayout.CENTER);
        frame.add(MainPanelWest, BorderLayout.WEST);
        frame.add(MainPanelEast, BorderLayout.EAST);
        frame.add(MainPanelSouth, BorderLayout.SOUTH);
        
        frame.setVisible(true); // frame ( display window )
        
    }
    
    public static void main(String[] arg){
        MainDictionary MD = new MainDictionary();
    }
    
    private void showPosInfo(int next){
        DefaultListModel filtedItems = new DefaultListModel(); 
        filtedItems.addElement(fr.getList().get(next));

        defaultListModel = filtedItems;
        listWord.setModel(defaultListModel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == buttonSearch){ // important please looking at bad example at learn language app ( worst programmer of all time  )
            
            DefaultListModel filtedItems = new DefaultListModel();  
            
            for(String value : fr.getList()){
                //Example 1  ( 8/10 )
                if (value.toLowerCase().contains(TextFieldSearch.getText().toLowerCase().trim())){
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
        
        
        if(e.getSource() == buttonNext){
            next++;
            
            if(next < fr.getList().size()){
                
                 showPosInfo(next);
                
            }else{
                 next = fr.getList().size() -1;
                 showPosInfo(next);
                
                JOptionPane.showMessageDialog(null, "END");
                
            }
        }
        
        
        if(e.getSource() == buttonPrevious){
          next--;  
          
            if(next > 0){
                
                showPosInfo(next);
                
            }else{
                next = 0;
                showPosInfo(next);
                JOptionPane.showMessageDialog(null, "END");
            }
            
        }
        
        if(e.getSource() == buttonViewAll){
            listWord.setModel(new javax.swing.AbstractListModel<String>() {
                public int getSize() { return fr.getList().size(); }
                public String getElementAt(int i) { return (String) fr.getList().get(i); }
            });
        }
        
    }
}
