class Login {
    private String username = "admin";
    private String password = "1234";

    public boolean authenticate(String u, String p) {
        return username.equals(u) && password.equals(p);
    }
}

class Day25_Program4_LoginSystem {
    public static void main(String[] args) {
        Login login = new Login();

        if (login.authenticate("admin", "1234")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }
    }
}
