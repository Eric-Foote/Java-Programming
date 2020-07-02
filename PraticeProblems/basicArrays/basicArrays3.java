import java.util.Random;

public class basicArrays3 {
	public static void main (String [] args) {
		Random r = new Random();
		int [] arr = new int[1000];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 10 + r.nextInt(100);
			System.out.print(arr[i] + "  ");
		}
	}
}
