import java.io.*;
import java.util.Scanner;

class Dog {
	String breed;
	int age;
	double weight;
}

public class gettingDataFromAFile{
	public static void main (String [] args){
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		Scanner scan = new Scanner (System.in);
		String fileName;
		System.out.println("Which file to open: ");
		fileName = scan.next();
		File file = new File(fileName);
		if(file.exists()) {
			System.out.println("Reading data from " + fileName);
			}
		else
			{
			System.out.println("File does not exist please create a file");
			}
		try {
		Scanner reader = new Scanner(file);
			dog1.breed = reader.next();
			dog1.age = reader.nextInt();
			dog1.weight = reader.nextDouble();
			dog2.breed = reader.next();
			dog2.age = reader.nextInt();
			dog2.weight = reader.nextDouble();
			reader.close();
		}
		catch (FileNotFoundException e) {
		e.printStackTrace();
		}
		System.out.println("First dog: " + dog1.breed + " " +  dog1.age + " "  + dog1.weight);
		System.out.println("Second dog: " + dog2.breed + " " +  dog2.age + " " +  dog2.weight);	
	}
}

