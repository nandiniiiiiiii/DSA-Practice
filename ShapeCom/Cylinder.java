package ShapeCom;

public class Cylinder extends Shape {
    Cylinder(int a,int b){
        super(a, b);
    }
    public double voulume(){
        return Math.PI*this.a*this.a*this.b;
    }

    public double area(){
        //b = h and a = r
        return 2*Math.PI*this.a*(this.b+this.a);
    }
}
