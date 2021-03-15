/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintingshapes;

/**
 *
 * @author andika19
 */
import java.text.DecimalFormat;
public class PaintThings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);
        
        Rectangle deck;
        Sphere bigBall;
        Cylinder Tank;
        
        deck = new Rectangle(20,35);
        bigBall = new Sphere(15);
        Tank = new Cylinder(10,30);
        
        double deckamt = paint.amount(deck), ballamt = paint.amount(bigBall), tankamt = paint.amount(Tank);
        //
        
        //
        
        //Print the amount of paint
        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("\nNumber of gallons paint needed...");
        System.out.println("Deck "+ fmt.format(deckamt));
        System.out.println("Big Ball "+ fmt.format(ballamt));
        System.out.println("Tank "+ fmt.format(tankamt));
        
        
    }
    
}

