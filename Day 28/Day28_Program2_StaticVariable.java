class Counter {
    static int count = 0;

    Counter() {
        count++;
        System.out.println("Count = " + count);
    }
}

class Day28_Program2_StaticVariable {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();
    }
}
