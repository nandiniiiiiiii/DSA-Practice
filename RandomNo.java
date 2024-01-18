import java.util.*;
import java.util.Random;

class Game{
    int num;
    int rannum;
    public void takeUserInput(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            num = sc.nextInt();
        }
    }
    public void RandomNo(){
        Random rd = new Random();
        rannum = rd.nextInt(100);
        System.out.println(rannum);
    }
    public boolean check(){
        if(num == rannum){
            return true;
        }
        else{
            return false;
        }
    }
}

public interface RandomNo {
    public static void main(String args[]){
        Game obj = new Game();
        obj.takeUserInput() ;
        obj.RandomNo();
        boolean ch = obj.check();
        if(ch){
            System.out.println("both are same");
        }else{
            System.out.println("both are not same");
        }
    }
}
