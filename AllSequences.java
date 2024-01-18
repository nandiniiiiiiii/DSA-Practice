// import java.util.ArrayList;
import java.util.Scanner;

public class AllSequences {
    public static void combination(String str,int i,String newstr){
        if(i == str.length()){
            System.out.println(newstr);
            return;
        }

        char curchar = str.charAt(i);
        //want to enter 
        combination(str, i+1, newstr+curchar);       //i++ dont work but ++i and i+1 does
        //dont want to enter
        combination(str, i+1, newstr);

        // i++ is a post-increment operation. When you pass i++ as an argument, you're actually passing the current value of i, and then i is incremented by 1. This can lead to unexpected behavior if the method modifies the i parameter.
    }
    public static void main(String[] args) {
        //with array
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a three digit number: ");
        // int num = sc.nextInt();
        // int x = num;
        // ArrayList<Integer> arr = new ArrayList<>();
        // while(x > 0){
        //     int r= x%10;
        //     arr.add(r);
        //     x = x/10;
        // }
        // // for (Integer ele : arr) {
        // //     System.out.println(ele);
        // // }
        // int a= arr.get(0);
        // int b= arr.get(1);
        // int c= arr.get(2);
        // System.out.println("All possible combinations are: ");
        // for (int i = 0; i < 2; i++) {
        //     System.out.println(a+""+b+""+c);
        //     b = c+b;
        //     c = b-c;
        //     b = b-c;
        // }
        // a=a+b;
        // b=a-b;
        // a=a-b;
        // for (int i = 0; i < 2; i++) {
        //     System.out.println(a+""+b+""+c);
        //     b = c+b;
        //     c = b-c;
        //     b = b-c;
        // }
        // a=a+c;
        // c=a-c;
        // a=a-c;
        // for (int i = 0; i < 2; i++) {
        //     System.out.println(a+""+b+""+c);
        //     b = c+b;
        //     c = b-c;
        //     b = b-c;
        // }

        //string-find all the sub-string
        String str = "abc";
        combination(str,0,"");
    }
}
