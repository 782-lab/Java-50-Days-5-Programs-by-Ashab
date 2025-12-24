class Day4_Program3_GreatestOfThree {
    public static void main(String[] args) {
        int a = 12, b = 45, c = 30;

        if (a > b && a > c) {
            System.out.println(a + " is greatest");
        } else if (b > a && b > c) {
            System.out.println(b + " is greatest");
        } else {
            System.out.println(c + " is greatest");
        }
    }
}
