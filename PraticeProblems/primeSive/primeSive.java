import java.util.Scanner;
public class primeSive {
    public static boolean isPrime(int n)
    {
        if(n % n == 1 && n % 1 == 0)
        {
            return true;
        }
        else 
            return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        for (int i = 0; i <= n; i++)
        {
            if(isPrime(i))
            {
                System.out.println(i + " <");
            }
            else
                System.out.println(i);
        }

    }
}