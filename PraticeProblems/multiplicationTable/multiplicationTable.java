public class multiplicationTable {
    public static void main(String[] args) {
        System.out.println("x | 1 \t 2 \t 3 \t 4 \t 5 \t 6 \t 7 \t 8 \t 9");
        System.out.println("== + ===============================================================");
        for (int i = 1; i <= 12; i++) {
            System.out.print(i + "| ");
            for (int j = 1; j <= 9; j++)
            {
                System.out.print(i*j + "\t");
            }
            System.out.println("");
        }
    }
}