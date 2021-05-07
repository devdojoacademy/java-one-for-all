package academy.devdojo.javaoneforall.javacore.ZZGconcurrent.service;

import academy.devdojo.javaoneforall.javacore.ZZGconcurrent.domain.Discount;
import academy.devdojo.javaoneforall.javacore.ZZGconcurrent.domain.Quote;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class StoreServiceWithDiscount {

    // storeName:price:discount.code
    public String getPricesSync(String storeName) {
        double price = priceGenerator();
        Discount.Code discountCode = Discount.Code.values()[
                ThreadLocalRandom.current().nextInt(Discount.Code.values().length)
                ];
        return String.format("%s:%.2f:%s", storeName, price, discountCode);
    }

    public String applyDiscount(Quote quote) {
        delay();
        double discountValue = quote.getPrice() * (100 - quote.getDiscountCode().getPercentage()) / 100;
        return String.format("'%s' original price: '%.2f'. Applying discount code: '%s'. Final price: '%.2f'",
                quote.getStore(),
                quote.getPrice(),
                quote.getDiscountCode(),
                discountValue);
    }

    private double priceGenerator() {
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }

    private void delay() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
