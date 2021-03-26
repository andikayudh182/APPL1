
package throwingexceptions;
// **************************************************************** 
// MathUtils.java 
// Andika Yudha Riyanto - 191524034
// D4-2B Teknik Informatika
// Politeknik Negeri Bandung 
// Provides static mathematical utility functions. 

// **************************************************************** 
public class MathUtils 
{ 
 //------------------------------------------------------------- 
 // Returns the factorial of the argument given 
 //------------------------------------------------------------- 
 public static int factorial(int n) 
 { 
      if(n<0 || n>16){
       throw new IllegalArgumentException ("Tidak bisa diproses karena input  kurang dari nol atau lebih dari 16");
      }
        int fac = 1; 
        for (int i=n; i>0; i--) 
       
        fac *= i; 
       
        return fac; 
    } 
}