package threadwait;

class WaitDemo {
    synchronized void waitingMethod() {
        System.out.println("Thread is going to wait...");
        try {
            wait();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thread resumed after notify");
    }

    synchronized void notifyMethod() {
        System.out.println("Notifier thread will notify");
        notify();
    }
}

public class ThreadWait {

    public static void main(String[] args) {

        final WaitDemo obj = new WaitDemo();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                obj.waitingMethod();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch(Exception e) {}
                obj.notifyMethod();
            }
        });

        t1.start();
        t2.start();
    }
    
}