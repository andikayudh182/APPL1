package acurrencyconverter;
// ****************************************************************** 
// RatePanel.java 
// Andika Yudha Riyanto - 191524034
// D4-2B Teknik Informatika
// Politeknik Negeri Bandung 
// Panel for a program that converts different currencies to U.S. Dollars 
// ****************************************************************** 
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
public class RatePanel extends JPanel 
{ 
 private double[] rate; // exchange rates 
 private String[] currencyName; 
 private JLabel result, costLabel, currencyLabel, title; 
 private JComboBox comboCurrency;
 private JTextField  costField ;

 // ------------------------------------------------------------ 
 // Sets up a panel to convert cost from one of 6 currencies 
 // into U.S. Dollars. The panel contains a heading, a text 
 // field for the cost of the item, a combo box for selecting 
 // the currency, and a label to display the result. 
 // ------------------------------------------------------------ 
 public RatePanel () 
 { 
 title = new JLabel ("How much is that in dollars?"); 
 title.setAlignmentX (Component.CENTER_ALIGNMENT); 
 title.setFont (new Font ("Helvetica", Font.BOLD, 20)); 
 
 // Set up the arrays for the currency conversions 
 currencyName = new String[] {"Select the currency..", 
 " European Euro", " Canadian Dollar", 
 " Japanese Yen", " Australian Dollar", 
 " Indian Rupee", " Mexican Peso"}; 

 // Currency 
 currencyLabel = new JLabel("Currency Name : ");
 comboCurrency= new JComboBox(currencyName);
 comboCurrency.addActionListener(new ComboListener());
 // Cost
 costLabel = new JLabel ("Amount money to US Dollar");
 costField = new JTextField ("1");
 costField.setPreferredSize(new Dimension(140,30));


 rate = new double [] {0.0, 1.2103, 0.7351, 
 0.0091, 0.6969, 
 0.0222, 0.0880}; 
 //result
 result = new JLabel (" ------------ "); 
 add (title); 
 add (currencyLabel);
 add (comboCurrency); 
 add (costLabel);
 add (costField);
 add (result); 

 } 
 // ****************************************************** 
 // Represents an action listener for the combo box. 
 
 // ****************************************************** 
 
 private class ComboListener implements ActionListener 
 { 
     
 // -------------------------------------------------- 
 // Determines which currency has been selected and 
 // the value in that currency then computes and 
 // displays the value in U.S. Dollars. 
 // -------------------------------------------------- 
 public void actionPerformed (ActionEvent event) 
 { 
     int index =comboCurrency.getSelectedIndex();
    result.setText (costField.getText() + currencyName[index] +
            " = " + (rate[index] *Integer.valueOf(costField.getText())) + " U.S. Dollars");
    } 
 } 
} 