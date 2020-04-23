import java.util.Scanner;
public class twoQuestions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstQuestion;
        String secondQuestion;
        System.out.println("TWO QUESTIONS!");
        System.out.println("Think of an object, and I'll try to guess it.");
        System.out.println("Question 1) Is it animal, vegetable, or mineral?");
        firstQuestion = scan.next();
        if(firstQuestion.equals("animal"))
        {
            System.out.println("Question 2) Is it bigger than a breadbox?");
            secondQuestion = scan.next();
            if(secondQuestion.equals("yes")){
                System.out.println("My guess is that you are thinking of a moose.");
                System.out.println("I would ask you if I'm right, but I don't really care.");
            }
            else if(secondQuestion.equals("no")){
                System.out.println("My guess is that you are thinking of a squirrel.");
                System.out.println("I would ask you if I'm right, but I don't really care.");
            }
            else{
                System.out.println("Has to be either yes or no");
            }
        }
        else if(firstQuestion.equals("vegetable"))
        {
            System.out.println("Question 2) Is it bigger than a breadbox?");
            secondQuestion = scan.next();
            if(secondQuestion.equals("yes")){
                System.out.println("My guess is that you are thinking of a watermelon.");
                System.out.println("I would ask you if I'm right, but I don't really care.");
            }
            else if(secondQuestion.equals("no")){
                System.out.println("My guess is that you are thinking of a carrot.");
                System.out.println("I would ask you if I'm right, but I don't really care.");
            }
            else{
                System.out.println("Has to be either yes or no");
            }
        }
        else if(firstQuestion.equals("mineral"))
        {
            System.out.println("Question 2) Is it bigger than a breadbox?");
            secondQuestion = scan.next();
            if(secondQuestion.equals("yes")){
                System.out.println("My guess is that you are thinking of a Camaro.");
                System.out.println("I would ask you if I'm right, but I don't really care.");
            }
            else if(secondQuestion.equals("no")){
                System.out.println("My guess is that you are thinking of a paper clip.");
                System.out.println("I would ask you if I'm right, but I don't really care.");
            }
            else{
                System.out.println("Has to be either yes or no");
            }
        }
        else 
        {
            System.out.println("Has to be either animal, vegetable or mineral");
        }
    }
}   