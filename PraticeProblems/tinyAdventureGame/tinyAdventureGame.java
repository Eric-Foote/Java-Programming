import java.util.Scanner;
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
            System.out.println("Upstairs you see a hallway. At the end of the hallway is the master \"bedroom.\". There is also a \"bathroom\" off the hallway. Where would you like to go?")
            secondChoice = scan.Next();
            if(secondChoice.equals("bedroom"))
            {

            }
            else if(secondChoice.equals("bathroom"))
            {

            }
            else 
            {
                System.out.println("Has to be either the bedroom or bathroom");
            }
        }
        else if(firstChoice.equals("kitchen"))
        {

        }
        else 
        {
            System.out.println("Has to be either the upstairs of kitchen");
        }
    }
}