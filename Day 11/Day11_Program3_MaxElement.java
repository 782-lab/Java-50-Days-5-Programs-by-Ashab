class Day11_Program3_MaxElement {
    public static void main(String[] args) {
        int[] arr = {25, 60, 15, 90, 45};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum Element = " + max);
    }
}
