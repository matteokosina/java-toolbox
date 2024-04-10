package src;

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

    /** Method to check if a string is a palindrome
     *
     * @param str input to check for palindrome
     * @return boolean is or is not a palindrom
     */
    public static boolean isPalindrome(String str) {
        // Remove non-alphanumeric characters and convert to lowercase
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if the string is empty or has only one character (it is a palindrome)
        if (cleanStr.isEmpty() || cleanStr.length() == 1) {
            return true;
        }

        // Check if the string is a palindrome by comparing characters from start and end
        int left = 0;
        int right = cleanStr.length() - 1;
        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false; // Characters don't match, not a palindrome
            }
            left++;
            right--;
        }
        return true; // All characters match, it is a palindrome
    }
    /**
     * A class to create your own exception
     */
    class DivZeroException extends Exception {
        public DivZeroException(){
        }
        public DivZeroException(String message){
            super(message);
        }
    }
}
