import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class gradesInAnArrayAndAFile {
	public static void main (String [] args) {
		Random r = new Random();
		Scanner scanner = new Scanner(System.in);
		int[] grades = new int[5];
		System.out.println("Name (first last):");
		String firstName = scanner.next();
		String lastName = scanner.next();
		String name = firstName + " " + lastName;
		System.out.println("Filename: ");
		String fileName = scanner.next();
		System.out.println("Here are your randomly-selected grades (hope you pass):");
		for(int i = 0; i < grades.length; i++) {
			grades[i] = 1 + r.nextInt(100);
			System.out.println("Grade " + i + ": " + grades[i]);
		}
		try {
			File file = new File (fileName);
			if(file.createNewFile()){}
			FileWriter writer = new FileWriter(fileName);
			writer.write(name + "\n");
			for(int i = 0; i < grades.length; i++){
				writer.write(grades[i] + "  ");
			}
		writer.close();
		System.out.println("Data saved in " + "\"" +fileName + "\"");
		}
		catch (IOException e){
			e.printStackTrace();
		}
	}
}

