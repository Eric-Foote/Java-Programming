public class numberPuzzlesOne {
	public static void main (String args[]){
		int sum;
		int difference;
		final int expected_Sum = 60;
		final int  expected_Difference = 14;

		for(int i=10; i<=100; i++){
			for(int j=10; j<=100; j++){
				sum = i+j;
				difference = i-j;
				if(sum == expected_Sum && difference == expected_Difference){
					System.out.println(i + " " + j);
				}
			}
		}
	}
}

