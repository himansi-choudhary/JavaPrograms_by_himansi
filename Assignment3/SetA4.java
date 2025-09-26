package assignment3;

import java.io.*;

public class SetA4 {
    public static void main(String[] args) {
        BufferedReader reader = null;
        int charCount = 0, wordCount = 0, lineCount = 0;

        try {
            // File path relative to the project root (labprogram/index.txt)
            File file = new File("input.txt");

            if (!file.exists()) {
                System.out.println("File not found: " + file.getAbsolutePath());
                return;
            }

            reader = new BufferedReader(new FileReader(file));
            String line;

            while ((line = reader.readLine()) != null) {
                lineCount++;  // Count lines
                charCount += line.length(); // Count characters

                // Remove leading/trailing spaces, split by whitespace
                String[] words = line.trim().split("\\s+");

                if (!line.trim().isEmpty()) {
                    wordCount += words.length; // Count words
                }
            }

            System.out.println("File Statistics:");
            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        } finally {
            try {
                if (reader != null) reader.close();
            } catch (IOException e) {
                System.out.println("Error closing the file: " + e.getMessage());
            }
        }
    }
}

