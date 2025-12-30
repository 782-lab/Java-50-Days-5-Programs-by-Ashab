class Day10_Program5_HCF {
    public static void main(String[] args) {
        int a = 36, b = 60;
        int hcf = 1;

        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }

        System.out.println("HCF = " + hcf);
    }
}

