import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LL2 {
    int size;
    Node head;

    public LL2() {
        this.size = 0;
        this.head = null;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addlast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curNode = head;
        while (curNode.next != null) {
            curNode = curNode.next;
        }
        curNode.next = newNode;
    }

    public void printlist() {
        Node curNode = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (curNode != null) {
            System.out.print(curNode.data + " ");
            curNode = curNode.next;
        }
        System.out.println();
    }

    // this is the iterative way
    public void reverseone() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node curNode = head.next;
        while (curNode != null) {
            Node nextNode = curNode.next;
            curNode.next = prevNode;
            prevNode = curNode;
            curNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    // this will be the recursive way
    public Node reverNodetwo(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverNodetwo(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;

    }

    public int palandrom() {
        ArrayList<Integer> arr = new ArrayList<>();
        if(head == null){
            System.out.println("list is empty");
            return 0;
        }
        if(head.next == null){
            return 1;
        }
        Node curNode = head;
        while (curNode != null) {
            arr.add(curNode.data);
            curNode = curNode.next;
        }
        // System.out.println(arr);
        Collections.reverse(arr);
        int i = 0;
        curNode = head;
        while (curNode != null || i != arr.size()) {
            System.out.println(arr.get(i) + " " + curNode.data);
            if (arr.get(i) != curNode.data) {
                System.out.println("Its not palandrom");
                // System.out.println(arr.get(i) + " " + curNode.data);
                return 0;
            }
            curNode = curNode.next;
            i++;
        }
        return 1;
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // insertion
        list.addFirst("1");
        list.addLast("2");
        list.add(2, "100");
        // System.out.println(list);
        // for (String ele : list) {
        // System.out.print(ele+" ");
        // }
        // System.out.println();

        // deletion
        list.removeFirst();
        list.removeLast();
        list.remove(0);
        // System.out.println(list);

        // question-1 reverse a link list
        LL2 l1 = new LL2();
        l1.addlast(1);
        l1.addlast(2);
        l1.addlast(3);
        l1.printlist();

        // l1.reverseone(); //via iteration
        // l1.printlist();

        // l1.head = l1.reverNodetwo(l1.head); //via recursion
        // l1.printlist();

        int a = l1.palandrom();
        if(a == 1){
            System.out.println("its palendrom");
        }
    }
}
