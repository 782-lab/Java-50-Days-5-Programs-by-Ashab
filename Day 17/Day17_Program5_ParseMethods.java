class Day17_Program5_ParseMethods {
    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "45.67";

        int a = Integer.parseInt(num1);
        double b = Double.parseDouble(num2);

        System.out.println("Parsed int = " + a);
        System.out.println("Parsed double = " + b);
    }
}
