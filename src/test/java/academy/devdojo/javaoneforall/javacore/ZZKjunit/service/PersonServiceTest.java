package academy.devdojo.javaoneforall.javacore.ZZKjunit.service;

import academy.devdojo.javaoneforall.javacore.ZZKjunit.domain.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {
    private Person adult;
    private Person notAdult;
    private PersonService personService;

    @BeforeEach
    public void setUp(){
        adult = new Person(18);
        notAdult = new Person(15);
        personService = new PersonService();
    }
    @Test
    @DisplayName("A person should not be adult if younger than 18")
    void isAdult_ReturnFalse_WhenAgeIsLowerThan18() {
        Assertions.assertFalse(personService.isAdult(notAdult));
    }

    @Test
    @DisplayName("A person should be adult if older or equals 18")
    void isAdult_ReturnTrue_WhenAgeIsGreaterOrEqualThan18() {
        Assertions.assertTrue(personService.isAdult(adult));
    }

    @Test
    @DisplayName("isAdult throws NullPointerException when Person is Null")
    void isAdult_ThrowNullPointerException_WhenPersonIsNull() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> personService.isAdult(null), "A person can't be null");
    }

    @Test
    @DisplayName("Should remove all non adult people from list")
    void filterRemovingNotAdult_RemoveNonAdultsFromList_WhenListWithPersonIsPassed() {
        Person person1 = new Person(17);
        Person person2 = new Person(18);
        Person person3 = new Person(21);
        List<Person> personList = List.of(person1, person2, person3);
        Assertions.assertEquals(2, personService.filterRemovingNotAdult(personList).size());
    }
}