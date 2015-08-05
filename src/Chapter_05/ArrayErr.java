package Chapter_05;

import java.util.Collections;

/**
 * Created by matt on 7/29/15.
 */
public class ArrayErr {
    public static void main(String args[]) {
        int sample[] = new int[10];
        int sample2[] = sample;
        int i;

        for (i = 0; i < 9; i++) {
            sample[i] = i;
        }

        System.out.println(sample[3]);
        // An array assigned the value of another array
        // is pass by reference, since the array is an object.
        System.out.println(sample2[3]);

        sample[3] = 99;

        System.out.println(sample[3]);
        // An array assigned the value of another array
        // is pass by reference, since the array is an object.
        System.out.println(sample2[3]);

        // Try sorting
        // See: http://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html
        java.util.Arrays.sort(sample);

        System.out.println(sample[3]);
        System.out.println(sample[9]);

    }
}
