package copyingafile;
// **************************************************************** 
// CopyFile.java 
// Andika Yudha Riyanto - 191524034
// D4-2B Teknik Informatika
// Politeknik Negeri Bandung 
// Copying file from directory and print it.
// **************************************************************** 
import java.io.*;
import java.util.Scanner;
import java.io.*;

import java.util.Scanner;
import java.io.*;
public class CopyFile{

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        boolean exist = false;
        int barisFile = 1;
     
        
        while(!exist)
        {
            //Input file txt
            System.out.println("Masukkan Nama File(.txt) : ");
            String fileName = scan.nextLine();
            File fileLoc = new File("C:\\Users\\ANDIKA YUDHA RIYANTO\\Documents\\GitHub\\APPL1\\"
                    + "WEEK 2\\CopyingAFile\\src\\copyingafile\\" + fileName + ".txt");
          
            try{
                Scanner input = new Scanner(fileLoc);
               
            // Print file 
                
                 while(input.hasNext()){
                        System.out.println("Baris " + barisFile + " : "+
                        input.nextLine());
                        barisFile += 1 ;
                }

            }
            catch (FileNotFoundException e){
                System.out.println("File tidak ditemukan " + e + "\n");
            }
    
        }
       
      
       
    }
}