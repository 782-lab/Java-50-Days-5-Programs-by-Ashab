import java.util.function.Consumer;

class Day47_Program3_ConsumerExample {
    public static void main(String[] args) {

        Consumer<String> print = name -> 
                System.out.println("Hello " + name);

        print.accept("Ashab");
    }
}
