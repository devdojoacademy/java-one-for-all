package academy.devdojo.javaoneforall.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2022-08-06");
        LocalTime time = LocalTime.parse("09:45:21");
        System.out.println(now);
        System.out.println(date);
        System.out.println(time);
        LocalDateTime ldt1 = LocalDateTime.of(date, time);
        LocalDateTime ldt2 = date.atTime(time);
        LocalDateTime ldt3 = time.atDate(date);
        System.out.println(ldt1);
        System.out.println(ldt2);
        System.out.println(ldt3);
    }
}
