import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Day43_Program4_DateFormatting {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formatted = now.format(formatter);

        System.out.println("Formatted Date: " + formatted);
    }
}

