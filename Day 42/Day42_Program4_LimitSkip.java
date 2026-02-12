import java.util.Arrays;
import java.util.List;

class Day42_Program4_LimitSkip {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        numbers.stream()
               .skip(1)
               .limit(3)
               .forEach(System.out::println);
    }
}

