import java.util.Arrays;
import java.util.List;

class Day41_Program4_StreamCount {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ashab", "Aman", "Ravi", "Amit");

        long count = names.stream()
                          .filter(name -> name.startsWith("A"))
                          .count();

        System.out.println("Names starting with A = " + count);
    }
}
