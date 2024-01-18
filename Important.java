import java.util.*;

interface Camera{
    void takeSnap();
    void video();
    //we can also make private methods 
    private void greet(){
        System.out.println("Good morning");
    }
    // void filter();    //this will show error as this method is not implemented in the derived class
    //so we use default to define method here in the interface itself
    default void filter(){
        greet();      // we cant call pvt methods directly 
        System.out.println("filter are: ");
    }
}

interface Wifi{
    String[] shownetwork();
    void connect();
}

class   MyCellPhone{
    void call(int no){
        System.out.println("calling"+no);
    }
    void pickcall(){
        System.out.println("call connected.....");
    }
}

class Sp extends MyCellPhone implements Camera, Wifi{
    public void takeSnap(){
        System.out.println("Photo clicked");
    };
    public void video(){
        System.out.println("Video Taken");
    }
    public String[] shownetwork(){
        System.out.println("Avaliable networks: ");
        String[] nl = {"a","b","c"};
        return nl;
    };
    public void connect(){
        System.out.println("phone connected");
    }
}

public class Important {
    public static void main(String args[]) {
        Sp s1 = new Sp();
        s1.call(123);
        s1.pickcall();
        s1.takeSnap();
        String[] nl = s1.shownetwork();
        for (String ele : nl) {
            System.out.println(ele);
        }
        s1.filter();
    }
}