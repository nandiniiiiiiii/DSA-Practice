import java.util.Stack;

public class StaclClass2 {
    public static void pushAtBottom(int data,Stack<Integer> s1){
        if(s1.empty()){
            s1.push(data);
            return;
        }
        int top = s1.pop();
        pushAtBottom(data, s1);
        s1.push(top);
    }

    public static void reverse(Stack<Integer> s1){
        if(s1.empty()){
            return;
        }
        int x = s1.pop();
        reverse(s1);
        pushAtBottom(x, s1);
    }

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(10);
        s1.push(20);
        s1.push(30);

        reverse(s1);

        while (!s1.isEmpty()) {
            System.out.println(s1.peek());
            s1.pop();
        }

        String str = new String();
        str = "Helllo";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
