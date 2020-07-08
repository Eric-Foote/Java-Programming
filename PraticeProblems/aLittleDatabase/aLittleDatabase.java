import java.util.Scanner;

class Student {
	String name;
	int grade;
	double average;
}

public class aLittleDatabase {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		Student student[] = new Student[3];
		student[0] = new Student();
		student[1] = new Student();
		student[2] = new Student();
		System.out.println("Enter student 1's name: ");
		student[0].name = scan.next();
		System.out.println("Enter student 1's grade: ");
		student[0].grade = scan.nextInt();
		System.out.println("Enter student 1's average: ");
		student[0].average = scan.nextDouble();
		System.out.println("Enter student 2's name: ");
                student[1].name = scan.next();
                System.out.println("Enter student 2's grade: ");
                student[1].grade = scan.nextInt();
                System.out.println("Enter student 2's average: ");
                student[1].average = scan.nextDouble();
		System.out.println("Enter student 3's name: ");
                student[2].name = scan.next();
                System.out.println("Enter student 3's grade: ");
                student[2].grade = scan.nextInt();
                System.out.println("Enter student 3's average: ");
                student[2].average = scan.nextDouble();

		System.out.println("The names are: " + student[0].name + " " + student[1].name + " " + student[2].name);
	       	System.out.println("The grades are: " + student[0].grade + " " + student[1].grade + " " + student[2].grade);
       		System.out.println("The averages are: " + student[0].average + " " + student[1].average+ " "  + student[2].average);


	}
}

