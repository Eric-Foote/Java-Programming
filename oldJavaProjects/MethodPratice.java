import java.util.*;
public class MethodPratice {
    public static void main(String[] args){
       int maxnumber, addition, num1, num2;
       Scanner scan = new Scanner(System.in);
       System.out.println("Imput 2 numbers and it will be added up and then we will figure out which number is greater");
       System.out.println("Number 1: ");
       num1= scan.nextInt();
       System.out.println("Number 2: ");
       num2= scan.nextInt();
       maxnumber = max(num1,num2);
       System.out.println("The max number is " + maxnumber);
       addition = add(num1,num2);
       System.out.println("The sum of the 2 number is " + addition);
    }
    
    public static int max(int num1, int num2){
    int result;
    if (num1 > num2)
        result = num1;
    else 
        result = num2;
    return result;
    }
    
    public static int add(int num1, int num2){
    int result;
    result = num1+num2;
    return result;
    }
}
