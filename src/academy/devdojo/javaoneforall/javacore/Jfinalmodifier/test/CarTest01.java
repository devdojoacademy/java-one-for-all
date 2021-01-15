package academy.devdojo.javaoneforall.javacore.Jfinalmodifier.test;

import academy.devdojo.javaoneforall.javacore.Jfinalmodifier.domain.Car;
import academy.devdojo.javaoneforall.javacore.Jfinalmodifier.domain.Ferrari;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(Car.SPEED_LIMIT);
        System.out.println(car.BUYER);
        car.BUYER.setName("Kuririn");
        System.out.println(car.BUYER);
        Ferrari ferrari = new Ferrari();
        ferrari.setName("Enzo");
        ferrari.print();
    }
}
