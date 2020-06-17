// Author: Eric Foote                                   Student #: 3502094
//
// CS 1083      

// This program generates 10 random integers and sorts them in an array using the bubble sort technique

package ex1;
import java.util.Random;
public class Ex1PartA {
    public static int[] bubbleArray(int[] arr) //this will take the array that was generated in main, sort it and spit it back out.
    {
    int temp;
    for (int i = 0; i<= arr.length-1; i++){
    for (int j = 0; j < arr.length-1-i; j++) {
        if (arr[j] > arr[j+1]){
            temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
    }    
    }
    return arr; 
    }
    public static void main(String[] args) {
        Random random = new Random ();
        int [] array = new int[10];
        for (int k = 0; k <= array.length -1; k++){
            array[k] = random.nextInt(60); //for each of the 10 entries of the array a random number from 1-60 will be entered
        }
       System.out.print("The Original Array is: ");
        for (int index = 0; index <= array.length -1; index ++)
           System.out.print(array[index] + " "); //this prints the regular array
        System.out.println();
        int arraysorted [];
        arraysorted = bubbleArray(array); //this sends the array to the bubble sorting algorithim
        System.out.print("The Sorted Array is: ");
        for (int index = 0; index <= array.length -1; index++)
            System.out.print(arraysorted[index] + " "); //this prints the sorted array
        
    
    
    
    
    
    
    
    }
    
}
