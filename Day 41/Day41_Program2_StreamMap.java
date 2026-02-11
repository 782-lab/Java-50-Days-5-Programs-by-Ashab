import java.util.Arrays;
import java.util.List;

class Day41_Program2_StreamMap {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        numbers.stream()
               .map(n -> n * n)
               .forEach(System.out::println);
    }
}
