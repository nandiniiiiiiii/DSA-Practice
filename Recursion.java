import java.util.Scanner;

public class Recursion {
    public void sum(int n,int sum){
        if(n == 0){
            System.out.println("Sum: "+sum);
            return;
        }else{
            sum = sum+n;
            sum(n-1,sum);
        }
    }

    public void fab(int num,int a,int b){
        if(num == 0){
            return;
        }
        b = a+b;
        a = b-a;
        System.out.println(b);
        fab(num-1,a,b);
    }

    // public void square(int x,int num,int sq){
    public int square(int x,int num){
        //T.C. = n
        // if(num == 0){
        //     System.out.println(sq);
        //     return;
        // }else{
        //     sq = sq*x;
        //     square(x, num-1, sq);
        // }

        //for T.C. log n
        if(num ==0){
            return 1;
        }
        if(num %2 == 0){
            return square(x,num/2) * square(x,num/2);
        }else{
            return square(x,num/2) * square(x, num/2) * x;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        Recursion obj = new Recursion();

        //sum till n
        // int sum=0;
        // obj.sum(num,sum);

        //fab.
        // int a = 0;
        // int b = 1;
        // System.out.println(a);
        // System.out.println(b);
        // obj.fab(num-2,a,b);

        //a^n
        // int sq =1;
        // obj.square(2,num,sq);
        int sq = obj.square(2,num);
        System.out.println("Square is: "+sq);

    }
}
