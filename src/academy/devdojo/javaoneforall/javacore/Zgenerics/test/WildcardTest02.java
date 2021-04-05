package academy.devdojo.javaoneforall.javacore.Zgenerics.test;


import java.util.ArrayList;
import java.util.List;

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat(), new Cat());
        List<Animal> animals = new ArrayList<>(2);
        printConsult(animals);
    }

    private static void printConsult(List<Animal> animals) {
        System.out.println("-------");
        animals.add(new Dog());

        for (Animal animal : animals) {
            animal.consult();
        }

    }
}
