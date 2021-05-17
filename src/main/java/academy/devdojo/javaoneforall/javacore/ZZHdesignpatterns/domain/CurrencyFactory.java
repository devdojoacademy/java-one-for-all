package academy.devdojo.javaoneforall.javacore.ZZHdesignpatterns.domain;

public class CurrencyFactory {
    public static Currency newCurrency(Country country) {
        switch (country) {
            case USA:
                return new UsDollar();
            case BRAZIL:
                return new Real();
            default:
                throw new IllegalArgumentException("No currency for the given country");
        }
    }
}
