package Chapter_04;

/**
 * Created by matt on 7/27/15.
 */

class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    Vehicle (int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }
}

class House {
    int bedrooms;
    int sqft;
}

class VehicleDemo {
    public static void main(String args[]) {
        Vehicle subaru = new Vehicle(5, 14, 20);
        Vehicle kia = new Vehicle(7, 12, 15);

        System.out.println(subaru.passengers);
        Vehicle subaru_reference = subaru;
        int subaru_original_pass = subaru.passengers;
        System.out.println(subaru_original_pass);
        System.out.println(subaru_reference.passengers);

        subaru.passengers = 20;
        System.out.println(subaru.passengers);
        System.out.println(subaru_original_pass);
        System.out.println(subaru_reference.passengers);

    }
}

