import java.io.FileWriter;
import java.io.IOException;

class Day33_Program2_WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("demo.txt");
            writer.write("Hello Java File Handling");
            writer.close();
            System.out.println("Data written to file");
        } catch (IOException e) {
            System.out.println("Error occurred");
        }
    }
}
