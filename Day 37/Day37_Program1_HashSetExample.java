import java.util.HashSet;

class Day37_Program1_HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("Java"); // Duplicate

        System.out.println("HashSet Elements:");
        System.out.println(set);
    }
}
