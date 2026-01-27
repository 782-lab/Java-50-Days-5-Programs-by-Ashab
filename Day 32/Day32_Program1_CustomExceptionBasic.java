class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}

class Day32_Program1_CustomExceptionBasic {
    public static void main(String[] args) {
        try {
            throw new MyException("This is a custom exception");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
