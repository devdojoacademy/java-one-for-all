package academy.devdojo.javaoneforall.javacore.ZZKjunit.service;

import academy.devdojo.javaoneforall.javacore.ZZKjunit.domain.Person;

import java.util.Objects;

public class PersonService {

    public boolean isAdult(Person person){
        Objects.requireNonNull(person, "Person can't be null");
        return person.getAge() >= 18;
    }
}
