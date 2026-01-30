class MyThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

class Day34_Program3_ThreadSleep {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
