package academy.devdojo.javaoneforall.javacore.Zgenerics.test;

import academy.devdojo.javaoneforall.javacore.Zgenerics.domain.Boat;
import academy.devdojo.javaoneforall.javacore.Zgenerics.domain.Car;
import academy.devdojo.javaoneforall.javacore.Zgenerics.service.BoatRentalService;

public class GenericClassesTest02 {
    public static void main(String[] args) {
        BoatRentalService boatRentalService = new BoatRentalService();
        Boat boat = boatRentalService.retrieveAvailableBoat();
        System.out.println("Using the boat for an entire month");
        boatRentalService.returnRentBoat(boat);
    }
}
