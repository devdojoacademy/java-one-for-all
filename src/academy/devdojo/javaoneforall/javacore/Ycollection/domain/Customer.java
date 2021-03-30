package academy.devdojo.javaoneforall.javacore.Ycollection.domain;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Customer {
    private Long id;
    private String name;

    public Customer(String name) {
        this.id = ThreadLocalRandom.current().nextLong(0,100_000);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
