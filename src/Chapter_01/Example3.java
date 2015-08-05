package Chapter_01;

/**
 * Created by matt on 7/24/15.
 */
public class Example3 {
    public static void main(String args[]){
        int var;
        double x, y;

        var = 10;
        x = 10.00;
        y = 0;

        System.out.println("Original value of var: " + var);
        System.out.println("Original value of x: " + x);
        System.out.println("Original value of y: " + y);
        System.out.println();

        // Re-assign variable values.
        var = var / 4;
        x = x / 4;
        y = x / 4;

        System.out.println("var after division:" + var);
        System.out.println("x after division:" + x);
        System.out.println("y after division:" + (y + 2));
        System.out.println("y after division:" + y + 2);
    }
}
