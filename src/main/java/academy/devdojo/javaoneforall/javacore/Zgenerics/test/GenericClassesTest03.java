package academy.devdojo.javaoneforall.javacore.Zgenerics.test;

import academy.devdojo.javaoneforall.javacore.Zgenerics.domain.Boat;
import academy.devdojo.javaoneforall.javacore.Zgenerics.domain.Car;
import academy.devdojo.javaoneforall.javacore.Zgenerics.service.BoatRentalService;
import academy.devdojo.javaoneforall.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class GenericClassesTest03 {
    public static void main(String[] args) {
        List<Boat> boatsAvailable = new ArrayList<>(List.of(new Boat("Boat 1"), new Boat("Boat 2")));
        List<Car> carsAvailable = new ArrayList<>(List.of(new Car("BMW"), new Car("Audi")));
        RentalService<Car> rentalServiceCar = new RentalService<>(carsAvailable);
        Car car = rentalServiceCar.retrieveAvailableObject();
        System.out.println("using car for a month");
        rentalServiceCar.returnRentObject(car);

        System.out.println("--------");

        RentalService<Boat> rentalServiceBoat = new RentalService<>(boatsAvailable);
        Boat boat = rentalServiceBoat.retrieveAvailableObject();
        System.out.println("using car for a month");
        rentalServiceBoat.returnRentObject(boat);
    }
}
