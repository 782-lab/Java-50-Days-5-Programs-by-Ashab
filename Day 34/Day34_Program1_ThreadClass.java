class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running using Thread class");
    }
}

class Day34_Program1_ThreadClass {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
