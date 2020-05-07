import java.util.Scanner;
import java.lang.Math;
public class calculator {
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
      // going to use a dynamic programming approach
        int oprand1 = (int) operand1;
        int result[] = {0};
        if(operand1 >= 0)
        {
            result[0] = 1;
        }
        for (int i = 1; i <= operand1; i++) 
        {
            result[i] = i * result[i - 1];
        }
    return result[(int) operand1];
    }
    
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String statement;
        double operand1;
        String operation;
        double operand2;
        //https://stackoverflow.com/questions/12524243/how-do-i-make-java-register-a-string-input-with-spaces source for the fix
        statement = scan.nextLine(); // this will read the whole line of input rather then the first character only
        statement = statement.replaceAll("\\s", ""); //this should replace all the spaces
        //System.out.println(statement.length()); these statements have length 3
        operand1 = Double.valueOf(Character.toString(statement.charAt(0))); // cast the first piece of the input string as a double
        while(operand1 != 0){
            if(statement.length() == 3){
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
                if(operation.equals("!"))
                {
                System.out.println(factorial(operand1));
                }

            }
            statement = scan.nextLine(); // this will read the whole line of input rather then the first character only
            statement = statement.replaceAll("\\s", ""); //this should replace all the spaces 
            operand1 = Double.valueOf(Character.toString(statement.charAt(0))); // cast the first piece of the input string as a double
    }
}
}
