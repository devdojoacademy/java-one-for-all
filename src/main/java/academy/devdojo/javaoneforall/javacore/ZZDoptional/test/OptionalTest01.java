package academy.devdojo.javaoneforall.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("Hello William, awesome course");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println("-----");

        Optional<String> name = findName("William");
        System.out.println(name.orElse("EMPTY"));
        name.ifPresent(s -> System.out.println(s.toUpperCase()));
        String name2 = findName("william")
                .orElseThrow(IllegalArgumentException::new);
    }

    private static Optional<String> findName(String name) {
        List<String> list = List.of("William", "DevDojo Academy");
        int i = list.indexOf(name);
        if (i != -1) {
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }
}
