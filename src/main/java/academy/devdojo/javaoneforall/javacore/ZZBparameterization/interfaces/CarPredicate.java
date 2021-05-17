package academy.devdojo.javaoneforall.javacore.ZZBparameterization.interfaces;

import academy.devdojo.javaoneforall.javacore.ZZBparameterization.domain.Car;

import java.util.function.Predicate;

@FunctionalInterface
public interface CarPredicate {
    boolean test(Car car);
    // (Parameters) -> <expression>
    // (Car x) -> x.getColor().equals("green");
    // () -> System.out.println("lalala")
}
