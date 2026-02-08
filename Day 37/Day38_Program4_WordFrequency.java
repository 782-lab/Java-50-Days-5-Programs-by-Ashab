import java.util.HashMap;

class Day38_Program4_WordFrequency {
    public static void main(String[] args) {
        String sentence = "java is easy and java is powerful";
        String[] words = sentence.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Frequency:");
        System.out.println(map);
    }
}

