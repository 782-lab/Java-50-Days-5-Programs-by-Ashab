class Day17_Program2_Unboxing {
    public static void main(String[] args) {
        Integer obj = Integer.valueOf(25);

        int a = obj.intValue(); // Unboxing

        System.out.println("Wrapper Integer = " + obj);
        System.out.println("Primitive int = " + a);
    }
}
