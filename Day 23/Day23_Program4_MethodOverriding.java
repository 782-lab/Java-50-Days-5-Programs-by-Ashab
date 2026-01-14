class Bank {
    double getInterestRate() {
        return 5.0;
    }
}

class SBI extends Bank {
    double getInterestRate() {
        return 6.5;
    }
}

class Day23_Program4_MethodOverriding {
    public static void main(String[] args) {
        Bank b = new SBI(); // Runtime polymorphism
        System.out.println("Interest Rate = " + b.getInterestRate() + "%");
    }
}
