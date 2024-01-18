// import java.util.Scanner;

public class TryCatch {
    public static int greet() {
        try {
            int a = 4;
            int b = 2;
            int d = a / b;
            return d;
        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
        //will always excuted
            System.out.println("this is the end of the prg. ");     //even after the return finally will run
        }
        return 0;
        // System.out.println("this is the end of the prg. ");
    }

    public static void main(String args[]) {
        // int[] arr = new int[3];
        // arr[0] = 23;
        // arr[1] = 44;
        // arr[2] = 25;
        // Scanner sc = new Scanner(System.in);
        // nested try/catch
        // int b = 1;
        // while (b == 1) {
        // int a = sc.nextInt();
        // try {
        // try {
        // System.out.println(arr[a]);
        // b = 0;
        // } catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println("Index not existing ");
        // }
        // } catch (Exception e) {
        // System.out.println(e);
        // }
        // }

        // try{
        // int a = 4;
        // int b = 0;
        // int d = a/b;
        // }catch(Exception e){
        // System.out.println(e);
        // }
        // // finally{
        // // //will always excuted
        // // System.out.println("this is the end of the prg. ");
        // // }
        // System.out.println("this is the end of the prg. ");

        greet();

    }
}
