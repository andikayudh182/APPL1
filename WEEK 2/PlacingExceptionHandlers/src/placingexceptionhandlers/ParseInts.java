package placingexceptionhandlers;
// ****************************************************************
// ParseInts.java
// Andika Yudha Riyanto - 191524034
// D4-2B Teknik Informatika
// Politeknik Negeri Bandung 
// Reads a line of text and prints the integers in the line.
// ****************************************************************
import java.util.Scanner;
public class ParseInts{
    public static void main(String[] args){
    int val, sum=0;
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter a line of text");
    Scanner scanLine = new Scanner(scan.nextLine());
    
    
    while (scanLine.hasNext()){
    try{ 
        val = Integer.parseInt(scanLine.next());
        sum += val;
    
        }
    catch (NumberFormatException exp){
        //System.out.println(exp +"tidak boleh memasukkan string di awal kalimat");
        }
    }
    System.out.println("The sum of the integers on this line is " + sum);
    }
}