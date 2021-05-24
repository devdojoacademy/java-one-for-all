package academy.devdojo.javaoneforall.javacore.ZZJcrud.service;

import academy.devdojo.javaoneforall.javacore.ZZJcrud.domain.Producer;
import academy.devdojo.javaoneforall.javacore.ZZJcrud.repository.ProducerRepository;

import java.util.List;
import java.util.Scanner;

public class ProducerService {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void menu(int op) {
        switch (op) {
            case 1:
                findByName();
                break;
            default:
                throw new IllegalArgumentException("Invalid option");
        }

    }

    private static void findByName() {
        System.out.println("Type the name or empty to list all");
        String name = SCANNER.nextLine();
        List<Producer> producers = ProducerRepository.findByName(name);
        for (int i = 0; i < producers.size(); i++) {
            System.out.printf("[%d] - %s%n", i, producers.get(i).getName());
        }
    }
}
