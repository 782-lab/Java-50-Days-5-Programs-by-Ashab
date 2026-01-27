class LoginException extends Exception {
    LoginException(String msg) {
        super(msg);
    }
}

class LoginSystem {
    void login(String user, String pass) throws LoginException {
        if (!user.equals("admin") || !pass.equals("1234")) {
            throw new LoginException("Invalid Username or Password");
        } else {
            System.out.println("Login Successful");
        }
    }
}

class Day32_Program4_LoginException {
    public static void main(String[] args) {
        LoginSystem ls = new LoginSystem();

        try {
            ls.login("admin", "0000");
        } catch (LoginException e) {
            System.out.println(e.getMessage());
        }
    }
}

