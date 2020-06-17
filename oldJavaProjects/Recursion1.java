//Author: Eric Foote                                                            Student#:3502094
//
//CS 1083

//This program will demonstrate the basics of the stack and how it relates to a recursive algorithms output
public class Recursion1 {
    public static void main (String[] args){
        recur(5);
        System.out.println("back to main");
    }
static void recur (int y){
    if (y==0) //this is the base case
        System.out.println("Before recursion " + y);
    else recur(y-1); //this is the recursive case
        System.out.println("After recursion " + y);
}
}
