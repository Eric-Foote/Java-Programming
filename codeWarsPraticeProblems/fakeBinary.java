/*
* Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and
* above with '1'. Return the resulting string
*/

public class fakeBinary {
    public static String fakeBin(String numberString) {
        for(int i = 0; i < numberString.length(); i++) {
            if(numberString.charAt(i) == ('2'))
                numberString.replace(numberString.charAt(i),'0');
            else if (numberString.charAt(i) == ('3'))
                numberString.replace(numberString.charAt(i),'0');
            else if (numberString.charAt(i) == ('4'))
                numberString.replace(numberString.charAt(i),'0');
            else if (numberString.charAt(i) == ('5'))
                numberString.replace(numberString.charAt(i),'1');
            else if (numberString.charAt(i) == ('6'))
                numberString.replace(numberString.charAt(i),'1');
            else if (numberString.charAt(i) == ('7'))
                numberString.replace(numberString.charAt(i),'1');
            else if (numberString.charAt(i) == ('8'))
                numberString.replace(numberString.charAt(i),'1');
            else if (numberString.charAt(i) == ('9'))
                numberString.replace(numberString.charAt(i),'1');
         }
    return numberString;
    }
}
