package acurrencyconverter;
// *********************************************************************** 
// CurrencyConverter.java 
// Andika Yudha Riyanto - 191524034
// D4-2B Teknik Informatika
// Politeknik Negeri Bandung 
// Computes the dollar value of the cost of an item in another currency. 
// *********************************************************************** 
import java.awt.*; 
import javax.swing.*; 
public class CurrencyConverter 
{ 
 public static void main (String[] args) 
 { 
    JFrame frame = new JFrame ("Currency Converter");
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    RatePanel ratePanel = new RatePanel ();
    frame.getContentPane().add(ratePanel);
    frame.setVisible(true);
 } 
} 
