import Nandini.Packages;

class C1 {
    public int a = 5;
    int b = 10;
    protected int cat = 3;
    private int d = 44;

    public void abcd() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(cat);
        System.out.println(d); // here we can access even the pvt ele
    }
}

class C2 extends C1 {
    public void abcde() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(cat);
        // System.out.println(d);           // here we can not access even the pvt ele
    }
}

public class UsingPackage {
    public static void main(String args[]) {
        System.out.println("this is where we use Packages");
        // Packages p1 = new Packages();
        // C1 x = new C1();
        // System.out.println(x.a);
        // System.out.println(x.b);
        // System.out.println(x.cat);
        // System.out.println(x.d); //showerror as d has pvt access
        // x.abcd();
        // C2 y = new C2();
        // System.out.println(y.a);
        // System.out.println(y.b);
        // System.out.println(y.cat);
        // System.out.println(x.d); //showerror as d has pvt access
        // y.abcde();
        // y.abcd();
        Packages p1 = new Packages();
        System.out.println(p1.a);      //only public can be accessed while importing package
        // System.out.println(p1.b);
        // System.out.println(p1.cat);
        // System.out.println(p1.d);
    }
}
