package academy.devdojo.javaoneforall.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("folder/test.txt");
        if(Files.notExists(path)) Files.createFile(path);
        Files.setAttribute(path,"dos:readonly", false);
        Files.setAttribute(path,"dos:hidden", false);
        DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);
        System.out.println(dosFileAttributes.isReadOnly());
        System.out.println(dosFileAttributes.isHidden());

        DosFileAttributeView fileAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class);
        fileAttributeView.setHidden(true);
        fileAttributeView.setReadOnly(true);

        System.out.println(fileAttributeView.readAttributes().isReadOnly());
        System.out.println(fileAttributeView.readAttributes().isHidden());

    }
}
