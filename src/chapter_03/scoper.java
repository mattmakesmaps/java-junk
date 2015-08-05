package chapter_03;

/**
 * Created by matt on 7/26/15.
 */
public class scoper {
    public static void main(String args[]){
        int method_scope = 0;

        if (method_scope == 0) {
            int if_scope = 1;
            method_scope++;
            for (int i = 0; i < 5; i++) {
                int nester_scope = i * if_scope; // inner for loop can see outer var in `if` block.
            }
            // `nester_scope` is inaccessible.

        }

        for (int i = 0; i < 5; i++) {
            //int looper_scope = i;
        }

        int second_method_scope = 2;
        System.out.println(method_scope);
        //System.out.println(if_scope); // causes compile time error; `if_scope` not outside block.
        System.out.println(second_method_scope);
        //System.out.println(looper_scope);
    }
}
