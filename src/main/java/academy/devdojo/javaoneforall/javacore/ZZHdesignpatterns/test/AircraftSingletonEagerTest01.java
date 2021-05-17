package academy.devdojo.javaoneforall.javacore.ZZHdesignpatterns.test;

import academy.devdojo.javaoneforall.javacore.ZZHdesignpatterns.domain.Aircraft;
import academy.devdojo.javaoneforall.javacore.ZZHdesignpatterns.domain.AircraftSingletonEager;

import java.text.DateFormat;

public class AircraftSingletonEagerTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
        AircraftTest01.bookSeat("1A");
        AircraftTest01.bookSeat("1A");
    }

    static void bookSeat(String seat) {
        AircraftSingletonEager aircraft = AircraftSingletonEager.getINSTANCE();
        System.out.println(aircraft);
        System.out.println(aircraft.bookSeat(seat));
    }
}
