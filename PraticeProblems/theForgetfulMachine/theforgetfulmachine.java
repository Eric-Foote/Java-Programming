import java.util.Scanner;
public class theforgetfulmachine {
    public static void main(String[] args) {
        java.util.Scanner scan = new Scanner(System.in);
        System.out.println("Give me a word");
        scan.next();
        System.out.println("Give me a second word");
        scan.next();
        System.out.println("Great, now your favourite number");
        scan.nextInt();
        System.out.println("And your second favourite number");
        scan.nextInt();
        System.out.println("Whew! Wasn't that fun");
    }
}