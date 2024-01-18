public class Methods{
    // static int logic(int a ,int b){
    //     return a+b;
    // }

    //VarArgs
    static int sum(int ...arr){
        // static int sum(int x,int ...arr){
        //here giving arg in ...arr is not nessary but if we create another ver x then it is important to give a val to it.
        int r = 0;
        for (int ele : arr) {
            r = r+ele ;
        }
        return r;
    }

    public static void main(String args[]){
        // int a = 5;
        // int b = 7;
        // // Methods obj = new Methods();      //via this we can call non static obj through static once
        // // int c = obj.logic(a,b);
        // int c = logic(a,b);
        // System.out.println(c);

        System.out.println("sum is: "+sum(2,3,4));
    }
}