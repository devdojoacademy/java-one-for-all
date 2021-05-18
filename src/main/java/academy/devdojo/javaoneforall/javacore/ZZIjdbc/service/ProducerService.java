package academy.devdojo.javaoneforall.javacore.ZZIjdbc.service;

import academy.devdojo.javaoneforall.javacore.ZZIjdbc.domain.Producer;
import academy.devdojo.javaoneforall.javacore.ZZIjdbc.repository.ProducerRepository;

public class ProducerService {
    public static void save(Producer producer) {
        ProducerRepository.save(producer);
    }

    public static void delete(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Invalid value passed to id, is it bigger than 0?");
        }
        ProducerRepository.delete(id);
    }
}
