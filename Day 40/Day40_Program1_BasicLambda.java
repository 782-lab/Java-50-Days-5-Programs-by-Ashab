interface MyInterface {
    void sayHello();
}

class Day40_Program1_BasicLambda {
    public static void main(String[] args) {

        MyInterface obj = () -> {
            System.out.println("Hello from Lambda!");
        };

        obj.sayHello();
    }
}
