// import java.util.*;

public class SetBuilder {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Nandini");
        System.out.println(sb);

        //access 1 ele
        System.out.println(sb.charAt(2));

        //set char
        sb.setCharAt(0,'n');
        System.out.println(sb);

        //insert
        sb.insert(1,"n");
        System.out.println(sb);

        //deletion
        sb.delete(1, 2);
        System.out.println(sb);

        //append
        sb.append('n');
        System.out.println(sb);
    }
}
