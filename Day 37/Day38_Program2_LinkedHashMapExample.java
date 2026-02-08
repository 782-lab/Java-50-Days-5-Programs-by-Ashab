import java.util.LinkedHashMap;

class Day38_Program2_LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Blue");

        System.out.println("LinkedHashMap Elements:");
        System.out.println(map);
    }
}
