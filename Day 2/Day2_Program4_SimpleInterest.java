class Day2_Program4_SimpleInterest {
    public static void main(String[] args) {
        double principal = 5000;
        double rate = 5;
        double time = 2;

        double si = (principal * rate * time) / 100;

        System.out.println("Simple Interest = " + si);
    }
}

