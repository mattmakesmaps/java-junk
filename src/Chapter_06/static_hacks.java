package Chapter_06;

/**
 * Created by matt on 8/4/15.
 */
class mixed_int_bag {
    int instance_int;
    static int class_int;

    public mixed_int_bag(int a){
        instance_int = a;
    }

    static int multiply_class_int(int b) {
        return (b * class_int);
    }

    static double multiply_class_int(double b) {
        return (b * class_int);
    }

    // This produces a complie time error. since you can't reference an instance
    // variable in a static method.
//    static double multiply_class_int_by_obj_instance(int b) {
//        return (b * class_int * instance_int);
//    }
}

public class static_hacks {
    public static void main(String args[]) {
        mixed_int_bag a1 = new mixed_int_bag(5);
        mixed_int_bag a2 = new mixed_int_bag(10);

        // Modifying static variable using a reference to an instance.
        // Doesn't error out but probably is bad form.
        a1.class_int = 10;
        System.out.println(a1.class_int);
        System.out.println(a2.class_int);

        // Setting static variable using class reference.
        mixed_int_bag.class_int = 100;
        System.out.println(a1.class_int);
        System.out.println(a2.class_int);

        // Use method overloading
        System.out.println(a1.multiply_class_int(5.5));
        System.out.println(a1.multiply_class_int(10));
    }
}


