class Day15_Program1_WordCount {
    public static void main(String[] args) {
        String str = "Java is very powerful";
        int count = 0;

        String[] words = str.split(" ");

        count = words.length;

        System.out.println("Number of Words = " + count);
    }
}
