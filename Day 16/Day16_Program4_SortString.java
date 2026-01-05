class Day16_Program4_SortString {
    public static void main(String[] args) {
        String str = "java";
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("Sorted String = ");
        for (char ch : arr) {
            System.out.print(ch);
        }
    }
}

