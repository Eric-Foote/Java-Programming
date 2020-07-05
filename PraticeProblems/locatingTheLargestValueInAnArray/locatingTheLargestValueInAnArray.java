import java.util.Random;

public class locatingTheLargestValueInAnArray {
	public static void main (String [] args) { 
		Random r = new Random();
		int [] arr = new int[10];
		System.out.println("Array: ");
		for(int i = 0 ; i < arr.length; i++) { 
			arr[i] = 1 + r.nextInt(100);
			System.out.print(arr[i] + " ");
		}
		int highValue = 0;
		int location = 0;
		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i] >= arr[i+1]) { 
				if(highValue >= arr[i])
					highValue = highValue;
				else 
					highValue = arr[i];
			}
			else
				if(highValue >= arr[i])
					highValue = highValue;
				else
					highValue = arr[i+1];
		}
		System.out.println("\nThe largest value is " + highValue);

		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == highValue)
				System.out.println("It is in slot " + i);
		}
	}
}

