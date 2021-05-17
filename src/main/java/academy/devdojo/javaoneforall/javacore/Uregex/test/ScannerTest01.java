package academy.devdojo.javaoneforall.javacore.Uregex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String text = "Levi,Eren,Mikasa,true,200";
        String[] names = text.split("\\d");
        for (String name : names) {
            System.out.println(name.trim());
        }

    }
}
