class Day31_Program3_FinallyBlock {
    public static void main(String[] args) {
        try {
            int a = 10 / 2;
            System.out.println("Result = " + a);
        } catch (Exception e) {
            System.out.println("Exception occurred");
        } finally {
            System.out.println("Finally block always executes");
        }
    }
}
