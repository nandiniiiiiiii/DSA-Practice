class TRunnable implements Runnable{
    public void run(){
        System.out.println("I am a thread1");
    }
}

//one way of creating a threat
class TRunnable2 implements Runnable{
    public void run(){
        System.out.println("I am a thread2");
    }
}

//2nd way of creating athreat
class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }

    public void run2(){
        System.out.println("hello world ");
    }
}

public class ThreadsForU {
    public static void main(String args[]){
        // TRunnable t1 = new TRunnable();         //creating an obj of the runnable class
        // Thread tt1 = new Thread(t1);            // creating thread for the class obj
        // TRunnable2 t2 = new TRunnable2();   
        // Thread tt2 = new Thread(t2);

        // tt1.start();
        // tt2.start();

        //with extend we can directly call the class obj
        MyThread thr1 = new MyThread("Nandini");
        thr1.start();
        // System.out.println("Name is: "+thr1.getName());

    }
}
