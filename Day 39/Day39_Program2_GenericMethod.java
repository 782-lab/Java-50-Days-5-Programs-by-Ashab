class Util {
    static <T> void printArray(T[] arr) {
        for (T element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

class Day39_Program2_GenericMethod {
    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3};
        String[] words = {"Java", "Python"};

        Util.printArray(nums);
        Util.printArray(words);
    }
}
