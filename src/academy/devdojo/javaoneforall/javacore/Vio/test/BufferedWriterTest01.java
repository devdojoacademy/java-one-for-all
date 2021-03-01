package academy.devdojo.javaoneforall.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file);
            BufferedWriter br = new BufferedWriter(fw)) {
            br.write("This is a message from DevDojo Academy for you <3");
            br.newLine();
            br.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
