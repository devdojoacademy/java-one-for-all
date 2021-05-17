package academy.devdojo.javaoneforall.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest05 {
    public static void main(String[] args) {
        List<String> words = List.of("Gomu", "Gomu", "No", "Mi");
        String[] letters = words.get(0).split("");
        System.out.println(Arrays.toString(letters));
//        final Stream<String> stream = Arrays.stream(letters);

        List<String> collect = words.stream()
                .map(w -> w.split(""))// Stream<String[]>
                .flatMap(Arrays::stream) // Stream<String> | Stream<Stream<String>>
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
