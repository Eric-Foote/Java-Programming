import java.util.Scanner;
public class compareToChallenge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String one;
        String two;
        int compare1to2;
        System.out.println("Give me a String");
        one = scan.next();
        System.out.println("Give me another String");
        two = scan.next();
        System.out.println("Comparing " + one + " with " + two + " produces ");
        compare1to2 = one.compareTo(two);
        System.out.println(compare1to2);
    }
}