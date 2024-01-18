package ShapeCom;

public class Square extends Shape {
    Square(int a){
        super(a, -1);
    }

    public int area(){
        return this.a*this.a;
    }
}
