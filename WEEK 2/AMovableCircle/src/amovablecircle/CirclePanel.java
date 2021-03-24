package amovablecircle;
//******************************************************************
// CirclePanel.java
// Andika Yudha Riyanto - 191524034
// D4-2B Teknik Informatika
// Politeknik Negeri Bandung 
// A panel with a circle drawn in the center and buttons onthe
// bottom that move the circle.
//******************************************************************
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CirclePanel extends JPanel {
      private final int CIRCLE_SIZE = 50;
      private int x, y;
      private Color c;
      
      // Buttons and panels are declaredhere,so that it can be accessed by the listener
      JButton left,right,up,down;
      JPanel buttonPanel;

      //---------------------------------------------------------------
      // Set up circle and buttons tomove it.
      //---------------------------------------------------------------

      public CirclePanel(int width, int height) {
           // Set coordinates so circle starts in middle
           x = (width / 2) - (CIRCLE_SIZE / 2);
           y = (height / 2) - (CIRCLE_SIZE / 2);
           c = Color.green;
          
           // Need a border layout to get the buttons on the bottom
           this.setLayout(new BorderLayout());

           // Create buttons to move the circle
           left = new JButton("Left");
           right = new JButton("Right");
           up = new JButton("Up");
           down = new JButton("Down");

           // Add listeners to the buttons
           left.addActionListener(new MoveListener(-20,0));
           right.addActionListener(new MoveListener(20,0));
           up.addActionListener(new MoveListener(0,-20));
           down.addActionListener(new MoveListener(0,20));

           // Need a panel to put the buttons on or they'll be on
           // top of each other.
           buttonPanel = new JPanel();
           buttonPanel.add(left);
           buttonPanel.add(right);
           buttonPanel.add(up);
           buttonPanel.add(down);

           // Add the button panel to the bottom of the main panel
           this.add(buttonPanel, "South");
           
           /**
           * Adding mnemonics to the buttons.
           * (Alt+l/r/u/d)
           */
           left.setMnemonic(KeyEvent.VK_L);
           right.setMnemonic(KeyEvent.VK_R);
           up.setMnemonic(KeyEvent.VK_U);
           down.setMnemonic(KeyEvent.VK_D);
           
           /**
           * Adding tooltips to the buttons
           */
           left.setToolTipText("Lingkaran bergerak ke kiri sejauh 20 pixels");
           right.setToolTipText("Lingkaran bergerak ke atas sejauh 20pixels");
           up.setToolTipText("the circle will be moved up 20 pixels");
           down.setToolTipText("the circle will be moved down 20 pixels");
       
      }
      //----------------------------------------------------------------
      // Draw circle on CirclePanel
      //----------------------------------------------------------------

      public void paintComponent(Graphics page) {

           super.paintComponent(page);
           page.setColor(c);
           page.fillOval(x, y, CIRCLE_SIZE, CIRCLE_SIZE);
      }
      //----------------------------------------------------------------
      // Class to listen for buttonclicks that move circle.
      //----------------------------------------------------------------
      private class MoveListener implements ActionListener {

           private int dx;
           private int dy;
           //----------------------------------------------------------------
           // Parameters tell how to move circle at click.
           //----------------------------------------------------------------

           public MoveListener(int dx,int dy) {

                 this.dx = dx;
                 this.dy = dy;

           }

           //----------------------------------------------------------------
           // Change x and y coordinates and repaint.
           //----------------------------------------------------------------
           public void actionPerformed(ActionEvent e) {

                 x += dx;
                 y += dy;
                repaint();
                 /**
                 * disabling corresponding buttons when the circle hits theborders
                 */
                if (x == 335)right.setEnabled(false); else right.setEnabled(true);
                if (x == -5)left.setEnabled(false); else left.setEnabled(true);
                if (y == 185)down.setEnabled(false); else down.setEnabled(true);
                if (y == 5)up.setEnabled(false); else up.setEnabled(true);
          }
      }
}