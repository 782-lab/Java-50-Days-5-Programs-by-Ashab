class Day18_Program4_CalculatorCLA {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        char op = args[2].charAt(0);

        switch (op) {
            case '+':
                System.out.println("Result = " + (a + b));
                break;
            case '-':
                System.out.println("Result = " + (a - b));
                break;
            case '*':
                System.out.println("Result = " + (a * b));
                break;
            case '/':
                System.out.println("Result = " + (a / b));
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}

