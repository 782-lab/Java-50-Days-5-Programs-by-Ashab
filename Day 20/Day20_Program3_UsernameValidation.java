class Day20_Program3_UsernameValidation {
    public static void main(String[] args) {
        String username = "Ashab123";

        if (!username.contains(" ")) {
            System.out.println("Username is Valid");
        } else {
            System.out.println("Username is Invalid");
        }
    }
}

