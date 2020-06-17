import java.util.*;
public class Age {
    /*
    Reads the user's age and prints comments accordingly.
    */
    
    public static void main(String[] args){
        final int MINOR = 21;
        int age;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the Age: ");
        age = scan.nextInt();
        
        System.out.println("You entered: " + age);
        
        if (age < MINOR){
            System.out.println("Youth is a wonderful thing. Enjoy.");
        }
        else{
            System.out.println("Age is a state of mind.");
        }
            
                
    }
}
