package Chapter_06;

/**
 * Created by matt on 8/4/15.
 */
class Person {
    public int age;
    public char gender;
    private int net_worth;

    public void set_net_worth(int val){
        net_worth = val;
    }

    public int get_net_worth(){
        return net_worth;
    }

    public Person(int startAge, char startGender) {
        age = startAge;
        gender = startGender;
    }
}

class AccessDemo {
    public static void main(String args[]){
        Person matt = new Person(29, 'm');
        matt.set_net_worth(30);
        System.out.println(matt.get_net_worth());
    }
}
