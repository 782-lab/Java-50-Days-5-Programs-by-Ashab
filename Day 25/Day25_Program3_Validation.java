class BankAccount {
    private double balance;

    public void setBalance(double b) {
        if (b >= 0) {
            balance = b;
        } else {
            System.out.println("Invalid Balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class Day25_Program3_Validation {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setBalance(10000);

        System.out.println("Balance = " + acc.getBalance());
    }
}
