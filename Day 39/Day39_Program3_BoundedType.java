class Calculator<T extends Number> {
    double square(T num) {
        return num.doubleValue() * num.doubleValue();
    }
}

class Day39_Program3_BoundedType {
    public static void main(String[] args) {
        Calculator<Integer> calc = new Calculator<>();
        System.out.println("Square = " + calc.square(5));
    }
}
