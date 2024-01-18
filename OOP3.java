import java.util.*;

class One{
    // int v;
    int a;
    public One(int a){
        //this keyword is used when we the var in the par. and global are same
        // this.v = a;
        this.a = a;     //without this it will give error
    }
    public int getone(){
        return a;
    }
    public void meth2(){
        System.out.println("this is the method of class two-1");
    }
}

class Two extends One{
    public Two(int a) {
        super(a);       //use to invoke other keyword
        System.out.println("this constructore is running");
    }
    @Override    //this is not nessary but it is a good practice to always use this as sometimes while makeing changes if there is no overridding then we will get an error
    public void meth2(){
        System.out.println("This is the method of class two-2");
    }
}

public class OOP3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int a = sc.nextInt();
        One o = new One(a);        //if we call the method with o then it will get value=a
        Two t = new Two(20);       //if we call it with t then it will get 20 
        System.out.println(t.getone());
        o.meth2();
        t.meth2();
    }
}