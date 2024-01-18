public class WrapperClass {
    public static void main(String[] args) {
        // int a = 10;
        // Integer n = Integer.valueOf(a);                     //autoboxing-int to integer
        // String str = String.valueOf(n);                     //converting Integer to string
        // int numstr = Integer.parseInt(str);                 //string to int

        // String strnum = String.valueOf(numstr);             //int to String
        
        // //String to int
        // int a1 = Integer.parseInt(strnum);
        // //int to Integer
        // Integer a2 = Integer.valueOf(a1);
        // //Integer to int
        // int a3 = a2;                                                                                
        // System.out.println(a3);
        
        //take command line arument 
        int a=Integer.valueOf(args[0]);           //unboxing
        int b=Integer.valueOf(args[1]);
        // for (String ele : args) {
        //     System.out.println(ele);
        // }
        int area = a*b;
        System.out.println("Area is: "+area);

        int n = 10;
        Integer n1= Integer.valueOf(n);
        String str = String.valueOf(n1);
        int n3 = Integer.parseInt(str);
        String str2 = String.valueOf(n3);
    }
}
