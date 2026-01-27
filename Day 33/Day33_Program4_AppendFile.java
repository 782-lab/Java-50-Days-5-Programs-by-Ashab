import java.io.FileWriter;
import java.io.IOException;

class Day33_Program4_AppendFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("demo.txt", true);
            writer.write("\nAppending new line");
            writer.close();
            System.out.println("Data appended");
        } catch (IOException e) {
            System.out.println("Error occurred");
        }
    }
}
