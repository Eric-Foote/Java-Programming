import java.util.Scanner; 
public class addingWithForLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number:" );
        int givenNumber = scan.nextInt();
        int sum = 0;
        for(int i = 1; i<=givenNumber;i++)
        {
            System.out.print(i + " ");
            sum += i;
        } 
        System.out.println("\nThe sum is: " + sum);
    }
}   