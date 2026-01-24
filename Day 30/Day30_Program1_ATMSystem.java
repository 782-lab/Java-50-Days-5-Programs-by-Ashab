class ATM {
    private int balance = 10000;

    void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw Successful");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void checkBalance() {
        System.out.println("Balance = " + balance);
    }
}

class Day30_Program1_ATMSystem {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.checkBalance();
        atm.withdraw(3000);
        atm.checkBalance();
    }
}
