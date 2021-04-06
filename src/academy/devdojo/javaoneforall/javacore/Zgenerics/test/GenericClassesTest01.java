package academy.devdojo.javaoneforall.javacore.Zgenerics.test;

import academy.devdojo.javaoneforall.javacore.Zgenerics.domain.Car;
import academy.devdojo.javaoneforall.javacore.Zgenerics.service.CarRentalService;

public class GenericClassesTest01 {
    public static void main(String[] args) {
        CarRentalService carRentalService = new CarRentalService();
        Car car = carRentalService.retrieveAvailableCar();
        System.out.println("Using the car for an entire month");
        carRentalService.returnRentCar(car);
    }
}
