class Day2_Program2_TypeCasting {
    public static void main(String[] args) {

        int a = 10;
        double b = a;   // Implicit casting

        double x = 9.78;
        int y = (int) x; // Explicit casting

        System.out.println("Implicit Casting (int → double): " + b);
        System.out.println("Explicit Casting (double → int): " + y);
    }
}
