import java.io.*;
import java.util.Scanner;

public class summingSeveralNumbersFromAnyFile {
	public static void main (String [] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Which file would you like to read numbers from: ");
		String fileName = scanner.next();
		try {
			File file = new File(fileName);
			Scanner scan = new Scanner(file);
			int sum = 0;
			int num = 0;
			System.out.println("Reading numbers from \"" + file.getName() +  "\"");
		       	while(scan.hasNext()){
			num = scan.nextInt();
			System.out.print(num + " ");
			sum = sum + num;
			}
			System.out.println("Total is " + sum);
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
}

				
