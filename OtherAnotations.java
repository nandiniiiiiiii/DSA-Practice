import Nandini.*;

@FunctionalInterface
interface Myinterface{
    void thismethod();
    // void thismethod2();                //it will not allow more then one abstract method
}

class Str extends Packages {
    @Override
    public void strmethod() {
        System.out.println("this is the string class with is overriding");     //overriding
    }

    @Deprecated
    public int sum(int a,int b){
        return a+b;
    }
}

public class OtherAnotations {
    // Avotations - provide meta data to the class/method
    public static void main(String[] args) {
        Str s = new Str();
        s.strmethod(); // extends Nandini package

        int x = s.sum(10, 10);
        System.out.println(x);
    }
}
