import java.util.Scanner;           
public class countingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Count to: ");
        int count = scan.nextInt();
        for(int i = 0; i <= count; i++)
        {
            System.out.println(i);
        }
        
    }
}