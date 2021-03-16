/*
Paint.java
Andika Yudha Riyanto - 191524034
D4-2B Teknik Informatika
Politeknik Negeri Bandung
 */
package paintingshapes;

/**
 *
 * @author andika19
 */
public class Paint {

    private double coverage;
    
    public Paint(double c){
        this.coverage = c;
    }
    
    public double amount (Shape s){
        System.out.println("Computing amount for" + s);
        return s.area()/coverage;
    }
    
}
