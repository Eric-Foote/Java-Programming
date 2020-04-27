import java.util.Scanner;
public class alphabeticalOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String lastName;
        System.out.println("What's your last name? ");
        lastName = scan.next();
        /* This gives us some values when we compare it with F
        System.out.println(firstLetterLastName.compareToIgnoreCase("a")); //5
        System.out.println(firstLetterLastName.compareToIgnoreCase("b")); //4
        System.out.println(firstLetterLastName.compareToIgnoreCase("c")); //3 
        System.out.println(firstLetterLastName.compareToIgnoreCase("d")); //2 
        System.out.println(firstLetterLastName.compareToIgnoreCase("e")); //1 
        System.out.println(firstLetterLastName.compareToIgnoreCase("f")); //0
        System.out.println(firstLetterLastName.compareToIgnoreCase("g")); //-1
        System.out.println(firstLetterLastName.compareToIgnoreCase("h")); //-2
        System.out.println(firstLetterLastName.compareToIgnoreCase("i")); //-3 
        System.out.println(firstLetterLastName.compareToIgnoreCase("j")); //-4
        System.out.println(firstLetterLastName.compareToIgnoreCase("k")); //-5 
        System.out.println(firstLetterLastName.compareToIgnoreCase("l")); //-6
        System.out.println(firstLetterLastName.compareToIgnoreCase("m")); //-7
        System.out.println(firstLetterLastName.compareToIgnoreCase("n")); //-8
        System.out.println(firstLetterLastName.compareToIgnoreCase("o")); //-9
        System.out.println(firstLetterLastName.compareToIgnoreCase("p")); //-10
        System.out.println(firstLetterLastName.compareToIgnoreCase("q")); //-11
        System.out.println(firstLetterLastName.compareToIgnoreCase("r")); //-12
        System.out.println(firstLetterLastName.compareToIgnoreCase("s")); //-13
        System.out.println(firstLetterLastName.compareToIgnoreCase("t")); //-14
        System.out.println(firstLetterLastName.compareToIgnoreCase("u")); //-15
        System.out.println(firstLetterLastName.compareToIgnoreCase("v")); //-16
        System.out.println(firstLetterLastName.compareToIgnoreCase("w")); //-17
        System.out.println(firstLetterLastName.compareToIgnoreCase("x")); //-18
        System.out.println(firstLetterLastName.compareToIgnoreCase("y")); //-19
        System.out.println(firstLetterLastName.compareToIgnoreCase("z")); //-20
        */
        if(lastName.compareToIgnoreCase("Carswell") >= 0)
        {
            System.out.println("You don't have to wait long");
        }
        else if (lastName.compareToIgnoreCase("Jones") < -5)
        {
            System.out.println("That's not too bad");
        }
        else if (lastName.compareToIgnoreCase("Smith") < -10)
        {
            System.out.println("Looks like a bit of a wait");
        }
        else if (lastName.compareToIgnoreCase("Young") < -15)
        {
            System.out.println("It's going to be awhile");
        }
        else 
        {
            System.out.println("Not going anywhere for awhile");
        }
    }
}