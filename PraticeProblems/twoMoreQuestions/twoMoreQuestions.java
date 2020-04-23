import java.util.Scanner;
public class twoMoreQuestions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer1;
        String answer2;
        System.out.println("TWO MORE QUESTIONS");
        System.out.println("Think of something and I'll try to guess it!");
        System.out.println("Question 1) Does it stay inside or outside or both ");
        answer1 = scan.next();
        System.out.println("Question 2) Is it a living thing? ");
        answer2 = scan.next();
        if(answer1.equals("inside") && answer2.equals("yes"))
        {
            System.out.println("Then what else could you be thinking of besides a python");
        }
        if(answer1.equals("inside") && answer2.equals("no"))
        {
            System.out.println("Then what else could you be thinking of besides a shower curtain");
        }
        if(answer1.equals("outside") && answer2.equals("yes"))
        {
            System.out.println("Then what else could you be thinking of besides a bison");
        }
        if(answer1.equals("outside") && answer2.equals("no"))
        {
            System.out.println("Then what else could you be thinking of besides a billboard");
        }
        if(answer1.equals("both") && answer2.equals("yes"))
        {
            System.out.println("Then what else could you be thinking of besides a dog");
        }
        if(answer1.equals("both") && answer2.equals("no"))
        {
            System.out.println("Then what else could you be thinking of besides a cell phone");
        }
    }
}