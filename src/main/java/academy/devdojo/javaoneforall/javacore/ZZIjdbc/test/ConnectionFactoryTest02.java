package academy.devdojo.javaoneforall.javacore.ZZIjdbc.test;

import academy.devdojo.javaoneforall.javacore.ZZIjdbc.domain.Producer;
import academy.devdojo.javaoneforall.javacore.ZZIjdbc.service.ProducerServiceRowSet;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest02 {
    public static void main(String[] args) {
        Producer producerToUpdate = Producer.builder().id(1).name("MAD").build();
        ProducerServiceRowSet.updateJdbcRowSet(producerToUpdate);

        log.info("-------------------------------");

        List<Producer> producers = ProducerServiceRowSet.findByNameJdbcRowSet("");
        log.info(producers);
    }
}
