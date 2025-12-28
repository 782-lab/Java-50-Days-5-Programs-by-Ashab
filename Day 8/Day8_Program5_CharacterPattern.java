class Day8_Program5_CharacterPattern {
    public static void main(String[] args) {
        int n = 5;
        char ch = 'A';

        for (int i = 1; i <= n; i++) {
            char temp = ch;
            for (int j = 1; j <= i; j++) {
                System.out.print(temp + " ");
                temp++;
            }
            System.out.println();
        }
    }
}
