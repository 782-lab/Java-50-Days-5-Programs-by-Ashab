import java.util.HashSet;

class Day37_Program4_RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        System.out.println("Array without duplicates:");
        System.out.println(set);
    }
}

