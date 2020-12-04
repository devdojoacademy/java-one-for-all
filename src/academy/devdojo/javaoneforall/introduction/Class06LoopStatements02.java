package academy.devdojo.javaoneforall.introduction;

public class Class06LoopStatements02 {
    // Print all even numbers from 0 to 1000000
    public static void main(String[] args) {
        for (int i = 0; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
