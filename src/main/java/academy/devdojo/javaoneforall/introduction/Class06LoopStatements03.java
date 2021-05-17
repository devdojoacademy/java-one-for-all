package academy.devdojo.javaoneforall.introduction;

public class Class06LoopStatements03 {
    public static void main(String[] args) {
        // Given a total number, for example 50, print the first 25
        int maxNumber = 50;
        for (int i = 0; i <= maxNumber; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("Outside for");
    }
}
