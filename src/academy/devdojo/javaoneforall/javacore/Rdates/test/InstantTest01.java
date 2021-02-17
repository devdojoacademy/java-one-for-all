package academy.devdojo.javaoneforall.javacore.Rdates.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);
        System.out.println(LocalDateTime.now());
        System.out.println(instant.getEpochSecond());
        System.out.println(instant.getNano()); // 999.999.999
        System.out.println(Instant.ofEpochSecond(3));
        System.out.println(Instant.ofEpochSecond(3,1_000_000_000));
        System.out.println(Instant.ofEpochSecond(3,0));
        System.out.println(Instant.ofEpochSecond(3,900_000_000));
        System.out.println(Instant.ofEpochSecond(3,-1_000_000_000));
    }
}
