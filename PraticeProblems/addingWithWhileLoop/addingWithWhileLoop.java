import java.util.Scanner;
public class addingWithWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input;
        int sum = 0;
        System.out.println("I will add up the numbers you give me");
        System.out.println("Number: " );
        input = scan.nextInt();
        while(input !=0)
        {
            sum = sum + input;
            System.out.println("The total so far is " + sum);
            System.out.println("Number: " );
            input = scan.nextInt();
        }
        System.out.println("The total is " + sum);
    }
}