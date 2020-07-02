import java.util.Scanner;
import java.io.*;

public class readingFiles {
	public static void main (String [] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Open which file: ");
		String fileName = scanner.next();
		try {
			File file = new File (fileName);
			Scanner scan = new Scanner (file);
			while(scan.hasNext()){
				System.out.println(scan.nextLine());
			}
		}
		catch (FileNotFoundException e){
			e.printStackTrace(); 
		}
	}
}
