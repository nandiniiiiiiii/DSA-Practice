import java.util.*;
//this will be outside the public class and there can be only one public class
class Emp {
    int id;
    String name;
    public void getnameid(int id,String name){
        this.id= id;
        this.name = name;
    }
    public void printdetails(){
        System.out.println("My id is "+id);
        System.out.println("My name is "+name);
    }
}

class CellPhone{
    public void ringing(){
        System.out.println("The phone is Ringing");
    }
    public void vibrating(){
        System.out.println("The phone is Vibrating");
    }
}

class Square{
    int side;
    public void area(){
        int a = side*side;
        System.out.println("Area is: "+a);
    }
    public void parimeter(){
        int p = 4*side;
        System.out.println("Parimeter is: "+p);
    }
}

public class OOP {
    public static void main(String args[]) {
        System.out.println("creating custom class");
        Emp e1 = new Emp();         //Initialising a new Emp object 
        //setting attributes
        // e1.id = 1;
        // e1.name = "Nandini";
        //printing attribute
        // System.out.println(e1.id);
        // System.out.println(e1.name);
        //calling object 
        // e1.printdetails();

        //getters and setters
        e1.getnameid(2,"Nandini");
        e1.printdetails();

        //cal. for sq.
        Square r1 = new Square();
        r1.side = 4;
        r1.area();
        r1.parimeter();
    }
}
