import java.util.Random;
import java.util.Scanner;

public class isItThereOrNot {
	public static void main (String[] args){ 
		Random r = new Random();
		Scanner scan = new Scanner(System.in);
		int [] arr = new int[10];
		System.out.println("Array: ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 1 + r.nextInt(50);
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nValue to find: ");
		int valueToFind = scan.nextInt();
		int counter = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == valueToFind){
				System.out.println(valueToFind + " is in the array.");
				break;
			}
			else
				counter++;
		}
		if(counter == (arr.length)) 
			System.out.println(valueToFind + " is not in the array.");
	}
}
