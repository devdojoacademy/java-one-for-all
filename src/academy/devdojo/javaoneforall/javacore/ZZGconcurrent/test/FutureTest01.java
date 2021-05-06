package academy.devdojo.javaoneforall.javacore.ZZGconcurrent.test;

import java.util.concurrent.*;

public class FutureTest01 {
    public static void main(String[] args){
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Double> dollarRequest = executorService.submit(() -> {
            TimeUnit.SECONDS.sleep(5);
            return 5.35D;
        });
        System.out.println(doSomething());
        try {
            System.out.println(dollarRequest.get(2,TimeUnit.SECONDS));
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            e.printStackTrace();
        }finally {
            executorService.shutdown();
        }
    }

    private static long doSomething() {
        System.out.println(Thread.currentThread().getName());
        long sum = 0;
        for (int i = 0; i < 1_000_000; i++) {
            sum += i;
        }
        return sum;
    }
}
