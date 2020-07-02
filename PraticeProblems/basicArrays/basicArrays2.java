import java.util.Random;

public class basicArrays2 {
	public static void main (String [] args) {
		Random r = new Random();
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i ++) {
			arr[i] = 1 + r.nextInt(100);
			System.out.println("Slot " + i + " contains a " + arr[i]);
		}
	}
}

