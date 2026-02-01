class Resource1 {}
class Resource2 {}

class MyThread1 extends Thread {
    Resource1 r1;
    Resource2 r2;

    MyThread1(Resource1 r1, Resource2 r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    public void run() {
        synchronized (r1) {
            System.out.println("Thread1 locked Resource1");
            synchronized (r2) {
                System.out.println("Thread1 locked Resource2");
            }
        }
    }
}

class MyThread2 extends Thread {
    Resource1 r1;
    Resource2 r2;

    MyThread2(Resource1 r1, Resource2 r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    public void run() {
        synchronized (r2) {
            System.out.println("Thread2 locked Resource2");
            synchronized (r1) {
                System.out.println("Thread2 locked Resource1");
            }
        }
    }
}

class Day35_Program4_Deadlock {
    public static void main(String[] args) {
        Resource1 r1 = new Resource1();
        Resource2 r2 = new Resource2();

        new MyThread1(r1, r2).start();
        new MyThread2(r1, r2).start();
    }
}
