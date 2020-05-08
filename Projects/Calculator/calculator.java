import java.util.Scanner;
import java.lang.Math;
public class calculator {
    // these functions are fine we just need to find an easier method to parsing the input string to give us variable length numbers
    
    public static double addition(double operand1, double operand2)
    {
        return operand1 + operand2;
    }
    public static double subtraction(double operand1, double operand2)
    {
        return operand1 - operand2;
    }
    public static double multiplication(double operand1, double operand2)
    {
        return operand1 * operand2;
    }
    public static double division(double operand1, double operand2)
    {
        if(operand2 == 0)
        {
            System.out.println("Can't divide by zero");
            return 0;
        }
        return operand1 / operand2;
    }
    public static double exponents(double operand1, double operand2)
    {
        return Math.pow(operand1, operand2);
    }
    public static int modulous (double operand1, double operand2)
    {
        return (int) operand1 % (int) operand2;
    }
    public static double negation(double operand1)
    {
        return -operand1;
    }
    public static int factorial(double operand1) // doesnt seem to work right now? Going to go back to my algorithmics notes 
    {
      int factorial = 1;
      int operand = (int)operand1; //cast to an integer
      for(int i = 1; i <= operand; i++){
        factorial = factorial*i; 
      }
      return factorial;
        
      /* Dont know why dynamic programming is not working so regular for loop instead 
       // going to use a dynamic programming approach
        int result[] = {0};
        if(operand1 == 0)
        {
            result[0] = 1;
        }
        for (int i = 1; i <= operand1; i++) 
        {
            result[i] = i * result[i - 1];
        }
    return result[(int) operand1];
*/    
    }
    public static double root(double operand1, double operand2)  
    { 
     return Math.pow(operand1, 1/operand2); //this will give us a close enough answer for this kinda calculator 
    }

    /*
    I still need to implement: 
    1) error messages
    2) Handling of trig functions
    3) Converting between degrees and radians
    4) Some sort of help features
    5) Using the previous result in the next calculation
    6) The ability to store and recall results
    7) Rounding
    8) Logs
    9) Converting between base 10 and binary
    I am going to come back to this later on and work on it
    */
    
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        double operand1 = scan.nextDouble();
        if(operand1 == 0) 
        {
            return; //closes the program outright
        }
        String operation = scan.next();
        if(operation.equals("--"))
        {
        System.out.println(negation(operand1));
        operand1 = scan.nextDouble();
        operation = scan.next();
        }
        if(operation.equals("!"))
        {
        System.out.println(factorial(operand1));
        operand1 = scan.nextDouble();
        operation = scan.next();
        }
        if(operation.equals("sqrt"))
        {
        System.out.println(root(operand1,2));
        operand1 = scan.nextDouble();
        operation = scan.next();
        }
        double operand2 = scan.nextDouble();
        //String statement = scan.next();
        //String value1[] = statement.split("^([0-9])"); // this should give us all the numbers at the beginning
        //String value2[] = statement.split("$[0-9]"); // this should give us the operation that needs to be performed 
        //String op[] = statement.split("[^0-9]"); // this should give us the numbers at the end
 
      // String operand1 = value1.toString();
      // String operand2 = value2.toString();
      // String operation = op.toString();

        while(operand1 != 0) 
        {
            if(operation.equals("+"))
                {
                System.out.println(addition(operand1, operand2));
                }
                else if(operation.equals("-"))
                {
                System.out.println(subtraction(operand1, operand2));
                }
                else if(operation.equals("*"))
                {
                System.out.println(multiplication(operand1, operand2));
                }
                else if(operation.equals("/"))
                {
                System.out.println(division(operand1, operand2));   
                }
                else if(operation.equals("^"))
                {
                System.out.println(exponents(operand1, operand2));
                }
                else if(operation.equals("%"))
                {
                System.out.println(modulous(operand1, operand2));
                }
                else if(operation.equals("root"))
                {
                System.out.println(root(operand1, operand2));
                }
                operand1 = scan.nextDouble();
                operation = scan.next();
                if(operation.equals("--"))
                {
                System.out.println(negation(operand1));
                operand1 = scan.nextDouble();
                operation = scan.next();
                }
                if(operation.equals("!"))
                {
                System.out.println(factorial(operand1));
                operand1 = scan.nextDouble();
                operation = scan.next();
                }
                if(operation.equals("sqrt"))
                {
                System.out.println(root(operand1,2));
                operand1 = scan.nextDouble();
                operation = scan.next();
                }
                operand2 = scan.nextDouble();
        }
        /*
        Scanner scan = new Scanner(System.in);
        String statement;
        double operand1;
        String operation;
        double operand2;
        //https://stackoverflow.com/questions/12524243/how-do-i-make-java-register-a-string-input-with-spaces source for the fix
        statement = scan.nextLine(); // this will read the whole line of input rather then the first character only
        statement = statement.replaceAll("\\s", ""); //this should replace all the spaces
        System.out.println(statement.length()); 
        operand1 = Double.valueOf(Character.toString(statement.charAt(0))); // cast the first piece of the input string as a double
        while(operand1 != 0){
            if(statement.length() == 3){ // the problem is that we can currently only do addition with just 1-9
                operand1 = Double.valueOf(Character.toString(statement.charAt(0))); // cast the first piece of the input string as a double
                operation =  Character.toString(statement.charAt(1)); // cast the operand as a string 
                operand2 = Double.valueOf(Character.toString(statement.charAt(2)));; // cast the third piece of input string as a double
                if(operation.equals("+"))
                {
                System.out.println(addition(operand1, operand2));
                }
                else if(operation.equals("-"))
                {
                System.out.println(subtraction(operand1, operand2));
                }
                else if(operation.equals("*"))
                {
                System.out.println(multiplication(operand1, operand2));
                }
                else if(operation.equals("/"))
                {
                System.out.println(division(operand1, operand2));   
                }
                else if(operation.equals("^"))
                {
                System.out.println(exponents(operand1, operand2));
                }
                else if(operation.equals("%"))
                {
                System.out.println(modulous(operand1, operand2));
                }
            }
        
            if(statement.length() == 2) 
            {
                operand1 = Double.valueOf(Character.toString(statement.charAt(0))); // cast the first piece of the input string as a double
                operation =  Character.toString(statement.charAt(1)); // cast the operand as a string
                if(operation.equals("-"))
                {
                System.out.println(negation(operand1));
                }
                else if(operation.equals("!"))
                {
                System.out.println(factorial(operand1));
                }
            }

            if(statement.length() == 5)
            {
                operand1 = Double.valueOf(Character.toString(statement.charAt(0))); // cast the first piece of the input string as a double
                operation =  statement.substring(1, 4); // cast the operand as a string 
                 if(operation.equals("sqrt"))
                {
                System.out.println(root(operand1,2));
                }
            }

            if(statement.length() == 6)
            {
                operand1 = Double.valueOf(Character.toString(statement.charAt(0))); // cast the first piece of the input string as a double
                operation =  statement.substring(1, 4); // cast the operand as a string 
                operand2 = Double.valueOf(Character.toString(statement.charAt(5)));; // cast the third piece of input string as a double
                if(operation.equals("root"))
                {
                System.out.println(root(operand1, operand2));
                }
            }

            statement = scan.nextLine(); // this will read the whole line of input rather then the first character only
            statement = statement.replaceAll("\\s", ""); //this should replace all the spaces 
            operand1 = Double.valueOf(Character.toString(statement.charAt(0))); // cast the first piece of the input string as a double
    */
}
}
//}
