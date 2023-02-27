/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.syslib;

import com.mycompany.syslib.*;

import javax.swing.*;
import java.awt.*;


/**
 *
 * @author engenheiro
 */
public class Syslib {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewFrame frame = new NewFrame();
                frame.setVisible(true);
                
                frame.repaint();
                frame.revalidate();
            }
        });
    }
}
