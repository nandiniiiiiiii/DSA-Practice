import java.util.Scanner;

class MyExp extends Exception {
    @Override
    public String toString() {
        return "I am tostring"; // we made a custom error
    }

    @Override
    public String getMessage() {
        return "I am getmessage";
    }
}

// we can display our custom error via making a class obj
class MyExp2 extends Exception {
    @Override
    public String toString() {
        return "I am tostring"; // we made a custom error
    }

    @Override
    public String getMessage() {
        return "I am getmessage";
    }
}

public interface ExceptionClass {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a < 9){
            try{
                throw new MyExp();   //use to throw error
            }catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("the end");
            }
        }
    }
}
