package academy.devdojo.javaoneforall.introduction;

public class Class05ConditionalStatements06 {
    // Using switch, print if the day is business day or weekend
    // Giving the numbers 1 to 7, 1 being Sunday
    public static void main(String[] args) {
        byte day = 6;
        switch (day) {
            case 1:
            case 7:
                System.out.println("Weekend");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Business Day");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
}
