package academy.devdojo.javaoneforall.introduction;

public class Class06LoopStatements01 {
    public static void main(String[] args) {
        // while, do-while, for
        int counter = 12;
        while (counter < 10) {
            System.out.println(++counter);
        }
        counter = 20;
        do {
            System.out.println("Inside do while " + ++counter);
        } while (counter < 10);

        for(int i=0;i<10;i++){
            System.out.println("inside for "+i);
        }

    }
}
