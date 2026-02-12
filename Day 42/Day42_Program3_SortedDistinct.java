import java.util.Arrays;
import java.util.List;

class Day42_Program3_SortedDistinct {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 3, 1, 3, 2, 5);

        numbers.stream()
               .distinct()
               .sorted()
               .forEach(System.out::println);
    }
}
