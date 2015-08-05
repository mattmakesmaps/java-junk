package Chapter_01;

/**
 * Created by matt on 7/24/15.
 */
public class Example2 {
    public static void main(String args[]) {
        int var1, var2;
        double x;

        var1 = 1024;
        var2 = 2;

        System.out.println("var1 contains " + var1);

        if (var1 <= 1000) {
            var2 = var1 / 2;
        }

        // print() does not create a newline character
        // println() does.
        System.out.print("var2 contains var1 / 2:");
        System.out.println(var2);
    }
}
