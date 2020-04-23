
public class xAndY {
    public static void main(String[] args) {
        System.out.println("x \t y");
        System.out.println("-----------------");
        for (double x = -10; x <= 10; x = x+0.5)
        {
            double y = x*x;
            System.out.println(x + "\t" + y);
        }
    }
}