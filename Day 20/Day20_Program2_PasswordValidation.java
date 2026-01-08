class Day20_Program2_PasswordValidation {
    public static void main(String[] args) {
        String password = "Java@123";

        if (password.length() >= 8) {
            System.out.println("Password is Valid");
        } else {
            System.out.println("Password is Invalid");
        }
    }
}
