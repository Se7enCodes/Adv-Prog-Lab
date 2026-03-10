package tdemo;

class TDemoThread implements Runnable{
    Thread t;
    String name;
    
    TDemoThread(String n){
        name = n;
        t = new Thread(this, name);
        t.start();
    }

    public void run(){
        try{
            for(int i=1;i<=5;i++){
                System.out.println(name + " : " + i);
//                Thread.sleep(1000); //Comment out to implement context switching/. The order of execution is non-deterministic. The order of output may change everytime.
                if(i == 3){
                    Thread.sleep(5000);
                }
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}

public class TDemo {

    public static void main(String[] args) {
        new TDemoThread("Thread1");
        new TDemoThread("Thread2");
    }
    
}