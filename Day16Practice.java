import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Day16Practice {
    public static void main(String[] args) {
        
        try {
            FileWriter writer = new FileWriter("myfile.txt");
            writer.write("Hello, this is my first file!\n");
            writer.write("Learning file handling in Java.\n");
            writer.write("Day 16 practice.\n");
            writer.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing.");
        }
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader("myfile.txt"));
            String line;
            System.out.println("Reading file content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading.");
        }
        
    }
}
