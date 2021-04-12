package academy.devdojo.javaoneforall.javacore.ZZBparameterization.interfaces;

import academy.devdojo.javaoneforall.javacore.ZZBparameterization.domain.Car;

import java.util.function.Predicate;

public interface CarPredicate {
    boolean test(Car car);
}
