class Day7_Program3_CountDigits {
    public static void main(String[] args) {
        int num = 98765;
        int count = 0;

        while (num != 0) {
            num = num / 10;
            count++;
        }

        System.out.println("Total Digits = " + count);
    }
}
