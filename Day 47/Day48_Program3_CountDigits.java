class Day48_Program3_CountDigits {
    public static void main(String[] args) {

        int num = 987654;
        int count = 0;

        while (num > 0) {
            num /= 10;
            count++;
        }

        System.out.println("Total Digits = " + count);
    }
}