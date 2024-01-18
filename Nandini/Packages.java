package Nandini;

public class Packages {
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

    public void strmethod() {
        System.out.println("this is the string class");
    }

    public static void main(String args[]) {
        System.out.println("This is the package funciton");
    }
}
