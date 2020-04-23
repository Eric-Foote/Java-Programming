import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
public class tinyAdventureGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstChoice;
        String secondChoice;
        String thirdChoice;
        System.out.println("WELCOME TO ERIC'S TINY ADVENTURE");
        System.out.println("You are in a creepy house! Would you like to go \"upstairs\" or into the \"kitchen\"");
        firstChoice = scan.next();
        if(firstChoice.equals("upstairs"))
        {
            System.out.println("Upstairs you see a hallway. At the end of the hallway is the master \"bedroom.\". There is also a \"bathroom\" off the hallway. Where would you like to go?");
            secondChoice = scan.next();
            if(secondChoice.equals("bedroom"))
            {
                System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture. The bed is unmade. In the back of the room, the closet door is ajar. Would you like to open the door? (\"yes\" or \"no\")");
                thirdChoice = scan.next();
                if(thirdChoice.equals("yes"))
                {
                    System.out.println("YOU WIN... nothing");
                }
                else if(thirdChoice.equals("no"))
                {
                    System.out.println("Oh well... you leave");
                }
                else 
                {
                    System.out.println("Oh well you leave");
                }
            }
            else if(secondChoice.equals("bathroom"))
            {
                System.out.println("You are in a bathroom, with all the bathroom fixtures, the closet door is ajar. Would you like to open the door? (\"yes\" or \"no\")");
                thirdChoice = scan.next();
                if(thirdChoice.equals("yes"))
                {
                    System.out.println("YOU WIN... nothing");
                }
                else if(thirdChoice.equals("no"))
                {
                    System.out.println("Oh well... you leave");
                }
                else 
                {
                    System.out.println("Oh well you leave");
                }

            }
            else 
            {
                System.out.println("Has to be either the bedroom or bathroom");
            }
        }
        else if(firstChoice.equals("kitchen"))
        {
            System.out.println("There is a long countertop with dirty dishes everywhere. Off to one side there is, as you'd expect a refridgerator. You may open the \"refridgerator\" or look in a \"cabinet.\"");
            secondChoice = scan.next();
            if(secondChoice.equals("refridgerator"))
            {
                System.out.println("Inside the refrigerator you see food and stuff. It looks pretty nasty. Would you like to eat some of the food? (\"yes\" or \"no\")");
                thirdChoice = scan.next();
                if(thirdChoice.equals("yes"))
                {
                    System.out.println("Ehhhh it tasted better then you expected");
                }
                else if(thirdChoice.equals("no"))
                {
                    System.out.println("I guess you will never know how it tasted");
                }
                else 
                {
                    System.out.println("I guess you will never know how it tasted");
                }
            }
            else if(secondChoice.equals("cabinet"))
            {
                System.out.println("Inside the cabinet you see food and stuff. It looks pretty nasty. Would you like to eat some of the food? (\"yes\" or \"no\")");
                thirdChoice = scan.next();
                if(thirdChoice.equals("yes"))
                {
                    System.out.println("Ehhhh it tasted better then you expected");

                }
                else if(thirdChoice.equals("no"))
                {   
                    System.out.println("I guess you will never know how it tasted");

                }
                else 
                {
                    System.out.println("I guess you will never know how it tasted");
                }
            }
            else 
            {
                System.out.println("Has to be either refridgerator or cabinet")
            }
        }
        else 
        {
            System.out.println("Has to be either the upstairs of kitchen");
        }
    }
}