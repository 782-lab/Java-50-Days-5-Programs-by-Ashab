class Day40_Program4_LambdaThread {
    public static void main(String[] args) {

        Runnable r = () -> {
            System.out.println("Thread running using Lambda");
        };

        Thread t = new Thread(r);
        t.start();
    }
}
