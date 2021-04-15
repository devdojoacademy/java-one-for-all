package academy.devdojo.javaoneforall.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

//Reference to an instance method of an arbitrary object of a particular type
public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Rimuru", "Veldora", "Hikimaru"));
        names.sort(String::compareTo);
        System.out.println(names);

        Function<String, Integer> numToStringInteger = Integer::parseInt;
        Integer num = numToStringInteger.apply("10");
        System.out.println(num);

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(names, "Rimuru"));

    }
}
