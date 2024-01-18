// abstract class Parent{
//     public Parent(){
//         System.out.println("this is the class constructore");
//     }
//     public void sayhello(){
//         System.out.println("Hello all");
//     }
//     abstract public void greet();
// }

// class Child extends Parent{
//     @Override
//     public void greet(){
//         System.out.println("this is the over ride class");
//     }
// }

// public class Abstract {
//     public static void main(String args[]){

//     }
// }

//many interface can be implemented at the same time while classes can only be implemented at once
interface Cycle{
    int a=3;        //this value cant be changed 
    void applyBreak(int a);
    void speedUp(int b);
}

interface Horn{
    void blowHorn();
}

//here we can implement all the class
class AvonCycle implements Cycle, Horn{
    public void blowHorn(){
        System.out.println("pee pee poo poo");
    }
    public void applyBreak(int a){
        System.out.println("push the break");
    }
    //all the implemented methods must be public
    public void speedUp(int b){
        System.out.println("This is how we speed up");
    }
}

public class Abstract {
    public static void main(String args[]){
        AvonCycle a1 = new AvonCycle();
        a1.applyBreak(1);
    }
}