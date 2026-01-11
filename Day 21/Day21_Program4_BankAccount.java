class BankAccount {
    int accountNo;
    String holderName;
    double balance;

    void showAccount() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Holder   : " + holderName);
        System.out.println("Balance  : " + balance);
    }
}

class Day21_Program4_BankAccount {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.accountNo = 12345;
        acc.holderName = "Ashab";
        acc.balance = 15000;

        acc.showAccount();
    }
}
