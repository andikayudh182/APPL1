/*
Sphere.java
Andika Yudha Riyanto - 191524034
D4-2B Teknik Informatika
Politeknik Negeri Bandung
 */
package paintingshapes;

/**
 *
 * @author andika19
 */

public class Sphere extends Shape{
    private double radius;  //in feet
    
    public Sphere(double r){
        super("Sphere");
        radius = r;
    }
    
    @Override
    public double area(){
        return 4*Math.PI*radius*radius;
    }
    
    @Override
    public String toString(){
        return super.toString() + " of radius " + radius;
    }
    
}
