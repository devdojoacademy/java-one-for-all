package academy.devdojo.javaoneforall.javacore.Zgenerics.service;

import academy.devdojo.javaoneforall.javacore.Zgenerics.domain.Car;

import java.util.List;

public class RentalService<T> {
    private List<T> objectsAvailable;

    public RentalService(List<T> objectsAvailable) {
        this.objectsAvailable = objectsAvailable;
    }

    public T retrieveAvailableObject() {
        System.out.println("Searching for any object available");
        T t = objectsAvailable.remove(0);
        System.out.println("Renting the object: " + t);
        System.out.println("Available objects to rent: " + objectsAvailable);
        return t;
    }

    public void returnRentObject(T t) {
        System.out.println("Returning object: "+t);
        objectsAvailable.add(t);
        System.out.println("Available objects to rent: " + objectsAvailable);
    }
}
