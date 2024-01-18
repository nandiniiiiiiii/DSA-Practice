package ShapeCom;


public class Circle extends Shape {
    Circle(int a) {
        super(a, -1);
    }
    
    public double area(){
        return Math.PI*this.a*this.a;
    }
}
