import java.util.Random;        
public class dice {
    public static void main(String[] args) {
        Random r = new Random();
        int roll1 = r.nextInt(6);
        int roll2 = r.nextInt(6);
        // We are now going to modify this to keep rolling until we get doubles i.e. dice 1 = dice 2
        System.out.println("HERE COME THE DICE");
        System.out.println("Roll #1 " + roll1);
        System.out.println("Roll #2 " + roll2);
        System.out.println("The total is " + (roll1 + roll2));
        while(roll1 != roll2){
        roll1 = r.nextInt(6);
        roll2 = r.nextInt(6);
        System.out.println("Roll #1 " + roll1);
        System.out.println("Roll #2 " + roll2);
        System.out.println("The total is " + (roll1 + roll2));
        }

    }
}
//Here is the original code
/*
import java.util.Random;        
public class dice {
    public static void main(String[] args) {
        Random r = new Random();
        int roll1 = r.nextInt(6);
        int roll2 = r.nextInt(6);
        System.out.println("HERE COME THE DICE");
        System.out.println("Roll #1 " + roll1);
        System.out.println("Roll #2 " + roll2);
        System.out.println("The total is " + (roll1 + roll2));

    }
}
*/