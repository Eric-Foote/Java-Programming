import java.util.Scanner;

class Student {
	String name;
	int grade;
	double average;
}

public class aLittleDatabaseIsShorterWithALoop {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		Student student [] = new Student [3];
		student[0] = new Student();
		student[1] = new Student();
		student[2] = new Student();
		for (int i = 0; i < student.length; i++) {
			System.out.println("Enter student " + (i+1) + "'s name: ");
			student[i].name = scan.next();
			System.out.println("Enter student " + (i+1) + "'s grade: ");
			student[i].grade = scan.nextInt();
			System.out.println("Entr student " + (i+1) + "'s average: ");
			student[i].average = scan.nextDouble();
		}
		System.out.println("The names are: " + student[0].name + " " + student[1].name + " " + student[2].name);
		System.out.println("The grades are: " + student[0].grade + " " + student[1].grade + " " + student[2].grade);        
		System.out.println("The averages are: " + student[0].average + " " + student[1].average + " " + student[2].average);
	}
}
