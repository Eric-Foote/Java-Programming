// Author: Eric Foote                                                           Student#:3502094
//
// CS 1083

// This program uses array lists to replicate what was done in part a

package ex1;
import java.util.Random;
import java.util.ArrayList; // these 2 imported java utlites are needed for both the array lists and random integers
public class Ex1PartB {
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
        ArrayList <Integer> list = new ArrayList<>(); //creates an array list that generates
        
        Random random = new Random ();
           for (int k = 0; k < 10; k++)
        {
             int r = random.nextInt(60);
              list.add(r); //this takes all the random integers and put them into an array list
        }
        System.out.print("The Original Array is: ");
           for (int index = 0; index < list.size(); index++)
        {
            System.out.print(list.get(index) + " ");
        }
    int[] array = new int[10];
    for (int index = 0; index < array.length; index++)
    {
        array[index] = list.get(index); //this was needed to take all the random integers from the list and put it in the array
    }
      System.out.println("");
    int arraysorted [];
        arraysorted = bubbleArray(array);
        System.out.print("The Sorted Array is: ");
        for (int index = 0; index <= array.length -1; index++)
            System.out.print(arraysorted[index] + " ");  
    }
    
}
