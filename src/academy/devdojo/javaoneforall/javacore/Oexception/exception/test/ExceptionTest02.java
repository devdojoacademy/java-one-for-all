package academy.devdojo.javaoneforall.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) {
    customFileCreator();
    }

    private static void customFileCreator(){
        File file = new File("folder\\test.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("File created "+isCreated);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Something happened when creating the file");
        }
        System.out.println("Outside custom file creator");
    }
}
