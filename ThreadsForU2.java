class MyThr extends Thread {
    public MyThr(String name) {
        super(name);
    }

    public void run() {
        // int a = 33;
        System.out.println("hello there");
    }
}

public class ThreadsForU2 {
    public static void main(String args[]) {
        MyThr t1 = new MyThr("Nandini1");
        MyThr t2 = new MyThr("Nandini2");
        MyThr t3 = new MyThr("Nandini3");
        // t1.setPriority(Thread.MIN_PRIORITY);       //use to set priority of a thread
        // t2.setPriority(Thread.MAX_PRIORITY);      
        // t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        try{
            t1.join();         // till t1 does not ends t2 dont start
            // Thread.sleep(3000);
        }
        catch(Exception e){
            System.out.println(e);
        }
        t2.start();
        t3.start();
    }
}

