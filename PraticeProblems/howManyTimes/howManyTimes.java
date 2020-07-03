import java.util.Random;
import java.util.Scanner;

public class howManyTimes {
	public static void main (String [] args) {
		Random r = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.println("Array: ");
		int [] arr = new int[10];
	       	for(int i = 0; i < arr.length; i++) {
			arr[i] = 1 + r.nextInt(50);
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nValue to find: ");
		int valueToFind = scan.nextInt();
		int counter = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == valueToFind)
				counter++;
		}
		System.out.println(valueToFind + " was found " + counter + " times");
	}
}

