import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class StackClass {
//     static class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
//     static class Stack{
//         public static Node head;
//         public static boolean isEmpty(){
//             if(head == null){
//                 return true;
//             }
//             return false;
//         }

//         public void push(int data){
//             Node newNode = new Node(data);
//             if(isEmpty()){
//                 head = newNode;
//                 return ; 
//             }
//             newNode.next = head;
//             head = newNode;
//         }

//         public int pop(){
//             if(isEmpty()){
//                 System.out.println("stack is empty.");
//                 return -1;
//             }
//             int x = head.data;
//             head = head.next;
//             return x;
//         }

//         public int peak(){
//             if(isEmpty()){
//                 System.out.println("stack is empty.");
//                 return -1;
//             }
//             return head.data;
//         }
//     }

//     static class NewStack{
//         static ArrayList<Integer> list= new ArrayList<>();
//         public static boolean isEmpty(){
//             if (list.size() == 0) {
//                 return true;
//             }
//             return false;
//         }

//         public void push(int data){
//             list.add(data);
//         }

//         public int pop(){
//             if(isEmpty()){
//                 System.out.println("List is empty");
//                 return -1;
//             }
//             int x = list.get(list.size() - 1);
//             list.remove(list.size() - 1);
//             return x;
//         }

//         public int peak(){
//             if(isEmpty()){
//                 System.out.println("List is empty");
//                 return -1;
//             }
//             return list.get(list.size() - 1);
//         }
//     }

    public static void main(String[] args) {
        //lsit implementation
        // Stack s1 = new Stack();
        // s1.push(10);
        // s1.push(20);
        // s1.push(30);
        // System.out.println(s1.peak());
        // s1.pop();
        // System.out.println(s1.peak());

        // //arraylist implementation
        // NewStack s2 = new NewStack();
        // s2.push(1);
        // s2.push(2);
        // s2.push(3);
        // System.out.println(s2.peak());
        // s2.pop();
        // System.out.println(s2.peak());

        Stack<Integer> s3 = new Stack<>();
        s3.push(11);
        s3.push(12);
        s3.push(13);
        System.out.println(s3.peek());
        s3.pop();
        System.out.println(s3.peek());
    }
}
