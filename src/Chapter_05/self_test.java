package Chapter_05;

/**
 * Created by matt on 8/3/15.
 */
public class self_test {
    public static void main(String args[]) {
        // Question 1.
        double dbl_array1[] = new double[12];
        double dbl_array2[] = {12.0, 13.0};
        double[] dbl_array3 = new double[12];


        // Question 2
        int int_array1[] = {1,2,3,4,5};

        // Question 3
        double dbl_array4[] = {1,2,3,4,5,6,7,8,9,10};
        double avg_result = compute_average(dbl_array4);
        System.out.println(avg_result);

        // Question 4
        String s1 = "Some New String";
        System.out.println(s1.indexOf("S"));
        System.out.println(s1.lastIndexOf("S"));

        // Multi Dimensional Array Hacks

        int multiball[][] = {
            {0,1,2,8,12},
            {3,4,5},
            {6,7,8}
        };

        System.out.println(multiball);

    }

    // Question 3
    public static double compute_average(double in_vals[]) {
        // Return average of ten doubles in an array.
        double sum = 0;
        for (double val: in_vals) {
            sum += val;
        }
        return sum/in_vals.length;
    }

}
