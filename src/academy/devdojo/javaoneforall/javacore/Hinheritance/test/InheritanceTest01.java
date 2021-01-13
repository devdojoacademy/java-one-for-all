package academy.devdojo.javaoneforall.javacore.Hinheritance.test;

import academy.devdojo.javaoneforall.javacore.Hinheritance.domain.Address;
import academy.devdojo.javaoneforall.javacore.Hinheritance.domain.Employee;
import academy.devdojo.javaoneforall.javacore.Hinheritance.domain.Manager;

public class InheritanceTest01 {
    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("12th Ave");
        address.setZipcode("13245");
        Employee employee = new Employee("Toyohisa Shimazu");
        employee.setSocialSecurityNumber("121212");
        employee.setSalary(120000);
        employee.setAddress(address);
        employee.print();

        System.out.println("--------------");
        Manager manager = new Manager("Oda Nobunaga");
        manager.setSocialSecurityNumber("92121");
        manager.setSalary(250000);
        manager.setAddress(address);
        manager.setDepartment("IT");
        manager.print();

    }
}
