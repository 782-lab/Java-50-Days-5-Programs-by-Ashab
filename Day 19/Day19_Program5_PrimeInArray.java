class Day19_Program5_PrimeInArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 7, 9, 11};

        System.out.println("Prime Numbers in Array:");

        for (int num : arr) {
            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
