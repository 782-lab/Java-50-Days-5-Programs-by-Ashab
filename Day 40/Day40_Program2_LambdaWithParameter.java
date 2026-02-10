interface Add {
    int sum(int a, int b);
}

class Day40_Program2_LambdaWithParameter {
    public static void main(String[] args) {

        Add add = (a, b) -> a + b;

        System.out.println("Sum = " + add.sum(10, 20));
    }
}
