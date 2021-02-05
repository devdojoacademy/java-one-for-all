package academy.devdojo.javaoneforall.javacore.Pwrapper.test;

import java.util.List;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;


        Byte byteW = 1;
        Short shortW = 1; //autoboxing
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW; //unboxing
        boolean booleanValue = Boolean.parseBoolean(null);
        System.out.println(booleanValue);
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetter('9'));
        System.out.println(Character.isLetterOrDigit('9'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.toUpperCase('!'));
        System.out.println(Character.isLowerCase('9'));
        System.out.println(Character.toLowerCase('9'));


    }
}
