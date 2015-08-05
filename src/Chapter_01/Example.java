package Chapter_01;

/**
 * Created by matt on 7/24/15.
 */
public class Example {
    // `String args[]` an array of strings
    public static void writeStuff() {
        System.out.println("Hi From My OTher Public Method");
    }

    // All classes require a `main()` method.
    public static void main(String args[]) {
        System.out.println("Hi From My Computer");
        Example.writeStuff();
    }
}
