import java.util.LinkedList;
import java.util.Queue;

public class QueueForJava {
    // public static class Queue {
    //     static int arr[];
    //     static int size;
    //     static int rear = -1;
    //     static int front = -1;

    //     Queue(int size) {
    //         arr = new int[size];
    //         this.size = size;
    //     }

    //     public boolean isEmpty() {
    //         // return rear == size-1;
    //         return rear == -1 && front == -1;
    //     }

    //     public boolean isFull() {
    //         // return front == size-1;
    //         return (rear + 1) % size == front;
    //     }

    //     public void enqueue(int data) {
    //         if (isFull()) {
    //             System.out.println("overflow");
    //         }
    //         if (front == -1) {
    //             front = 0;
    //         }
    //         rear = (rear + 1) % size;
    //         arr[rear] = data;
    //     }

    //     public int dequeue() {
    //         if (isEmpty()) {
    //             System.out.println("underflow");
    //             return -1;
    //         }
    //         // int x = arr[0];
    //         // for (int i = 0; i < size; i++) {
    //         // arr[i] = arr[i+1];
    //         // }
    //         int x = arr[front];
    //         if (rear == front) {
    //             rear = front = -1;
    //         } else {
    //             front = (front + 1) % size;
    //         }
    //         return x;
    //     }

    //     public int peek() {
    //         if (isEmpty()) {
    //             System.out.println("array is empty");
    //             return -1;
    //         }
    //         // return arr[0];
    //         return arr[front];
    //     }
    // }

    // public static class QueueList {
    //     public static Node head = null;
    //     public static Node tail = null;
    //     static class Node{
    //         int data;
    //         Node next;
    //         Node(int data){
    //             this.data = data;
    //             this.next = null;
    //         }
    //     }
    //     public boolean isEmpty() {
    //         return head == null && tail == null;
    //     }

    //     public void enqueue(int data){
    //         Node newNode = new Node(data);
    //         if(tail == null){
    //             head = tail = newNode;
    //             return;
    //         }
    //         tail.next = newNode;
    //         tail = newNode;
    //     }

    //     public int dequeue(){
    //         if(isEmpty()){
    //             System.out.println("List is empty");
    //             return -1;
    //         }
    //         int front = head.data;
    //         if(head == tail){
    //             head = tail = null;
    //             return front;
    //         }
    //         head = head.next;

    //         return front;
    //     }

    //     public int peek(){
    //         if(isEmpty()){
    //             System.out.println("List is empty");
    //             return -1;
    //         }
    //         return head.data;
    //     }
    // }

    

    public static void main(String[] args) {
        // array queue/ circular queue - array
        // Queue q1 = new Queue(3);
        // q1.enqueue(10);
        // q1.enqueue(20);
        // q1.enqueue(30); // 10 20 30
        // System.out.println(q1.peek()); // 10
        // System.out.println(q1.dequeue()); // 10
        // System.out.println(q1.peek()); // 20
        // q1.enqueue(40); // 40 20 30 but front is still at 20
        // System.out.println(q1.peek());

        // Queue - linked list
        // QueueList q2 = new QueueList();
        // q1.enqueue(10);
        // q1.enqueue(20);
        // q1.enqueue(30);
        // while (!q1.isEmpty()) {
        //     System.out.println(q1.peek());
        //     q1.dequeue();
        // }

        //Queue useing collection framework
        Queue<Integer> q3 = new LinkedList<>();               //queue = interface from class LinkedList
        q3.add(1);
        q3.add(2);
        q3.add(3);
        while (!q3.isEmpty()) {
            System.out.println(q3.peek());
            q3.remove();
        }
    }
}
