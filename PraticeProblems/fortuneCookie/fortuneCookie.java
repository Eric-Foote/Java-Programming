import java.util.Random;
public class fortuneCookie {
    public static void main(String[] args) {
        Random r = new Random();
        int x = 1+ r.nextInt(6); // this will give us the seed for the six fortunes
        int lotto1 = 1 + r.nextInt(55);
        int lotto2 = 1 + r.nextInt(55);
        int lotto3 = 1 + r.nextInt(55);
        int lotto4 = 1 + r.nextInt(55);
        int lotto5 = 1 + r.nextInt(55);
        int lotto6 = 1 + r.nextInt(55);
        if(x == 1)
        {
            System.out.println("Fortune cookie says: You will find happiness with new things\n" + lotto1 + " - " + lotto2 + " - " + lotto3 + " - " + lotto4 + " - " + lotto5 + " - " + lotto6 );
        }
        if(x == 2)
        {
            System.out.println("Fortune cookie says: You will find happiness with old things\n" + lotto1 + " - " + lotto2 + " - " + lotto3 + " - " + lotto4 + " - " + lotto5 + " - " + lotto6 );
        }
        if(x == 3)
        {
            System.out.println("Fortune cookie says: You will find happiness \n" + lotto1 + " - " + lotto2 + " - " + lotto3 + " - " + lotto4 + " - " + lotto5 + " - " + lotto6 );
        }
        if(x == 4)
        {
            System.out.println("Fortune cookie says: You will find things\n" + lotto1 + " - " + lotto2 + " - " + lotto3 + " - " + lotto4 + " - " + lotto5 + " - " + lotto6 );
        }
        if(x == 5)
        {
            System.out.println("Fortune cookie says: You will not things\n" + lotto1 + " - " + lotto2 + " - " + lotto3 + " - " + lotto4 + " - " + lotto5 + " - " + lotto6 );
        }
        if(x == 6)
        {
            System.out.println("Fortune cookie says: I can't think of any fortunes\n" + lotto1 + " - " + lotto2 + " - " + lotto3 + " - " + lotto4 + " - " + lotto5 + " - " + lotto6 );
        }
    }
}