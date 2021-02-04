package academy.devdojo.javaoneforall.javacore.Oexception.exception.test;

import academy.devdojo.javaoneforall.javacore.Oexception.exception.domain.Employee;
import academy.devdojo.javaoneforall.javacore.Oexception.exception.domain.LoginInvalidException;
import academy.devdojo.javaoneforall.javacore.Oexception.exception.domain.Person;

import java.io.FileNotFoundException;

public class OverridingWithExceptionsTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.save();
        } catch (LoginInvalidException | FileNotFoundException e) {
            e.printStackTrace();
        }
        Employee employee = new Employee();

        try {
            employee.save();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
