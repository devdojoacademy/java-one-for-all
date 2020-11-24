package academy.devdojo.javaoneforall.introduction;

public class Class04Operators {
    public static void main(String[] args) {
        // + - / *
        int number01 = 10;
        int number02 = 20;
        double result = number01 / (double) number02;

        System.out.println(result);

        // %
        int modulo = 21 % 7;
        System.out.println(modulo);

        // < > <= >= != ==
        boolean isTenLowerThanTwenty = 10 < 20;
        boolean isTenGreaterThanTwenty = 10 > 20;
        boolean isTenLowerOrEqualsThanTwenty = 10 <= 20;
        boolean isTenGreaterOrEqualsThanTwenty = 10 >= 20;
        boolean isTenDifferentThanTwenty = 10 != 20;
        boolean isTenEqualsTwenty = 10 == 10;
        System.out.println("isTenLowerThanTwenty "+isTenLowerThanTwenty);
        System.out.println("isTenGreaterThanTwenty "+isTenGreaterThanTwenty);
        System.out.println("isTenLowerOrEqualsThanTwenty "+isTenLowerOrEqualsThanTwenty);
        System.out.println("isTenGreaterOrEqualsThanTwenty "+isTenGreaterOrEqualsThanTwenty);
        System.out.println("isTenDifferentThanTwenty "+isTenDifferentThanTwenty);
        System.out.println("isTenEqualsTwenty "+isTenEqualsTwenty);

        // && (AND) || OR !

        int age = 29;
        float salary = 3500F;
        boolean isLegalOlderThanThirty = age >= 30 && salary >= 4612;
        boolean isLegalYoungerThanThirty = age < 30 && salary >= 3381;
        System.out.println("isLegalOlderThanThirty "+ isLegalOlderThanThirty);
        System.out.println("isLegalYoungerThanThirty "+ isLegalYoungerThanThirty);


    }
}
