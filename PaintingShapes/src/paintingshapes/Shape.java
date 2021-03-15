/*
Shape.java
Andika Yudha Riyanto - 191524034
D4-2B Teknik Informatika
Politeknik Negeri Bandung
 */
package paintingshapes;

/**
 *
 * @author andika19
 */
public abstract class Shape {
    protected String shapeName;
    public abstract double area();
    
    public Shape(String shapeName){
        this.shapeName=shapeName;
    }
    @Override
    public String toString(){
        return "\nShape Name: "+shapeName;
    }
}
