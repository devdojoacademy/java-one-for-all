package academy.devdojo.javaoneforall.javacore.Kenum.test;

import academy.devdojo.javaoneforall.javacore.Kenum.domain.Customer;
import academy.devdojo.javaoneforall.javacore.Kenum.domain.CustomerType;

public class CustomerTest01 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Tsubasa", CustomerType.INDIVIDUAL);
        Customer customer2 = new Customer("Tsubasa",CustomerType.COMPANY);
        Customer customer3 = new Customer("Tsubasa",CustomerType.COMPANY);
        Customer customer4 = new Customer("Tsubasa",CustomerType.INDIVIDUAL);
        Customer customer5 = new Customer("Tsubasa",CustomerType.START_UP);
        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(customer3);
        System.out.println(customer4);
    }
}
