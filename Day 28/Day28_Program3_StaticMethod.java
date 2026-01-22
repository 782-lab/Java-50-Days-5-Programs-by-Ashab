class MathUtil {
    static int square(int n) {
        return n * n;
    }
}

class Day28_Program3_StaticMethod {
    public static void main(String[] args) {
        System.out.println("Square = " + MathUtil.square(5));
    }
}
