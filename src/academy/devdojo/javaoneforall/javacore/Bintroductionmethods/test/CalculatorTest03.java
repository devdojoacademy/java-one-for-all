package academy.devdojo.javaoneforall.javacore.Bintroductionmethods.test;

import academy.devdojo.javaoneforall.javacore.Bintroductionmethods.domain.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result = calculator.divideTwoNumbers(20, 2);
        System.out.println(result);
        System.out.println(calculator.divideTwoNumbers02(20, 0));
        System.out.println("----------------------");
        calculator.printTwoNumbersDivided(20,0);
    }
}
