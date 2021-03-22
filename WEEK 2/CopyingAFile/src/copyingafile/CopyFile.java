/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copyingafile;

/**
 *
 * @author ANDIKA YUDHA RIYANTO
 */
import java.io.*;
import java.util.Scanner;
import java.io.*;

import java.util.Scanner;
import java.io.*;
public class CopyFile{

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        Scanner input = null;
        boolean exist = false;
        File file;
        
        do{
            /*Get File Name*/
            System.out.println("Masukkan Alamat File : ");
            file = new File(scan.nextLine());
            /*Trying to Open File*/
            try{
                input = new Scanner(file);
                exist = true;
            }
            catch (FileNotFoundException e){
                System.out.println("File is not found " + e + "\n");
            }
        }while(!exist); //if the file doesn't exist, ask for another file name
        
        /*Print isi File*/
        int barisFile = 1;
        while(input.hasNext()){
            System.out.println("Baris " + barisFile + " : "+
                    input.nextLine());
            barisFile =+ 1 ;
        }
    }
}