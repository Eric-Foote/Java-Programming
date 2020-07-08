import java.util.Scanner;
import java.io.*;

class Person {
	String name;
	int age;
}

public class gettingMoreDataFromAFile {
	public static void main (String [] args) {
		Person person[] = new Person[5];
		person[0] = new Person();
		person[1] = new Person();
		person[2] = new Person();
		person[3] = new Person();
		person[4] = new Person();
		Scanner scan = new Scanner (System.in);
		System.out.println("Which file to open: ");
		String fileName = scan.next();
		System.out.println("Reading data from " + fileName);
		try{
			File file = new File(fileName);
			Scanner reader = new Scanner(file);
			person[0].name = scan.next();
			person[0].age = scan.nextInt();
			person[1].name = scan.next();
                        person[1].age = scan.nextInt();
			person[2].name = scan.next();
                        person[2].age = scan.nextInt();
			person[3].name = scan.next();
                        person[3].age = scan.nextInt();
			person[4].name = scan.next();
                        person[4].age = scan.nextInt();
			reader.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		for(int i = 0; i < person.length; i++) {
			System.out.println(person[i].name + " is " + person[i].age);
		}
	}
}


