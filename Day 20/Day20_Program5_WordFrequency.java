class Day20_Program5_WordFrequency {
    public static void main(String[] args) {
        String sentence = "java is easy and java is powerful";
        String word = "java";
        int count = 0;

        String[] words = sentence.split(" ");

        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
        }

        System.out.println("Word '" + word + "' occurs " + count + " times");
    }
}
