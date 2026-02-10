@FunctionalInterface
interface Square {
    int calculate(int x);
}

class Day40_Program3_FunctionalInterface {
    public static void main(String[] args) {

        Square s = (x) -> x * x;

        System.out.println("Square = " + s.calculate(5));
    }
}
