package academy.devdojo.javaoneforall.javacore.Kenum.domain;

public class Customer {
    private String name;
    private CustomerType customerType;

    public Customer(String name, CustomerType customerType) {
        this.name = name;
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", customerType=" + customerType +
                '}';
    }
}
