/*
PaintThings.java
Andika Yudha Riyanto - 191524034
D4-2B Teknik Informatika
Politeknik Negeri Bandung
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
        
        deck = new Rectangle(35,20);
        bigBall = new Sphere(15);
        Tank = new Cylinder(30,10);
        
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

