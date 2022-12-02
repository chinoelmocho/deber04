/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deber03;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author LAB-2
 */
public class Vntana1 extends JFrame {
   private List<JPanel> jPanelList;
   private List<JButtonList> jButtonList;
   private List<JTextfile> jTextFile;
    public Vntana1() throws HeadlessException{
    this.setTitle("Grid Layout");
    this.setSize(800, 600);
    this.setLocation(200, 100);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.iniciarPaneles();
    this.jPanelList.get(0).setLayout(new GridLayout(2,3));
    this.jPanelList.get(6).setLayout(new GridLayout(2,1));
    this.setContentPane(this.jPanelList.get(0));
    this.setVisible(true);
            }
    public void iniciarPaneles(){
    
    
    }
    }
    
    
    
    
    
    
}
