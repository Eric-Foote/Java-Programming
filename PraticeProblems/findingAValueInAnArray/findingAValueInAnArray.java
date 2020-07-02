import java.util.Random;
import java.util.Scanner;

public class findingAValueInAnArray {
	public static void main (String [] args) {
		Random r = new Random();
		Scanner scan = new Scanner(System.in);
		int [] arr = new  int [10];
		System.out.print("Array: ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 1 + r.nextInt(50);
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nValue to find: ");
		int valueToFind = scan.nextInt();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == valueToFind){
				System.out.println(valueToFind + " is in the array");
			}
		}
	}
}

