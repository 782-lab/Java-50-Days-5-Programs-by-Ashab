import java.util.Optional;

class Day42_Program1_OptionalBasic {
    public static void main(String[] args) {

        String name = null;

        Optional<String> optional = Optional.ofNullable(name);

        System.out.println(optional.orElse("Default Name"));
    }
}

