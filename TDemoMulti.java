package myjava;

class TDemoMulti implements Runnable {

    Thread t;
    String name;

    TDemoMulti(String n) {
        name = n;
        t = new Thread(this, name);
        t.start();
    }

    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(name + " thread " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class TDemoChilds {

    public static void main(String args[]) {

        TDemoMulti td1 = new TDemoMulti("T1");
        TDemoMulti td2 = new TDemoMulti("T2");

        td1.t.setPriority(10);
        td2.t.setPriority(1);
    }
}
