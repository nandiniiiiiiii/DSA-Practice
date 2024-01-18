import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.HashSet;

public class Hashing {
    public static void main(String[] args) {
        // [HASH SET]
        //dont allow duplicasy
        //unordered - simillar to unordered set in c++
        HashSet<Integer> set = new HashSet<>();

        //insertion
        set.add(1);
        set.add(2);
        set.add(3);

        //search
        System.out.println(set.contains(1));
        
        //deletion
        set.remove(1);
        System.out.println(set.contains(1));

        //size 
        System.out.println(set.size());

        //Iterator class - helps in traversing the set
        Iterator it = set.iterator();
        //at the begning iterator points to the null hence we start by next.
        while (it.hasNext()) {            //to check whether there is any val further 
            System.out.println(it.next());        //to print the val
        }
        //to print all ele in set
        for (Integer i : set) {
            System.out.println(i);
        }

        // [HASH MAP]
        //unordered
        HashMap<String, Integer> map = new HashMap<>();

        //insertion
        map.put("India", 120);
        map.put("china", 140);
        map.put("Japan", 100);
        //if key already exist then the val is updated
        map.put("India", 130);
        System.out.println(map);

        //search
        System.out.println(map.containsKey("India")); //t/f
        System.out.println(map.containsValue(120)); //t/f
        System.out.println(map.get("India"));  //return val/null

        //iteration- print all the val in the mapset
        for(Map.Entry<String,Integer> ele : map.entrySet()){
            System.out.println(ele.getKey() +" "+ ele.getValue());
        }

        //deletion via key
        map.remove("china");
        System.out.println(map);

    }
}
