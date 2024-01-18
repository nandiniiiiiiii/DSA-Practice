import java.util.ArrayList;

public interface Recursion3 {
    public static void combination(String str, String combi) {
        if (str.length() == 0) {
            System.out.println(combi);
            return;
        }
        for (int j = 0; j < str.length(); j++) {
            char curchar = str.charAt(j);
            String newstr = str.substring(0, j) + str.substring(j + 1, str.length());
            combination(newstr, combi + curchar);
        }
    }

    int count = 0;

    public static int maze(int a, int b, int i, int j) {
        if (i == a || j == b) {
            return 0;
        }
        if (i == (a - 1) && j == (b - 1)) {
            return 1;
        }

        // move down
        int down = maze(a, b, i, j + 1);

        // moveright
        int right = maze(a, b, i + 1, j);

        return down + right;
    }

    public static int placetiles(int a,int b){
        if(a == b){
            return 2;
        }
        if(a<b){
            return 1;
        }
        //vertical
        int v = placetiles(a-b, b);
        //horizontal
        int h = placetiles(a-1 , b);

        return h+v;
    }

    public static int invitepeople(int n){
        if(n ==1){
            return 1;
        }
        //single
        int s = invitepeople(n-1);

        //pairs
        int p = (n-1)*invitepeople(n-1);

        return s+p;
    }

    public static void printsubset(ArrayList<Integer> arr){
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
    }
    public static int pair(int n,ArrayList<Integer> arr) {
        if(n ==0){
            printsubset(arr);
            return 0;
        }
        //want to enter
        arr.add(n);
        pair(n-1, arr);

        //dont want to enter
        arr.remove(arr.size() - 1);
        pair(n-1, arr);

        return 0;
    }

    public static void main(String[] args) {
        // find all posible combinations of a given str
        // String str = "abc";
        // combination(str,"");

        // total path from (0,0) to (n,m)
        // int n = 3, m = 3;
        // int totalpath = maze(m, n, 0, 0);
        // System.out.println(totalpath);

        //number of tiles 
        // int a=4,b=2;
        // int numtiles = placetiles(a, b);
        // System.out.println(numtiles);

        //number of people to be invited
        // int n = 3;
        // int people = invitepeople(n);
        // System.out.println(people);

        //all possible subset till n
        ArrayList<Integer> arr= new ArrayList<>();
        int n = 3;
        int result = pair(n,arr);
        System.out.println(result);
    }
}
