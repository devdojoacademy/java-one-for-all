package academy.devdojo.javaoneforall.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
    public static void main(String[] args) {
        Path zipFile = Paths.get("folder/file.zip");
        Path sourceFiles = Paths.get("folder/subfolder1/subsubfolder1");
        zip(zipFile, sourceFiles);
    }

    private static void zip(Path zipFile, Path sourceFiles) {
        try (ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(zipFile));
             DirectoryStream<Path> directoryStream = Files.newDirectoryStream(sourceFiles)) {
            for(Path file: directoryStream){
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                zipStream.putNextEntry(zipEntry);
                Files.copy(file, zipStream);
                zipStream.closeEntry();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
