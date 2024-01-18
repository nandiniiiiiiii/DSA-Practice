import java.util.*;

//Getters/setters access-modifier
//constructors
//inheritance

class Emp {
    // int id;
    // String name;

    // we cant access thess private objects direcly we need objects for that
    private int id;
    private String name;

    // this is a constructur -->> they can be more then one
    //if there is no constructore call then constructore with 
    public Emp() {
        //this will not run as derived class is calling other constructore
        id = 33;
        name = "Nandini";
    }

    public Emp(int a) {
        System.out.println("this is the main class constructor with value of a: " + a);
    }

    public String getname() {
        return name;
    }

    public void setname(String n) {
        name = n;
    }

    public int getid() {
        return id;
    }

    public void setid(int a) {
        id = a;
    }
}

// this is the derived class
// NOTE: JAVA DOES NOT SUPPORT MULTIPLE INHERITANCE
class Drived extends Emp {
    public Drived() {
        super(12); // this is use to access the constructor of the super class
        System.out.println("this is the constructor of the derived class");
    }
    public Drived(int a,int b){
        super(a);       //via this we can do constructor overloading
        System.out.println("this is the overloaded constructore of class b: "+b);
    }
    public void printpost() {
        System.out.println("Software Dev");
    }
}

class DrivedofDrived extends Drived{
    public DrivedofDrived(){
        System.out.println("This is the constructore of the deriverd class of the derived class");
    }
    public DrivedofDrived(int a,int b,int c){
        super(a, b);
        System.out.println("value of c is: "+c);
    }
}

class OOP2 {
    public static void main(String args[]) {
        Emp e1 = new Emp();
        // e1.id = 1;
        // e1.name = "nandini";
        // these will throw an error as we cant access private objects directly.
        // e1.setname("Nandini");
        // e1.setid(1);
        // System.out.println("Name is: "+e1.name+" and id is: " +e1.id ); //this will
        // also throw an error as we can access priv var directly
        System.out.println("Name is: " + e1.getname() + " and id is: " + e1.getid()); // GETTERS

        // creating an object for the derived class
        Drived dr1 = new Drived(3,4);
        System.out.println(dr1.getname());
        dr1.printpost();

        //this is the drived class of the derived class
        DrivedofDrived drr1 = new DrivedofDrived(1, 2, 3);        //if the called constructore is not avaliable then it will show error
        
        
        // access modifier
        // getters and setters

        // Inheritance
    }
}