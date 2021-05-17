package academy.devdojo.javaoneforall.introduction;

public class Class06LoopStatements04 {
    /*
    Given a car's total price, for example 20000
    I want to find how much and for how long I'll have to pay monthly.
    Condition: The monthly payment cannot be lower than 1000
     */
    public static void main(String[] args) {
        double totalPrice = 20000;
        for (int monthCount = 1; monthCount <= 20000; monthCount++) {
            double monthlyPrice = totalPrice / monthCount;

            if (monthlyPrice < 1000) {
                break;
            }

            System.out.println("Months " + monthCount + " Price: " + monthlyPrice);
        }
    }
}
