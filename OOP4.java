// class Phone {
//     public void meth1() {
//         System.out.println("This is the fun. of Phone");
//     }
// }

// class SmartPhone extends Phone {
//     public void meth2() {
//         System.out.println("this is the fun. of SmartPhone");
//     }
// }

//inheritance in interface
interface parent{
    void meth1();
    void meth2();
}

interface Child extends parent{
    void meth3();
    void meth4();
} 

class Samplclass implements Child{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
    void meth5(){
        System.out.println("meth5");
    }
}

public interface OOP4 {
    public static void main(String args[]) {
        // Phone obj = new SmartPhone(); // can only access the method of the phone class
        // SmartPhone obj = new Phone(); //will through an error
        // obj.meth1();
        // obj.meth2(); //cant be accessed as it not a phone obj

        //inheritance in interface
        // Samplclass s1 = new Samplclass();
        // s1.meth1();
        // s1.meth2();
        // s1.meth3();
        // s1.meth4();

        //polymorphism in interface
        parent p1 = new Samplclass();      //only methods of parent will run
        p1.meth1();
        // p1.meth3();    //will not run
        // p1.meth5();    //will not run
    }
}
