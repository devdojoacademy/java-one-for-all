package academy.devdojo.javaoneforall.javacore.Bintroductionmethods.domain;

public class Calculator {

    public void sumTwoNumbers() {
        System.out.println(10 + 10);
    }

    public void subtractTwoNumbers() {
        System.out.println(21 - 2);
    }

    public void multiplyTwoNumbers(int num1, float num2) {
        System.out.println(num1 * num2);
    }

    public double divideTwoNumbers(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double divideTwoNumbers02(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public void printTwoNumbersDivided(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Can't divide by 0");
            return;
        }
        System.out.println(num1 / num2);

    }
}
