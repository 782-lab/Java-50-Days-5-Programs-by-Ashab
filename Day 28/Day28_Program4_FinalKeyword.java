class FinalDemo {
    final int MAX = 100;

    void show() {
        System.out.println("Max Value = " + MAX);
    }
}

class Day28_Program4_FinalKeyword {
    public static void main(String[] args) {
        FinalDemo d = new FinalDemo();
        d.show();
    }
}
