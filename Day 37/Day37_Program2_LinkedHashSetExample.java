import java.util.LinkedHashSet;

class Day37_Program2_LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.add(10);
        set.add(20);
        set.add(10); // Duplicate

        System.out.println("LinkedHashSet Elements:");
        System.out.println(set);
    }
}

