import java.util.ArrayList;

interface Demointer {
    void meth1();

    void meth2();
}

class Demclass implements Demointer {
    @Override
    public void meth1() {
        System.out.println("this is meth one");
    }

    @Override
    public void meth2() {
        System.out.println("this is meth two");
    }
}

@FunctionalInterface
interface Demointer2 {
    void meth1(int a);
}

//constructiong generic classes
class Mygen<T1>{
    int val;
    private T1 t1;       //here T1 is a data type like int

    public Mygen(int val,T1 t1){
        this.val = val;
        this.t1 = t1;
    }

    public int getval(){
        return val;
    }

    public void setval(int val){
        this.val = val;
    }

    public T1 getT1(){
        return t1;
    }

    public void setT1(T1 t1){
        this.t1 = t1;
    }
}

public class Lambdafun {
    public static void main(String[] args) {
        // Demclass d1 = new Demclass();
        // d1.meth1();

        // demo class - when a class needs to implemented only once then we create a
        // sudo class via interface
        // Demointer d2 = new Demointer() {
        // @Override
        // public void meth1() {
        // System.out.println("this is meth one");
        // }

        // @Override
        // public void meth2() {
        // System.out.println("this is meth two");
        // }
        // };
        // d2.meth1();
        // d2.meth2();

        // Lambda Exression
        Demointer2 obj = (a)->{System.out.println("This is the lambda function "+a);};
        obj.meth1(10);

        //Java Generics
        // ArrayList<Integer> arr = new ArrayList();
        ArrayList arr = new ArrayList();
        arr.add(100);
        arr.add(39);

        // int a = arr.get(1);
        int a = (int) arr.get(0);    //if arr is not defined as integer then a needs to be defined as int
        // System.out.println(a);

        //constructiong generic classes
        //now here we cant use anything other then a str in this fun
        Mygen<String> g1 = new Mygen(10, "Hello world");
        String str = g1.getT1();
        System.out.println(str);
    }
}
