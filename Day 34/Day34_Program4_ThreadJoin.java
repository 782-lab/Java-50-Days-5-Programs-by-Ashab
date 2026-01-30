class MyThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

class Day34_Program4_ThreadJoin {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();

        try {
            t.join();
        } catch (InterruptedException e) {
            System.out.println("Main interrupted");
        }

        System.out.println("Main thread finished");
    }
}
