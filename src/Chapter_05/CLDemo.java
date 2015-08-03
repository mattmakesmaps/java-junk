package Chapter_05;

/**
 * Created by matt on 8/3/15.
 */
public class CLDemo {
    public static int doubler(int in_val){
        return in_val * 2;
    }

    public static void main(String args[]) {
        int val1 = Integer.parseInt(args[0]);
        int doubled_val1;
        String animal_by_numbers;

        System.out.println("Gonna show you some args using a for-each loop.");
        for(String arg: args){
            System.out.println(arg);
        }

        System.out.println("Doubled Value: ");
        doubled_val1 = doubler(val1);
        System.out.println(doubled_val1);

        animal_by_numbers = doubled_val1 > 50 ? "cat" : "dog"; // if `doubled_val1` is below 50, cat. above 50, dog.
        System.out.println(animal_by_numbers);
    }
}
