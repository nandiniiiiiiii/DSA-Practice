class MyThr1 extends Thread {
    //run is not a var. it is a constant 
    public void run() {
        // int a = 33;
        System.out.println("hello world");
    }
}

class MyThr2 extends Thread {
    public void run() {
        // int a = 33;
        try{
            Thread.sleep(2000);     //will delay the execution of this tread by 200ms
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Welcom");
    }
}

public class Practice {
    public static void main(String args[]) {
        MyThr1 t1 = new MyThr1();
        MyThr2 t2 = new MyThr2();
        // t1.setPriority(Thread.MIN_PRIORITY);
        // t2.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(3);
        t2.setPriority(4);
        System.out.println(t1.getPriority()); 
        System.out.println(t2.getPriority()); 
        t1.start();
        t2.start();

    }
}
