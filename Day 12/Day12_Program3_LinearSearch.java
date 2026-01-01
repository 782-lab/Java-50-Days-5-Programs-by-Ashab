class Day12_Program3_LinearSearch {
    public static void main(String[] args) {
        int[] arr = {15, 25, 35, 45, 55};
        int search = 35;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(search + " found in array");
        } else {
            System.out.println(search + " not found in array");
        }
    }
}
