class Day11_Program4_MinElement {
    public static void main(String[] args) {
        int[] arr = {25, 60, 15, 90, 45};
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum Element = " + min);
    }
}
