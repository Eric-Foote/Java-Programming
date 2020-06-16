public class stringToNumber {
    public static int stringToNumber(String str) {
        //TODO: Convert str into a number
        int number = Integer.valueOf(str);
        return number;
      }
    public static void main(String[] args) {
       String case1 = "1234";
       System.out.println(stringToNumber(case1));
    }
}