/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.syslib;

import javax.swing.*;
import java.awt.*;


/**
 *
 * @author engenheiro
 */
public class Syslib {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        JFrame f = new JFrame();
        f.setSize(1024, 600);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
        
        
        JPanel panel = new JPanel(new GridLayout(1, 2));
        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        panel.add(b1);
        panel.add(b2);
        
        LoginScreen loginScreen = new LoginScreen();
        f.add(loginScreen);
        
        f.revalidate();
        f.repaint();
        
    }
}
