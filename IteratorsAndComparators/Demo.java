package IteratorsAndComparators;

import java.util.List;

public class Demo {
    public static class Car{
        int year;
        int fuel;


    }
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        List<Car> cars = List.of(car2, car1, car3);
        addFuel(13, car1, car2, car3);
        addFuel(13);

        System.out.println(car1.fuel);

    }

    public static void addFuel(int fuel, Car... cars){
        for (Car car : cars) {
            car.fuel += fuel;
        }
    }
}
