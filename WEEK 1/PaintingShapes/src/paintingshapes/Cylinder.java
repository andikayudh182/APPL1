/*
Cylinder.java
Andika Yudha Riyanto - 191524034
D4-2B Teknik Informatika
Politeknik Negeri Bandung
 */
package paintingshapes;

/**
 *
 * @author andika19
 */
public class Cylinder extends Shape{
    private double height;
    private double radius;
    
    public Cylinder(double h, double r){
        super("Cylinder");
        height = h;
        radius = r;
    }


    @Override
    public double area() {
        return Math.PI*radius*radius*height;
    }
    
    @Override
    public String toString(){
        return super.toString() + " of radius " + radius +" and height "+ height;
    }
}


