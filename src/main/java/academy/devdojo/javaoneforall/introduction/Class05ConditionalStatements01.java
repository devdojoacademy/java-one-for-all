package academy.devdojo.javaoneforall.introduction;

public class Class05ConditionalStatements01 {
    public static void main(String[] args) {
        int age = 12;
        boolean isAllowedToBuyAlcohol = age >= 18;
        if (isAllowedToBuyAlcohol) {
            System.out.println("Authorized to buy alcohol");
        } else {
            System.out.println("Sorry, you are not allowed to buy alcohol");
        }
        // !
        if (!isAllowedToBuyAlcohol) {
            System.out.println("Sorry, you are not allowed to buy alcohol");
        }
        boolean c = false;
        if (c = false) {
            System.out.println("Inside weird condition");
        }

        System.out.println("Outside if");
    }
}
