package academy.devdojo.javaoneforall.javacore.Npolymorphism.test;

import academy.devdojo.javaoneforall.javacore.Npolymorphism.repository.Repository;
import academy.devdojo.javaoneforall.javacore.Npolymorphism.service.DatabaseRepositoryService;
import academy.devdojo.javaoneforall.javacore.Npolymorphism.service.FileRepositoryService;
import academy.devdojo.javaoneforall.javacore.Npolymorphism.service.InMemoryRepositoryService;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositoryTest01 {
    public static void main(String[] args) {
        Repository repository = new DatabaseRepositoryService();
        repository.save();
        List<String> list = new LinkedList<>();
        list.add("Goku");
        list.add("Vegeta");
        list.add("N18");
        System.out.println(list);
    }
}
