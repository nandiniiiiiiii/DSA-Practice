package ShapeCom;

public class Sphere extends Shape {
    Sphere(int a) {
        super(a, -1);
    }
    double area(){
        return 4*Math.PI*this.a*this.a;
    }

    double volume(){
        return (4/3)*Math.PI*Math.pow(a, 3);
    }
}
