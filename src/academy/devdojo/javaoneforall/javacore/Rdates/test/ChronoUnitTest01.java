package academy.devdojo.javaoneforall.javacore.Rdates.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime birthdate = LocalDateTime.of(1988, Month.AUGUST,6,12,0,0);
        System.out.println(ChronoUnit.DAYS.between(birthdate, LocalDateTime.now()));
        System.out.println(ChronoUnit.WEEKS.between(birthdate, LocalDateTime.now()));
        System.out.println(ChronoUnit.MONTHS.between(birthdate, LocalDateTime.now()));
        System.out.println(ChronoUnit.YEARS.between(birthdate, LocalDateTime.now()));
    }
}
