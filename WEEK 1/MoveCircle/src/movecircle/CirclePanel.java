/*
CirclePanel.java
Andika Yudha Riyanto - 191524034
D4-2B Teknik Informatika
Politeknik Negeri Bandung
 */
package movecircle;

/**
 *
 * @author ANDIKA YUDHA RIYANTO
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CirclePanel extends JPanel{
    private final int CIRCLE_SIZE = 50;
    private int x,y;
    private Color c;
    JButton chooseColor = new JButton("Choose Color");
    //---------------------------------------------------------------
    // Set up circle and buttons to move it.
    //---------------------------------------------------------------
    public CirclePanel(int width, int height){
        // Set coordinates so circle starts in middle
        x = (width/2)-(CIRCLE_SIZE/2);
        y = (height/2)-(CIRCLE_SIZE/2);
        c = Color.green;
        // Need a border layout to get the buttons on the bottom
        this.setLayout(new BorderLayout());
        // Create buttons to move the circle
        JButton left = new JButton("Left");
        JButton right = new JButton("Right");
        JButton up = new JButton("Up");
        JButton down = new JButton("Down");
        // Add listeners to the buttons
        left.addActionListener(new MoveListener(-20,0));
        right.addActionListener(new MoveListener(20,0));
        up.addActionListener(new MoveListener(0,-20));
        down.addActionListener(new MoveListener(0,20));
        // Need a panel to put the buttons on or they'll be on
        // top of each other.
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(left);
        buttonPanel.add(right);
        buttonPanel.add(up);
        buttonPanel.add(down);
        // Add the button panel to the top of the main panel
        this.add(buttonPanel, "South");
        
        
        // Create buttons to coloring the circle
        JButton yellow = new JButton("Yellow");
        JButton blue = new JButton("Blue");
        JButton green = new JButton("Green");
        JButton red = new JButton("Red");
        
        // Add listeners to the buttons
        yellow.addActionListener(new ColorListener(Color.yellow));
        blue.addActionListener(new ColorListener(Color.blue));
        chooseColor.addActionListener(new ColorListener(null));
        green.addActionListener(new ColorListener(Color.green));
        red.addActionListener(new ColorListener(Color.red));
        
        //background of each button
        yellow.setBackground(Color.yellow);
        blue.setBackground(Color.blue);
        green.setBackground(Color.green);
        red.setBackground(Color.red);
        
        //foreground of each button
        yellow.setForeground(Color.black);
        blue.setForeground(Color.white);
        green.setForeground(Color.white);
        red.setForeground(Color.black);
        
        // Need a panel to put the buttons on or they'll be on
        // top of each other.
        JPanel buttonPanelColor = new JPanel();
        buttonPanelColor.add(yellow);
        buttonPanelColor.add(blue);
        buttonPanelColor.add(chooseColor);
        buttonPanelColor.add(green);
        buttonPanelColor.add(red);
        // Add the button panel to the top of the main panel
        this.add(buttonPanelColor, "North");
    }
    //---------------------------------------------------------------
    // Draw circle on CirclePanel
    //---------------------------------------------------------------
    public void paintComponent(Graphics page){
        super.paintComponent(page);
        page.setColor(c);
        page.fillOval(x,y,CIRCLE_SIZE,CIRCLE_SIZE);
    }
    //---------------------------------------------------------------
    // Class to listen for button clicks that move circle.
    //---------------------------------------------------------------
    private class MoveListener implements ActionListener{
        private int dx;
        private int dy;
        //---------------------------------------------------------------
        // Parameters tell how to move circle at click.
        //---------------------------------------------------------------
        public MoveListener(int dx, int dy){
            this.dx = dx;
            this.dy = dy;
        }
        //---------------------------------------------------------------
        // Change x and y coordinates and repaint.
        //---------------------------------------------------------------
        public void actionPerformed(ActionEvent e){
            x += dx;
            y += dy;
            repaint();
        }
    }
    
    //---------------------------------------------------------------
    // Class to listen for button clicks that change color of the circle.
    //---------------------------------------------------------------
    private class ColorListener implements ActionListener{
        private Color color;
        //---------------------------------------------------------------
        // Parameters tell how to move circle at click.
        //---------------------------------------------------------------
        public ColorListener(Color a){
            this.color = a;
        }
        //---------------------------------------------------------------
        // Change color repaint.
        //---------------------------------------------------------------
        public void actionPerformed(ActionEvent e){
            if(color != null){
                c = color;
            }else{
                c = JColorChooser.showDialog(chooseColor, "JColorChooser", 
                        c);
            }
            
            repaint();
        }
    }
}