/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphicsorting;

/**
 *
 * @author andika19
 */import java.util.Scanner;
public class Strings {
    public static void main(String[] args)

    {

        String[] strList;
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.print("\nHow many String do you want to sort? ");
        size = scan.nextInt();

        strList = new String[size];
        System.out.println("\nEnter the Strings...");
        for (int i = 0; i < size; i++)
            strList[i] = scan.next();
        Sorting.selectionSort(strList);

        System.out.println("\nYour strings in descending  order...");
        for (int i = 0; i < size; i++)
            System.out.print(strList[i] + " ");
        System.out.println();
        
         Sorting.insertionSort(strList);

        System.out.println("\nYour strings in ascending order...");
        for (int i = 0; i < size; i++)
            System.out.print(strList[i] + " ");
        System.out.println();


    }
}
