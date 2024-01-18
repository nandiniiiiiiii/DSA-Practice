import java.util.LinkedList;

public class Collection2 {
    public static void main(String args[]){
        //Linked List
        //almost all the array list methods are implied in linked list 
        //methods which can only be implied in linked list 
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(20);
        l1.add(49);
        l1.addLast(1000);

        for (Integer ele : l1) {
            System.out.println(ele);
        }

        //Date and Time in java
        System.out.println(System.currentTimeMillis());            //returns number of milllseconds, data store in form of a long number
    }
}
