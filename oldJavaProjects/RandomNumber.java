import java.util.*;
public class RandomNumber {
    /*
    Generates random numbers in various integers.
    */
    
    public static void main (String[] args){
        Random generator = new Random();
        int num1;
        float num2;
        
        num1 = generator.nextInt();
        System.out.println("A random integer: " + num1);
        
        num1 = generator.nextInt(10) + 1;
        System.out.println("A random integer between 1-10: " + num1);
        
        num1 = generator.nextInt(15) + 20;
        System.out.println("A random integer between 15-34: " + num1);
        
        num1 = generator.nextInt(20) - 10;
        System.out.println("A random integer between -10-9: " + num1);
        
        num2 = generator.nextFloat();
        System.out.println("A random float between 0-1: " + num2);
        
        num2 = generator.nextFloat() + 6; //0.0 to 5.9999
        num1 = (int)num2 + 1;
        System.out.println("From 1 to 6: " + num1);
        
        
        
    }
}
