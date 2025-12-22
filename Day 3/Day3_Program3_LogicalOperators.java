class Day3_Program3_LogicalOperators {
    public static void main(String[] args) {
        int age = 20;

        System.out.println("Age > 18 AND < 60 : " + (age > 18 && age < 60));
        System.out.println("Age < 18 OR > 60  : " + (age < 18 || age > 60));
        System.out.println("NOT (age > 18)    : " + !(age > 18));
    }
}
