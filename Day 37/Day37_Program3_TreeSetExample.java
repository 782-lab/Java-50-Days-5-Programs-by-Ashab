import java.util.TreeSet;

class Day37_Program3_TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(50);
        set.add(10);
        set.add(30);

        System.out.println("TreeSet Elements (Sorted):");
        System.out.println(set);
    }
}
