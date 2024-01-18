import java.util.*;

public interface Collection1 {
    public static void main(String args[]){
        //array list 
        ArrayList<Integer> l1 = new ArrayList<>();       //array list of an integer 
        l1.add(10);
        l1.add(1);
        l1.add(50);
        l1.add(23);

        //usign for each loop
        // for(Integer ele : l1) {
        //     System.out.println(ele);
        // }

        //without using it
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }

        System.out.println("updated array is: ");
        l1.add(0,100); 
        for (Integer ele : l1) {
            System.out.println(ele);
        }

        // l1.addAll(l2);          //adding another array l2 in l1
        // l1.clear();             //to delete all teh ele from the array
        // l1.contains(100);       //to check whether an contain that ele or not
        // l1.indexOf(100)         //gives the first index of the number that matches 
        // l1.lastIndexOf(100);    //gives the last index that matches the number 
        l1.set(2, 100);

        //Array Dequeue - double ended queue
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(10);
        ad1.add(100);
        ad1.addFirst(200);    //add an ele, give exception error
        ad1.offer(300);       //add ele without exception error
        // ad1.remove(10);        //remove ele, give error 
        // ad1.pollFirst(10);     // no error
    }
}
