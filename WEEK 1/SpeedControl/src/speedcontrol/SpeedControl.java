/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speedcontrol;

/**
 *
 * @author ANDIKA YUDHA RIYANTO
 */
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
public class SpeedControl 
{ 
 // ------------------------------------- 
 // Sets up the frame for the animation. 
 // ------------------------------------- 
 public void static main (String[] args) 
 { 
 JFrame frame = new JFrame ("Bouncing Balls"); 
 frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE); 
 frame.getContentPane.add(new SpeedControlPanel ()); 
 frame.pack(); 
 frame.setVisible(true); 
 } 
} 
