package academy.devdojo.javaoneforall.javacore.Zgenerics.test;


import java.util.ArrayList;
import java.util.List;

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat(), new Cat());
        List<Animal> animals = new ArrayList<>(2);
        List<Object> objects = new ArrayList<>(2);
        printConsult(dogs);
        printConsult(cats);
        printConsultDog(animals);
    }

    private static void printConsult(List<? extends Animal> animals) {
        System.out.println("-------");

        for (Animal animal : animals) {
            animal.consult();
        }
    }

    private static void printConsultDog(List<? super Animal> animals) {
        System.out.println("-------");
        Animal a = new Cat();
        Animal a1 = new Dog();
        animals.add(new Dog());
        animals.add(new Cat());
        for (Object obj : animals) {
            if (obj instanceof Dog) {
                Dog d = (Dog) obj;
                d.consult();
            }

        }
    }
}
