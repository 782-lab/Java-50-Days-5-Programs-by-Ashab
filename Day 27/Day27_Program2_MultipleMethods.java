interface Calculator {
    int add(int a, int b);
    int sub(int a, int b);
}

class SimpleCalculator implements Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}

class Day27_Program2_MultipleMethods {
    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();
        System.out.println("Add = " + calc.add(10, 5));
        System.out.println("Sub = " + calc.sub(10, 5));
    }
}
