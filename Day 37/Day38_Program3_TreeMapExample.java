import java.util.TreeMap;

class Day38_Program3_TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(50, "A");
        map.put(10, "B");
        map.put(30, "C");

        System.out.println("TreeMap Elements (Sorted by Key):");
        System.out.println(map);
    }
}
