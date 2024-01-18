import java.util.*;

class Num{
    private int rn;
    public Num(){
        Random random = new Random();
        rn = random.nextInt(100);
        System.out.println("Num: "+rn);
    }
    public int setnum(){
        return rn;
    }
}

class GuesstheNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        Num n1 = new Num();
        if(n1.setnum() == n ){
            System.out.println("you gussed correct");
        }else{
            System.out.println("Incorrect guess");
        }
    }
}
