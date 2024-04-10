package tools;

import java.io.IOException;
import java.nio.file.*;

public class toolbox {
    /**
     * A method that creates a directory/folder and a file in the current directory
     */
    public static void CreateDirAndFile() {
        Path testDir = Paths.get("testDir");
        try {
            Files.createDirectory(testDir);
            Path testFile = testDir.resolve("testFile.txt");
            Files.createFile(testFile);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
