import java.util.Scanner;

public class parallelArrays {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		String [] lastNames = {"Mitchell", "Ortiz", "Luu", "Zimmerman", "Brooks"};
		double [] gpa = {99.5, 78.5, 95.6, 96.8, 82.7};
		int [] studentID = {1234, 2134, 4321, 3421, 3241};
		
		System.out.println("Values: ");
		for ( int i=0; i < lastNames.length; i++) {
			System.out.println("\t" + lastNames[i] + " " + gpa[i] + " " + studentID[i]);
		}

		System.out.println("ID Number to find: ");
		
		int idNumber = scan.nextInt();
		
		for(int i = 0; i < studentID.length; i++) {
			if(idNumber == studentID[i]) {
				System.out.println("Found in slot " + i);
				System.out.println("Name: " + lastNames[i]);
				System.out.println("Average: " + gpa[i]);
				System.out.println("ID: " + idNumber);
			}
		}
	}
}

