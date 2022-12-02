/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deber03;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author LAB-2
 */
public class Vntana1 extends JFrame {
   private List<JPanel> jPanelList;
   private List<JButton> jButtonList;
   private List<JLabel> jLabelList;
   private List<JTextField> jTextFile;
   private List<JComboBox> jComboBox;
   
   
    public Vntana1() throws HeadlessException{
    this.setTitle("Grid Layout");
    this.setSize(800, 600);
    this.setLocation(200, 100);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.iniciarPaneles();
    
    this.setContentPane(this.jPanelList.get(0));
    this.setVisible(true);
            }
    public void iniciarPaneles(){
    jPanelList= new ArrayList<>();
    this.jPanelList.add(e)
    
    
    }
    }
    
    
    
    
    
    
}
