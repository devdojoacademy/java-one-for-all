package academy.devdojo.javaoneforall.javacore.ZZBparameterization.test;

import academy.devdojo.javaoneforall.javacore.ZZBparameterization.domain.Car;
import academy.devdojo.javaoneforall.javacore.ZZBparameterization.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BehaviorParameterizationTest02 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));

    public static void main(String[] args) {
        List<Car> green = filter(cars, car -> car.getColor().equals("green"));
        List<Car> red = filter(cars, car -> car.getColor().equals("red"));
        List<Car> yearBefore = filter(cars, car -> car.getYear() < 2015);

        System.out.println(green);
        System.out.println(red);
        System.out.println(yearBefore);
    }

    private static List<Car> filter(List<Car> cars, Predicate<Car> predicate) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (predicate.test(car)) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }


}
