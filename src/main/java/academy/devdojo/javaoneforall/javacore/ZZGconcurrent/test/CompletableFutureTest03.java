package academy.devdojo.javaoneforall.javacore.ZZGconcurrent.test;

import academy.devdojo.javaoneforall.javacore.ZZGconcurrent.service.StoreService;
import academy.devdojo.javaoneforall.javacore.ZZGconcurrent.service.StoreServiceDeprecated;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class CompletableFutureTest03 {
    public static void main(String[] args) {
        StoreServiceDeprecated storeServiceDeprecated = new StoreServiceDeprecated();
        searchPricesCompletableFutureAsync(storeServiceDeprecated);
    }

    private static void searchPricesCompletableFutureAsync(StoreServiceDeprecated service) {
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");
        ExecutorService executor = Executors.newFixedThreadPool(10, r -> {
            Thread thread = new Thread(r);
            thread.setDaemon(true);
            return thread;
        });

        List<CompletableFuture<Double>> completableFutures = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> service.getPricesSync(s), executor))
                .collect(Collectors.toList());
        List<Double> prices = completableFutures.stream().map(CompletableFuture::join).collect(Collectors.toList());
        System.out.println(prices);
        long end = System.currentTimeMillis();
        executor.shutdown();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));
        StoreService.ex.shutdown();
    }
}
