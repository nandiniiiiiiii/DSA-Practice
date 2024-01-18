import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class HashingQuestion {
    //finding the num with greater freq then n/3
    public static void frequency(int num[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int ele : num) {
            if(map.containsKey(ele)){
                map.put(ele, map.get(ele)+1);
            }else{
                map.put(ele, 1);
            }
        }
        for (Map.Entry<Integer, Integer> ele : map.entrySet()) {
            if(ele.getValue() > (num.length/3)){
                System.out.print(ele.getKey() + " ");
            }
        }
    }

    //finding the union of 2 arr
    public static void union(int arr1[], int arr2[]){
        HashSet<Integer> h1 = new HashSet<>();
        for (Integer ele : arr1) {
            h1.add(ele);
        }
        for (Integer ele : arr2) {
            h1.add(ele);
        }
        System.out.println(h1);
    }

    public static int intersection(int arr1[], int arr2[]){
        int count = 0;
        HashSet<Integer> h1 = new HashSet<>();
        for (Integer ele : arr1) {
            h1.add(ele);
        }
        for (int ele : arr2) {
            if(h1.contains(ele)){
                System.out.print(ele+" ");
                count++;
                h1.remove(ele);
            }
        }
        System.out.println();
        return count;
    }

    //train ticket
    public static String traintickets(HashMap<String, String> map){
        for (Map.Entry<String,String> ele : map.entrySet()) {
            if(!(ele.getValue().contains(ele.getKey()))){
                return ele.getKey();
            }
        }
        return null;
    }

    //sum k
    public static void sumK(int arr[],int k){
        HashSet<Integer> set = new HashSet<>();
        for (int ele : arr) {
            set.add(ele);
        }
        for (int ele : arr) {
            int n = k - ele;
            if(n == 0 && set.contains(ele)){
                System.out.println(ele);
                set.remove(ele);
            }
            if(set.contains(n)){
                System.out.println(ele+" "+n);
                set.remove(n);
                set.remove(ele);
            }
        }
    }

    public static void main(String[] args) {
         // int num[] = {1,2};
        int num[] = {1,3,2,5,1,3,1,5,1};
        // frequency(num);

        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        union(arr1,arr2);
        System.out.println(intersection(arr1,arr2));

        HashMap<String, String> map = new HashMap<>();
        map.put("chennai", "bengaluru");
        map.put("mumbai", "delhi");
        map.put("goa", "chennai");
        map.put("delhi", "goa");
        
        String start = traintickets(map);
        while (map.containsKey(start)) {
            System.out.print(start+"->");
            start = map.get(start);
        }
        System.out.print(start);
        System.out.println();

        int arr[] = {10,2,-2,-20,10,-10,-10};
        int k = -10;
        sumK(arr, k);
    }
}
