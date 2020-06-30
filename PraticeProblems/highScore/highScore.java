import java.io.*;
import java.util.Scanner;

public class highScore {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("You got a high score");
		System.out.println("Please enter your highscore");
		int score = scan.nextInt();
		System.out.println("Please enter your name");
		String name = scan.next();
	try {
		File file = new File ("score.txt");
		FileWriter fwriter = new FileWriter ("score.txt");
		if (file.createNewFile());
		fwriter.write(name + "\n");
		fwriter.write(score + "");
		fwriter.close();
	}
	catch (IOException e) {
		e.printStackTrace();
	}
	}
}

