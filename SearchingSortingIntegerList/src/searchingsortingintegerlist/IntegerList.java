/*
IntegerList.java
Andika Yudha Riyanto - 191524034
D4-2B Teknik Informatika
Politeknik Negeri Bandung
 */
package searchingsortingintegerlist;

/**
 *
 * @author ANDIKA YUDHA RIYANTO
 */
import java.util.Scanner; 
public class IntegerList 
{ 
 int[] list; //values in the list 
 //------------------------------------------------------- 
 //create a list of the given size 
 //------------------------------------------------------- 
 public IntegerList(int size) 
 { 
    list = new int[size]; 
 } 
 //------------------------------------------------------- 
 //fill array with integers between 1 and 100, inclusive 
 //------------------------------------------------------- 
 public void randomize() 
 { 
    for (int i=0; i<list.length; i++) 
        list[i] = (int)(Math.random() * 100) + 1; 
 } 
 //------------------------------------------------------- 
 //print array elements with indices 
 //------------------------------------------------------- 
 public void print() 
 { 
    for (int i=0; i<list.length; i++) 
     System.out.println(i + ":\t" + list[i]); 
 } 
 //------------------------------------------------------- 
 //return the index of the first occurrence of target in the list. 
 //return -1 if target does not appear in the list 
 //------------------------------------------------------- 
 public int search(int target) 
 { 
    int location = -1; 
    for (int i=0; i<list.length && location == -1; i++) 
        if (list[i] == target) 
        location = i; 
    return location; 
 } 
 //------------------------------------------------------- 
 //sort the list into ascending order using the selection sort algorithm 
 //------------------------------------------------------- 
 public void selectionSort() 
 { 
    int minIndex; 
    for (int i=0; i < list.length-1; i++) 
    { 
 //find smallest element in list starting at location i 
        minIndex = i; 
        for (int j = i+1; j < list.length; j++) 
        if (list[j] < list[minIndex]) 
        minIndex = j; 
 //swap list[i] with smallest element 
        int temp = list[i]; 
        list[i] = list[minIndex]; 
        list[minIndex] = temp; 
        } 
    } 
 
 //add method replaceFirst that replace the first occurance of oldVal in the list with newVal.
    public void replaceFirst(int oldVal, int newVal){
        if(search(oldVal) != -1){
            list[search(oldVal)] = newVal ;
        }
    }
//add method replaceAll that replaces all occurrences of oldVal in the list with newVal.
    public void replaceAll(int oldVal, int newVal){
        for (int i = 0; i < list.length; i++){
            if(list[i] == oldVal ){
                list[i] = newVal;
            }
        }
    }
/*add method sortDecreasing that sorts the list into decreasing 
(instead of increasing) order. using  selection sort*/
    
    public void sortDecreasing(){
       int maxIndex;
       for (int i=0; i < list.length-1; i++)
       {
           //find smallest element in list starting at location i
           maxIndex = i;
           for (int j = i+1; j < list.length; j++)
           if (list[j] > list[maxIndex])
           maxIndex = j;
           //swap list[i] with smallest element
           int temp = list[i]; 
           list[i] = list[maxIndex];
           list[maxIndex] = temp;
       }
    }
/* add method binarySearchD that uses a binary search to find the target assuming 
the list is sorted in decreasing order */
    
     public int binarySearchD (int target){
        int left = 0;
        int right = list.length - 1;

        while (left <= right) {
             int mid = left + (right - left)/2;   
            if (list[mid] < target) {
                right = mid - 1;
            } else if (list[mid] > target) {
                left  = mid + 1;
            } else {
                return mid;
            }
        }
        
        return -1;
    }
}

