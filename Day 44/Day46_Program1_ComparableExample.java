import java.util.Arrays;
import java.util.List;

class Day47_Program1_MethodReference {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Java", "Python", "C++");

        // Method Reference
        list.forEach(System.out::println);
    }
}
