/*
Strings.java
Andika Yudha Riyanto - 191524034
D4-2B Teknik Informatika
Politeknik Negeri Bandung
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
