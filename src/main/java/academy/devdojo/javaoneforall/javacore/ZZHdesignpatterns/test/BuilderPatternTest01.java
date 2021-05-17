package academy.devdojo.javaoneforall.javacore.ZZHdesignpatterns.test;

import academy.devdojo.javaoneforall.javacore.ZZHdesignpatterns.domain.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person person = Person.PersonBuilder
                .builder()
                .firstName("William")
                .lastName("Suane")
                .username("william")
                .email("william.suane@devdojo.academy")
                .build();

        System.out.println(person);
    }
}
