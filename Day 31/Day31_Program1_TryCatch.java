class Day31_Program1_TryCatch {
    public static void main(String[] args) {
        try {
            int a = 10 / 0; // ArithmeticException
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        System.out.println("Program continues...");
    }
}
