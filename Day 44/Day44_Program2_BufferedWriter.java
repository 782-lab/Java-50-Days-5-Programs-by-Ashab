import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class Day44_Program2_BufferedWriter {
    public static void main(String[] args) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("buffer.txt"))) {

            bw.write("Hello Buffered Writer");
            bw.newLine();
            bw.write("Second Line");

            System.out.println("Data written successfully");

        } catch (IOException e) {
            System.out.println("Error writing file");
        }
    }
}
