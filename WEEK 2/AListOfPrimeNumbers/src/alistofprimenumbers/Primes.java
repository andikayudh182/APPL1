package alistofprimenumbers;
/// ***************************************************************** 
// Primes.java  
// Andika Yudha Riyanto - 191524034
// D4-2B Teknik Informatika
// Politeknik Negeri Bandung 
// Generates a list of primes less than or equal to the integer 
// input by the user. 
// ***************************************************************** 
import java.awt.*; 
import javax.swing.*; 
public class Primes 
    { 
    public static void main (String[] args) 
    { 
        JFrame frame = new JFrame ("Primes"); 
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE); 

        PrimePanel primePanel = new PrimePanel (); 
        frame.getContentPane().add(primePanel); 
        frame.pack(); 
        frame.setVisible(true); 
    } 
}