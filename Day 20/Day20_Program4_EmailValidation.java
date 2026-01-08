class Day20_Program4_EmailValidation {
    public static void main(String[] args) {
        String email = "example@gmail.com";

        if (email.contains("@") && email.contains(".")) {
            System.out.println("Email format is Valid");
        } else {
            System.out.println("Email format is Invalid");
        }
    }
}
