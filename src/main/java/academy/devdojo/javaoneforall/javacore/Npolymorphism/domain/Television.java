package academy.devdojo.javaoneforall.javacore.Npolymorphism.domain;

public class Television extends Product{
    public static final double TAX_PERCENTAGE = 0.21;

    public Television(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTaxValue() {
        System.out.println("Calculating tax value for television");
        return this.price * TAX_PERCENTAGE;
    }
}
