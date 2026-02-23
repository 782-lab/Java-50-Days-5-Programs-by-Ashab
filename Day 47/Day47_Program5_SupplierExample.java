import java.util.function.Supplier;

class Day47_Program5_SupplierExample {
    public static void main(String[] args) {

        Supplier<Double> randomValue = () -> Math.random();

        System.out.println("Random Value: " + randomValue.get());
    }
}