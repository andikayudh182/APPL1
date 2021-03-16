/*
WeeklySales.java
Andika Yudha Riyanto - 191524034
D4-2B Teknik Informatika
Politeknik Negeri Bandung
 */
package polymorphicsorting;

/**
 *
 * @author andika19
 */

import java.util.Scanner;
public class WeeklySales {
    public static void main(String[] args){
        int i, size, sales;
        String f, l;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print ("\nHow many sales : ");
        size = scan.nextInt();
        
        Salesperson[] salesStaff = new Salesperson[size];
        
        for (i = 0; i < size; i++){
            int nomer= i+1;
            System.out.print ("\nSales "+nomer);
            System.out.print ("\n\tFirst Name \t:");
            f = scan.next();
            System.out.print ("\tLast Name \t:");
            l = scan.next();
            System.out.print ("\tTotal Sales \t:");
            sales = scan.nextInt();
            
            //Deklarasi
            salesStaff[i] = new Salesperson(f, l, sales);
        }
        
        Sorting.insertionSort(salesStaff);
        System.out.println ("\nRanking of Sales for the Week :");
        for (Salesperson s : salesStaff)
            System.out.println (s);
    }
}