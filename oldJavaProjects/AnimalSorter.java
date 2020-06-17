// Author: Eric Foote							Student#: 3502094
//
// CS 1083

//This program takes names of animals from a file sorts them alpahabetically and prints them to the screen and to a new file

package animalsorter;

import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class AnimalSorter {

public static String[] BubbleSort (String[] ani) {
    String temp = "null";
    for (int i=0; i< ani.length; i++)
    {
    for (int j=0; j <(ani.length-1-i); j++)
    {
    if (ani[j].compareToIgnoreCase (ani[j+1]) > 0)
    temp = ani[j];
    ani[j] = ani[j+1];
    ani[j+1] = temp;
    } 
    }
    return ani;
}   

public static void main(String[] args) throws FileNotFoundException, IOException {
        File myFile = new File ("Animals.txt");
        Scanner inputfile = new Scanner (myFile);
    	String [] Animal = new String [20];
        String AnimalString = Animal.toString();
        for (int i=0; i<=19; i++)
        {
            AnimalString = inputfile.nextLine();
            for (int j=0; j<=19; j++)
            {
                Animal[i] = AnimalString;
            }
            
        }
      // for (int j=0; j<=19; j++)
        //    {
          //     System.out.println(Animal[j]);
           // }
System.out.println("-----------------------------------------------------");
	String [] ArraySorted = BubbleSort(Animal);

	for (int k=0; k<=19; k++)
	{
		System.out.println(ArraySorted[k]);
	}

	
       
 
    }
    
}
