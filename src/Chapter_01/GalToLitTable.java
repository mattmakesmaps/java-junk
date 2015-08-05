package Chapter_01;

/**
 * Created by matt on 7/24/15.
 */
public class GalToLitTable {
    public static void main(String args[]) {
        double gallons, liters;
//        int counter;

//        counter = 0;
        for(gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854;
            System.out.println(gallons + " gallons is " + liters + " liters.");

            if ((gallons + 1)%10 == 0) {
                System.out.println();
            }

//            counter++;
//            if (counter == 10) {
//                System.out.println();
//                counter = 0;
//            }
        }
    }
}
