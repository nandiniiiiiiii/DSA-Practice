import java.util.ArrayList;
import java.util.HashMap;

public interface OtherRecursion {
    public static void string(String str,int i){
        //T.C. = O(n)
        if(i == 0){
            System.out.println(str.charAt(i));
            return;
        }
        System.out.println(str.charAt(i));
        string(str, i-1);
    }

    public static void occurl(int i,String str){
        if(str.charAt(i) != 'a'){
            occurl(i-1, str);
        }else{
            System.out.println("a's last occurence "+i);
            return;
        }
    }
    public static void occur(int i,String str){
        if(str.charAt(i) != 'a'){
            occur(i+1, str);
        }else{
            System.out.println("a's first occurence "+i);
            occurl(str.length()-1, str);
            return;
        }
    }

    public static void lastx(String str,int i,String newstr,int c){
        if(i == str.length()){
            for (int j = 0; j < c; j++) {
                newstr = newstr +'x';
            }
            System.out.println(newstr);
            return;
        }
        char curchar = str.charAt(i);
        if(curchar == 'x'){
            c++;
            // lastx(str, i+1, newstr, c);
        }else{
            newstr = newstr + curchar;
            // lastx(str, i+1, newstr, c);
        }
        lastx(str, i+1, newstr, c);
    }

    public static boolean arr[] = new boolean[26];
    public static void wrap(String str,int i,String newstr){
        if(i == str.length()){
            System.out.println(newstr);
            return;
        }
        if(arr[str.charAt(i)-'a']){
            wrap(str, i+1, newstr);
        }else{
            newstr = newstr + str.charAt(i);
            arr[str.charAt(i)-'a'] = true;
            wrap(str, i+1, newstr);
        }
    }

    public static void substring(String str,int i,String newstr,ArrayList<String> strarr){
        if(i == str.length()){
            if(strarr.contains(newstr)){
                return;
            }else{
                System.out.println(newstr);
                strarr.add(newstr);
                return;
            }
        }
        char newchar = str.charAt(i);

        //want to enter the loop
        substring(str, i+1, newstr+newchar,strarr);
        
        //dont want to enter the loop
        substring(str, i+1, newstr,strarr);
    }

    //keypad combinations
    String keypad[] = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void combiantions(String str, int i,String combi){
        if(i == str.length()){
            System.out.println(combi);
            return;
        }
        //ex: str=4
        char curchar = str.charAt(i);  //"4" - it is imp when there are more then one num. 
        String mapping = keypad[curchar - '0'];   //"4" - '0'  
        // String mapping = keypad[str];   //"4" - '0'  

        for (int j = 0; j < mapping.length(); j++) {
            combiantions(str, i+1, combi+mapping.charAt(j));   //will help me print all posible combinations form any str in combination
        }
    }

    public static void main(String[] args) {
        //reverse a str
        // String str = "abcde";
        // int i = str.length();
        // string(str, i-1);

        //finding the first and the last occurance of a
        // String str = "aaabcdeeeefffaaadeersaaaa";
        // occur(0,str);

        //take all the x ot the last
        // String str = "abxcdxxxys";          //bring all the "x" at the end
        // lastx(str, 0, "",0);

        //remove duplicacy
        // String str = "aabbccddee";
        // wrap(str,0,"");

        //subsequence of a str(with duplicacy)
        // String str = "abc";
        // substring(str, 0, "");

        //substring of a str(without duplicacy)
        // String str = "aaa";
        // ArrayList<String> strarr = new ArrayList<>();
        // substring(str, 0, "",strarr);

        //keypad combiantions
        String str = "32";
        // int str = 3;       //to print all posible combination
        combiantions(str, 0, "");
    }
}
