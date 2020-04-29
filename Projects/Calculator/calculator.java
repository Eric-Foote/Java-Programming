import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //https://stackoverflow.com/questions/12524243/how-do-i-make-java-register-a-string-input-with-spaces source for the fix
        String statement = scan.nextLine(); // this will read the whole line of input rather then the first character only
        statement = statement.replaceAll("\\s", ""); //this should replace all the spaces
        double operand1 = Double.valueOf(Character.toString(statement.charAt(0))); // cast the first piece of the input string as a double
        String operation =  Character.toString(statement.charAt(1)); // cast the operand as a string 
        double operand2 = Double.valueOf(Character.toString(statement.charAt(2)));; // cast the third piece of input string as a double
        System.out.println(operand1);
        System.out.println(operation);
        System.out.println(operand2);
    }
}