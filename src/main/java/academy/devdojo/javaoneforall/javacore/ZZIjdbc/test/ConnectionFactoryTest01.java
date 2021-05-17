package academy.devdojo.javaoneforall.javacore.ZZIjdbc.test;

import academy.devdojo.javaoneforall.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.javaoneforall.javacore.ZZIjdbc.domain.Producer;
import academy.devdojo.javaoneforall.javacore.ZZIjdbc.repository.ProducerRepository;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Deen").build();
        ProducerRepository.save(producer);
    }
}
