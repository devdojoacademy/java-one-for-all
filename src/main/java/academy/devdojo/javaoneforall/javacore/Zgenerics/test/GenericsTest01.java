package academy.devdojo.javaoneforall.javacore.Zgenerics.test;

import academy.devdojo.javaoneforall.javacore.Ycollection.domain.Customer;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        // Type erasure
        List<String> list = new ArrayList<>();
        list.add("Midoriya");

        for (String o : list) {
            System.out.println(o);
        }

        add(list, new Customer("Jiraya"));

        for (Object o : list) {
            System.out.println(o);
        }
    }

    private static void add(List anyList, Customer c) {
        anyList.add(c);
    }
}
