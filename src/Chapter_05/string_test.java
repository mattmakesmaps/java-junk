package Chapter_05;

/**
 * Created by matt on 7/31/15.
 */
public class string_test {
    public static void main(String args[]){
        /**
         * Despite being objects, assigning a string
         * to another string is pass by value.
         * AKA Strings are Immutable
         */
        String s1 = "Some Text";
        String s2 = s1;
        String s3 = "New text";

        System.out.println(s1); // Some Text
        System.out.println(s2); // Some Text

        System.out.println(s1.equals(s2));

        s2 = "new text";

        System.out.println(s1); // new text
        System.out.println(s2); // Some Text

        System.out.println(s1 == s2);

        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s2));
        System.out.println(s3.indexOf("ext"));

    }
}
