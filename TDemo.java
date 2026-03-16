package myjava;

class TDemo implements Runnable {

    Thread t;
    String name;

    TDemo(String n) {
        name = n;
        t = new Thread(this, name);
        t.start();
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child thread " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String args[]) {
        TDemo td = new TDemo("T1");

        for (int i = 100; i < 110; i++) {
            System.out.println("Main thread " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
