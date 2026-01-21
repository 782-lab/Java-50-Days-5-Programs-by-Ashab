interface Bank {
    double getInterestRate();
}

class SBI implements Bank {
    public double getInterestRate() {
        return 6.5;
    }
}

class HDFC implements Bank {
    public double getInterestRate() {
        return 7.0;
    }
}

class Day27_Program4_BankingInterface {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();

        System.out.println("SBI Interest = " + b1.getInterestRate() + "%");
        System.out.println("HDFC Interest = " + b2.getInterestRate() + "%");
    }
}
