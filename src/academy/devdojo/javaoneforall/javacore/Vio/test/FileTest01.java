package academy.devdojo.javaoneforall.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("isCreated "+isCreated);
            boolean exists = file.exists();
            System.out.println("exists "+ exists);
            System.out.println("path "+file.getPath());
            System.out.println("absolute path "+file.getAbsolutePath());
            System.out.println("isFile "+file.isFile());
            System.out.println("isDirectory "+file.isDirectory());
            System.out.println("isHidden "+file.isHidden());
            System.out.println("last modified "+ Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
            if(exists){
                boolean isDeleted = file.delete();
                System.out.println("isDeleted "+isDeleted);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
