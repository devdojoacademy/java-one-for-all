package academy.devdojo.javaoneforall.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileFolder = new File("folder");
        boolean isFolderCreated = fileFolder.mkdir();
        System.out.println("isFolderCreated "+isFolderCreated);

        File file = new File(fileFolder,"file.txt");
        boolean isFileCreated = file.createNewFile();
        System.out.println("isFileCreated "+isFileCreated);

        File fileRenamed = new File(fileFolder, "file_renamed.txt");
        boolean isFileRenamed = file.renameTo(fileRenamed);
        System.out.println("isFileRenamed "+isFileRenamed);

        File fileFolderRenamed = new File("folder2");
        boolean isFolderRenamed = fileFolder.renameTo(fileFolderRenamed);
        System.out.println("isFolderRenamed "+isFolderRenamed);

    }
}
