import java.util.Scanner;
import java.io.*;

public class summingThreeNumbersFromAFile {
	public static void main (String [] args) {
		int sum = 0;
		try {
			File file = new File("3nums.txt");
			Scanner scan = new Scanner (file);
			System.out.println("Reading numbers from file " + file.getName() + "... done\n");
			while (scan.hasNextInt()) {
				int num = scan.nextInt();
				System.out.print(num + " + ");
				sum = sum + num;
			}
			scan.close();
			System.out.print(" = " + sum + "\n");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

