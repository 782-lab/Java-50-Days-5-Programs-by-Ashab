import java.util.Optional;

class Day42_Program2_OptionalCheck {
    public static void main(String[] args) {

        Optional<String> optional = Optional.of("Java");

        if (optional.isPresent()) {
            System.out.println("Value = " + optional.get());
        }
    }
}
