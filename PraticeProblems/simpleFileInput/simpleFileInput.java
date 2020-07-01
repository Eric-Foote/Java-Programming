import java.io.*;
import java.util.Scanner;

public class simpleFileInput {
	public static void main (String [] args) {
		System.out.println("Using my psychic powers (aided by reading data from the file), I have determined that your name is ");
		try {
			File file = new File ("name.txt");
		       	Scanner reader = new Scanner(file);
			while (reader.hasNextLine()) {
			String name = reader.nextLine();
			System.out.print(name + " ");
			}
		System.out.println();
		reader.close();
		}
		catch (FileNotFoundException e) {
		e.printStackTrace();
		}
	}
}

