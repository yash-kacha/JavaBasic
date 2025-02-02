package string;

import java.io.FileWriter;
import java.io.IOException;

public class tst {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "D:\\java\\string\\yash.txt";
        
        try {
            // Create a FileWriter object
            FileWriter writer = new FileWriter(filePath);
            
            // Write content to the file
            writer.write("This is a text file created using Java.");
            
            // Close the writer
            writer.close();
            
            System.out.println("Text file created successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
