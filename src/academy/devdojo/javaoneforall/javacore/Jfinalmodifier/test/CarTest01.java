package academy.devdojo.javaoneforall.javacore.Jfinalmodifier.test;

import academy.devdojo.javaoneforall.javacore.Jfinalmodifier.domain.Buyer;
import academy.devdojo.javaoneforall.javacore.Jfinalmodifier.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.SPEED_LIMIT);
        System.out.println(car.BUYER);
        car.BUYER.setName("Kuririn");
        System.out.println(car.BUYER);
    }
}
