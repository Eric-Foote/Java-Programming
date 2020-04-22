import java.util.Scanner;
public class aLittleQuiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String yesOrNo;
        int answer;
        int score = 0;
        System.out.println("Are you ready for the quiz? ");
        yesOrNo = scan.next();
     
            System.out.println("Okay, here it comes!");
            System.out.println("Q1) What is the capital of Alaska?\n\t 1) Melbourne \n\t 2) Anchorage \n\t 3) Juneau");
            answer = scan.nextInt();
            if(answer == 3)
            {
                System.out.println("That's right!");
                score++;
            }
            else
            {
                System.out.println("That's Wrong the answer is 3");
            }
            System.out.println("Q2) Can you store the value \"cat\" in a variable of type int? \n\t 1) Yes \n\t 2) No");
            answer = scan.nextInt();
            if(answer == 2){
                System.out.println("That's right!");
                score++;
            }
            else
            {
                System.out.println("Sorry, \"cat\" is a string. Integers can only store numbers");
            }
            System.out.println("Q3) What is the result of 9+(6/3)? \n\t 1) 5 \n\t 2) 11 \n\t 3)15/3");
            answer = scan.nextInt();
            if(answer == 2){
                System.out.println("That's right!");
                score++;
            }
            else{
                System.out.println("Sorry remember orders of operations 9+2 is 11");
            }
            System.out.println("Overall, you got " + score + " out of 3 correct. \n Thanks for playing!");
        
        
    }
}