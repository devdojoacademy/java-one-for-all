package academy.devdojo.javaoneforall.javacore.ZZEstreams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest16 {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 100_000_000;
        sumFor(num);
        sumStreamIterate(num);
        sumParallelStreamIterate(num);
        sumLongStreamRangedClosed(num);
        sumParallelLongStreamRangedClosed(num);
    }

    private static void sumFor(long num) {
        System.out.println("sumFor");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 1; i <= num; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumStreamIterate(long num) {
        System.out.println("sumStreamIterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }
    // [1,2,3,4,5,6,7,8,9,0]
    // 1 (1-5)
    // 2 (5-6)
    // 3 (7-0)
    private static void sumParallelStreamIterate(long num) {
        System.out.println("sumParallelStreamIterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).parallel().limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumLongStreamRangedClosed(long num) {
        System.out.println("sumLongStreamRangedClosed");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L,num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumParallelLongStreamRangedClosed(long num) {
        System.out.println("sumParallelLongStreamRangedClosed");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L,num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }
}
