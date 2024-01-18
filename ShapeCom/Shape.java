package ShapeCom;

public class Shape {
        //individual classes for rectangle,sq,spher,cylinder,circle
        // use inheritance to manage the code
        // volume/ surface area and getters and setters
        int a,b;
    Shape(int a,int b){
        this.a  = a;
        this.b = b;
    }

    public int geta(){
        return this.a;
    }

    public int getb(){
        return this.b;
    }

    public void seta(int a){
        this.a = a;
    }

    public void setb(int b){
        this.b = b;
    }
}
