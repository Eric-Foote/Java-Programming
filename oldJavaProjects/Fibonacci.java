//Author: Eric Foote                                                            Student#: 3502094
//
// CS 1083

//Displays the power of a recurive algorithm and how it relates to mathematical models
public class Fibonacci {
    public static void main(String[] args) {
        int res = fib(4);
        System.out.println("Back to main " + res);
    }
    public static int fib(int n){
        if ((n == 0) || (n == 1)) //this is the base case
        {
            System.out.println(" 0 or 1 is: " + n);
            return n;
        }
        else //this is the recursive case
        {
            System.out.println(" else: " + n);
            return fib(n-1) + fib(n-2); 
        }
            
    }
}
