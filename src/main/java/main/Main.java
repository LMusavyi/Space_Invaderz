/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JFrame;

/**
 *
 * @author LazTheGreat
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JFrame window = new JFrame();
       window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       window.setResizable(false);
       window.setTitle("Space Invaderz");
       
       GamePanel gamePanel = new GamePanel();
       window.add(gamePanel);
       window.pack();
       
       window.setLocationRelativeTo(null);
       window.setVisible(true);
       
       gamePanel.startGameThread();
       
    }
    
}
