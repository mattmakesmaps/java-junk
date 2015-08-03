package Chapter_04;

/**
 * Created by matt on 7/28/15.
 */

class doubler {
    int data_value;
    int make_double(int input_val, boolean update_data_value) {
        int doubled_value = input_val * 2;
        System.out.println("Inside `make_double`(): " + doubled_value);
        if (update_data_value) {
            data_value = doubled_value;
        }
        return doubled_value;
    }
}

class test_methods {
    public static void main(String args[]){
        // Create a new doubler instance
        doubler double_instance = new doubler();
        double_instance.data_value = 10;

        // Set int to instance parameter before loop.
        // Should be pass by value.
        int before_loop = double_instance.data_value;

        doubler double_instance_ref = double_instance;

        System.out.println("Object Ref Before Loop: " + double_instance_ref.data_value); // 10
        // Reset value of `data_value` using loop.
        for (int i = 0; i < 5; i++) {
            double_instance.make_double(double_instance.data_value, true);
        }

        // Set int to instance parameter after loop.
        // Should be pass by value; different value from before loop.
        int after_loop = double_instance.data_value;

        System.out.println("Object Ref After Loop: " + double_instance_ref.data_value); // 320 <-- pass by reference.

        System.out.println("before loop: " + before_loop +
                " After Loop:" + after_loop); // before loop: 10 After Loop:320 <-- pass by value

        System.out.println();
    }
}
