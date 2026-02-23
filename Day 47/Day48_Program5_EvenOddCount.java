class Day48_Program5_EvenOddCount {
    public static void main(String[] args) {

        int[] arr = {10, 15, 20, 25, 30};
        int even = 0, odd = 0;

        for (int n : arr) {
            if (n % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even Count = " + even);
        System.out.println("Odd Count = " + odd);
    }
}