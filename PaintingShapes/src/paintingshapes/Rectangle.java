/*
Rectangle.java
Andika Yudha Riyanto - 191524034
D4-2B Teknik Informatika
Politeknik Negeri Bandung
 */
package paintingshapes;

/**
 *
 * @author andika19
 */

public class Rectangle extends Shape{
    
    private double width;
    private double length;
    
    public Rectangle(double w, double l){
        super("Rectangle");
        width = w;
        length = l;
    }

    @Override
    public double area() {
        return width*length;
    }
    
    @Override
    public String toString(){
        return super.toString() + " of length " + length +" and width "+ width;
    }
    
}
