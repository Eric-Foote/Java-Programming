package finalexam;

import java.util.Scanner;

public class FinalExam {
public static int correctAnswers (String StudentAnswers[])
{
String[] answers = {"B", "D", "A", "A", "C", "A", "B", "A", "C", "D", "B", "C", "D", "A", "D", "C", "C", "B", "D", "A"};            
}
public static int wrongAnswers ()
{
    
}
public static int missedQuestions ()
        {
            
        }
public static boolean passedOrFailed (int correct)
{
    boolean result;
    if (correct >= 15)
         result = true;
    else result = false;
    return result;
            
}
    public static void main(String[] args) {
   System.out.println("Only enter A B C or D in capital letters");
   Scanner scan = new Scanner (System.in);
   String[] StudentExam = new String[21];
   for (int i = 1; i <= StudentExam.length - 1; i++)
   { 
       System.out.println("Question " + i + ":");
       StudentExam[i] = scan.nextLine();
        if (StudentExam[i] != "A" + "B" + "C" + "D")
        {
        System.out.println("Error: only A, B, C or D can be entered");
        System.out.println("Question " + i + ":");
        StudentExam[i] = scan.nextLine();
        }
        }
   correctAnswers(StudentExam);
       }
    }

        

}
