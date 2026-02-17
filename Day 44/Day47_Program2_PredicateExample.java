import java.util.function.Predicate;

class Day47_Program2_PredicateExample {
    public static void main(String[] args) {

        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println("Is 10 Even? " + isEven.test(10));
        System.out.println("Is 7 Even? " + isEven.test(7));
    }
}
