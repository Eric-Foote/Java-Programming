public class StringMutation {
    public static void main(String[] args){
        String phrase = "Change is inevitable";
        String mutation1, mutation2, mutation3, mutation4;
        
        System.out.println("Original string: \"" + phrase +"\"");
        System.out.println("Length of the string: " + phrase.length());
        
        mutation1 = phrase.concat(" , except from vending machines.");
        mutation2 = mutation1.toUpperCase();
        mutation3 = mutation2.replace('E', 'X');
        mutation4 = mutation3.substring(3,30);
        
        // Print out each mutated string
        
        System.out.println("Mutation #1: " + mutation1);
        System.out.println("Mutation #2: " + mutation2);
        System.out.println("Mutation #3: " + mutation3);
        System.out.println("Mutation #4: " + mutation4);
        
        
        String str = "Space, the final frontier. ";
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.substring(7));
        System.out.println(str.toUpperCase());
        System.out.println(str.length());
        
        
        
    }
}
