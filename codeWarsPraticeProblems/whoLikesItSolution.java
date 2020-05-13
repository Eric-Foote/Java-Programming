/*
* You probably know the "like" system from Facebook and other pages. 
* People can "like" blog posts, pictures or other items. 
* We want to create the text that should be displayed next to such an item.
* Implement a function likes :: [String] -> String, which must take in input array, 
* containing the names of people who like an item. 
* It must return the display text as shown in the examples:
* likes {} // must be "no one likes this"
* likes {"Peter"} // must be "Peter likes this"
* likes {"Jacob", "Alex"} // must be "Jacob and Alex like this"
* likes {"Max", "John", "Mark"} // must be "Max, John and Mark like this"
* likes {"Alex", "Jacob", "Mark", "Max"} // must be "Alex, Jacob and 2 others like this"
* For 4 or more names, the number in and 2 others simply increases.
*/
public class whoLikesItSolution {
    public static String whoLikesIt(String[] names) {
        // this is a correct solution that was tested on the site the only things I needed to change was the spacing and formatting the output
        if (names.length == 0)
        {
            return "no one likes this";
        }
        else if (names.length == 1) 
        {
            return names[0] + " likes this";
        }
        else if (names.length == 2)
        {
            return names[0] + " and " + names[1] + " like this";
        }
        else if (names.length == 3)
        {
            return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        }
        else
        {
            return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others" + " like this";
        }
    }
    public static void main(String[] args) {
        String [] names0 = {};
        String [] names1 = {"Fred"};
        String [] names2 = {"Fred", "Bob"};
        String [] names3 = {"Fred", "Bob", "Joe"};
        String [] names4 = {"Fred", "Bob", "Joe", "Dog"};
        System.out.println(whoLikesIt(names0));
        System.out.println(whoLikesIt(names1));
        System.out.println(whoLikesIt(names2));
        System.out.println(whoLikesIt(names3));
        System.out.println(whoLikesIt(names4));
    }
}