package academy.devdojo.javaoneforall.introduction;

public class Class02PrimitiveTypes {
    public static void main(String[] args) {
        // int, double, float, boolean, char, byte, short, long
        // cast
        int age = (int) 10000000000L;
        long bigNumber = (long) 155.35;
        float salaryFloat = (float) 2500.0D;
        double salaryDouble = 2500;
        boolean trueValue = true;
        boolean falseValue = false;
        short ageShort = 32000;
        byte ageByte = 127;
        char character = '\u0041';
        System.out.println("The age is "+age+" years old");
        System.out.println(character);
        System.out.println(salaryFloat);
        System.out.println(bigNumber);
    }
}
