class Day9_Program5_DiamondPattern {
    public static void main(String[] args) {
        int n = 5;

        // Upper Half
        for (int i = 1; i <= n; i++) {
            for (int space = n - i; space > 0; space--) {
                System.out.print(" ");
            }
            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower Half
        for (int i = n - 1; i >= 1; i--) {
            for (int space = n - i; space > 0; space--) {
                System.out.print(" ");
            }
            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

