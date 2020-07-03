import java.util.Random;
import java.util.Scanner;

public class whereIsIt {
	public static void main (String [] args) {
	Random r = new Random();
	Scanner scan = new Scanner(System.in);
	int[] arr = new int[10];
	System.out.println("Array: ");
	for (int i = 0; i < arr.length; i++) { 
		arr[i] = 1 + r.nextInt(50);
		System.out.print(arr[i] + " ");
	}
	System.out.println("\nValue to find: ");
	int valueToFind = scan.nextInt();
	int counter = 0;
	for (int i = 0; i < arr.length; i++) {
		if(valueToFind == arr[i]) {
			System.out.println(arr[i] + " is in slot " + i);
		}
		else 
			counter++;
	}
	if(counter == arr.length)
		System.out.println(valueToFind + " is not in the array.");
	}
}

