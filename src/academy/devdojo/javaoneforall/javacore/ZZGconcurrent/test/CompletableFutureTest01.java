package academy.devdojo.javaoneforall.javacore.ZZGconcurrent.test;

import academy.devdojo.javaoneforall.javacore.ZZGconcurrent.service.StoreService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CompletableFutureTest01 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
//        searchPricesSync(storeService);
//        searchPricesFutureAsync(storeService);
        searchPricesCompletableFutureAsync(storeService);
    }

    private static void searchPricesSync(StoreService service) {
        long start = System.currentTimeMillis();
        System.out.println(service.getPricesSync("Store 1"));
        System.out.println(service.getPricesSync("Store 2"));
        System.out.println(service.getPricesSync("Store 3"));
        System.out.println(service.getPricesSync("Store 4"));
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));
    }

    private static void searchPricesFutureAsync(StoreService service) {
        long start = System.currentTimeMillis();
        Future<Double> pricesFutureAsync1 = service.getPricesFutureAsync("Store 1");
        Future<Double> pricesFutureAsync2 = service.getPricesFutureAsync("Store 2");
        Future<Double> pricesFutureAsync3 = service.getPricesFutureAsync("Store 3");
        Future<Double> pricesFutureAsync4 = service.getPricesFutureAsync("Store 4");
        try {
            System.out.println(pricesFutureAsync1.get());
            System.out.println(pricesFutureAsync2.get());
            System.out.println(pricesFutureAsync3.get());
            System.out.println(pricesFutureAsync4.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));
        StoreService.ex.shutdown();
    }

    private static void searchPricesCompletableFutureAsync(StoreService service) {
        long start = System.currentTimeMillis();
        CompletableFuture<Double> pricesFutureAsync1 = service.getPricesCompletableFutureAsync("Store 1");
        CompletableFuture<Double> pricesFutureAsync2 = service.getPricesCompletableFutureAsync("Store 2");
        CompletableFuture<Double> pricesFutureAsync3 = service.getPricesCompletableFutureAsync("Store 3");
        CompletableFuture<Double> pricesFutureAsync4 = service.getPricesCompletableFutureAsync("Store 4");
        System.out.println(pricesFutureAsync1.join());
        System.out.println(pricesFutureAsync2.join());
        System.out.println(pricesFutureAsync3.join());
        System.out.println(pricesFutureAsync4.join());

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));
        StoreService.ex.shutdown();
    }
}
