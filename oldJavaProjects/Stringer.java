package stringer;
import java.util.Scanner;
public class Stringer {

    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    String word1 = new String ();
    String word2 = new String ();
    String word3 = new String ();
    System.out.println("Enter Three Words:");
    word1 = scan.nextLine();
    word2 = scan.nextLine();
    word3 = scan.nextLine();
    int result; 
          result  = word1.compareTo(word2); 
    int result2;
        result2 = word1.compareTo(word3);
    if (result > 1){
          if 
           (result2 > 1)
            System.out.println(word2 + " is the middle word");}
    else 
        { if (result < 1)
            if (result2 > 1)
                System.out.println(word1 + " is the middle word");}
            }
    
  
}

