import java.util.ArrayList;
import java.util.Collections;

public class Framework {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        System.out.println(arr);

        //get ele
        int ele = arr.get(1);
        System.out.println(ele);

        //add b/w ele
        arr.add(1,10);
        System.out.println(arr);

        //set ele
        arr.remove(1);      //1th index ele will be removed
        System.out.println(arr);

        //size
        System.out.println(arr.size());

        for (int i : arr) {
            System.out.print(i);
        }
        System.out.println();

        //sorting
        Collections.sort(arr);
        System.out.println(arr);

        //collection - List,Queue,Set,Map(these are all interfaces)
        //List - arraylist,linklist,vector (all these are classes of List)
        //Queue - PriorityQueue, LinkedList, Deque
        //Set - HashTable, LinkedHashSet, SortedSet
        //Map - HashMap, LinkedHashMap, SortedMap, HashTable

        //Linked List - var size, non-contiguous memory, insertion-O(1), Search-O(n)
    }
}
