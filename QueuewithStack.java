import java.util.Stack;

public class QueuewithStack { 
    static class QueueQ{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();
        
        public static void enqueue(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        public static int dequeue(){
            if(s1.isEmpty()){
                System.out.println("Stack empty");
                return -1;
            }
            return s1.pop();
        }

        public static int peek(){
            if(s1.isEmpty()){
                System.out.println("Stack empty");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        // QueuewithStack q1 = new QueuewithStack();
        QueueQ q1 = new QueueQ();
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        System.out.println(q1.peek());
        q1.dequeue();
        q1.enqueue(4);
        System.out.println(q1.peek());
    }
 }