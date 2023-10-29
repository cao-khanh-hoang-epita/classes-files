package Revision;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class FileContentManipulation {
    public static void main(String[] args) {
        File file = new File("E:\\Epita\\semester 3 - Java\\file.txt");
        File outputFile = new File("E:\\Epita\\semester 3 - Java\\output.txt");

        if (file.canRead()) {
            System.out.println("This File can Read!");

            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                StringBuilder content = new StringBuilder();

                while ((line = reader.readLine()) != null) {
                    content.append(line).append("\n");
                }

                // Extract the desired part of the content
                String extractedContent = extractContent(content.toString());
                
                // Write the extracted content to a new file
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
                    writer.write(extractedContent);
                }

                System.out.println(extractedContent);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("This File cannot be Read!");
        }
    }

    private static String extractContent(String fullText) {
        String targetString = "Object-oriented programming language";
        int offset = fullText.indexOf(targetString);
        if (offset != -1) {
            return fullText.substring(offset);
        }
        return "";
    }
}
