package academy.devdojo.javaoneforall.javacore.ZZHdesignpatterns.test;

import academy.devdojo.javaoneforall.javacore.ZZHdesignpatterns.domain.Country;
import academy.devdojo.javaoneforall.javacore.ZZHdesignpatterns.domain.Currency;
import academy.devdojo.javaoneforall.javacore.ZZHdesignpatterns.domain.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}
