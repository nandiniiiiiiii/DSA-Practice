import java.util.Scanner;

public class LL {
    private Node head;
    int size;

    class Node {
        String data;
        Node next; // this is because the next node is the type, inner class

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;

        }
    }

    public LL() {
        this.head = null;
        this.size = 0;
    }

    // add first
    public void addfirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // insertion at the last
    public void addlast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curnode = head;
        while (curnode.next != null) {
            curnode = curnode.next;
        }
        curnode.next = newNode;
    }

    // insertion at a particular index
    public void addatnum(String data, int x) {
        Node newNode = new Node(data);
        int i = 2;
        Node curNode = head;
        while (i != x) {
            curNode = curNode.next;
            i++;
        }
        curNode.next = newNode;
    }

    // delete first
    public void deletefirst() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        head = head.next;
        size--;
    }

    // delete last
    public void deletelast() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node curNode = head;
        Node secNode = head.next;
        while (secNode.next != null) {
            curNode = curNode.next;
            secNode = secNode.next;
        }
        curNode.next = null;
        size--;
    }

    // delete at n
    public void deleteatn(int x) {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        if(x > size){
            System.out.println("Index out of bound");
            return;
        }
        int i = 2;
        Node curNode = head;
        Node secNode = head.next;
        while (i != x) {
            curNode = curNode.next;
            secNode = secNode.next;
            i++;
        }
        curNode.next = secNode.next;
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL list = new LL();
        int lp = 1;
        while (lp == 1) {
            System.out.println("Enter the index where you want to insert: ");
            int x = sc.nextInt();
            System.out.println("Enter the data: ");
            String data = sc.next();
            if (x == 1) {
                list.addfirst(data);
            } else {
                list.addatnum(data, x);
            }
            System.out.println("Enter 0 to exit and 1 to continue: ");
            lp = sc.nextInt();
        }
        list.addlast("100");
        System.out.println("list is: ");
        list.printlist();

        // deletion
        list.deleteatn(2);
        list.printlist();
    }
}
