package academy.devdojo.javaoneforall.javacore.Bintroductionmethods.test;

import academy.devdojo.javaoneforall.javacore.Bintroductionmethods.domain.Person;

public class PersonTest01 {
    public static void main(String[] args) {
        Person person = new Person();
//        person.name = "Jiraya";
//        person.age = -1;
        person.setName("Jiraya");
        person.setAge(70);
//        person.print();
        System.out.println(person.getName());
        System.out.println(person.getAge());

    }
}
