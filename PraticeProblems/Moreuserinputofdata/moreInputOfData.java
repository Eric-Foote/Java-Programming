import java.util.Scanner;
public class moreInputOfData {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName;
        String lastName;
        int year;
        int studentID;
        String login;
        Double GPA;
        System.out.println("Please enter the following information so I can sell it for a profit!");
        System.out.print("First name: ");
        firstName = scan.next();
        System.out.print("Last name: ");
        lastName = scan.next();
        System.out.println("Year: ");
        year = scan.nextInt();
        System.out.println("Student ID: ");
        studentID = scan.nextInt();
        System.out.println("Login: ");
        login = scan.next();
        System.out.println("GPA: ");
        GPA = scan.nextDouble();
        System.out.println();
        System.out.println("Your information: ");
        System.out.println("\tLogin: " + login);
        System.out.println("\tID: " + studentID);
        System.out.println("\tName: " + lastName + ", " + firstName);
        System.out.println("\tGPA: " + GPA);
        System.out.println("\tYear: " + year);

    }
}