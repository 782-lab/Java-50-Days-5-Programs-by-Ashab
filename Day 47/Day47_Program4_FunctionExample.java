import java.util.function.Function;

class Day47_Program4_FunctionExample {
    public static void main(String[] args) {

        Function<Integer, Integer> square = n -> n * n;

        System.out.println("Square of 5 = " + square.apply(5));
    }
}