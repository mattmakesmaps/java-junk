package Chapter_07;

/**
 * Created by matt on 8/17/15.
 */

abstract class Person {
    String name;
    private int age;
    char gender;

    // Declare a constant using `final` keyword
    // Declare variable as class variable using `static` keyword.
    final static boolean requires_oxygen = true;

    // Create Age Getter and Setter
    void setAge(int a) {
        if (a >= 0) {
            age = a;
        }
        else {
            System.out.println("Hey You Didn't Enter a positive number");
        }
    }

    int getAge(){
        return age;
    }

    // This is an abstract method that subclasses must implement.
    abstract void say_hello();

    // Parameterized Constructor
    Person(String n, int a, char g){
        name = n;
        // Use the setter
        setAge(a);
        gender = g;
    }

    // `Default` Constructor
    Person(){
        name = "Default";
        setAge(0);
        gender = 'd';
    }
}

class DataEngineer extends Person {
    String job = "Data Engineer";

    DataEngineer(String n, int a, char g){
        super(n, a, g);
    }

    DataEngineer(){
        super();
    }

    void say_hello(){
        // Access parameter `name` in superclass just by typing parameter name
        // don't need `super.name`
        System.out.println("Hello I am " + name + " and I work as a " + job );
    }

}

public class subclassing {
    public static void main(String args[]){

        // Use paramaterized constructor
        DataEngineer jan = new DataEngineer("Jan", 45, 'f');
        System.out.println(jan.job);

        // Use default constructor
        DataEngineer mrdefault = new DataEngineer();
        System.out.println(mrdefault.name);
        mrdefault.setAge(60);
        System.out.println(mrdefault.getAge());

        mrdefault.say_hello();
    }
}
