public class Pyramid{
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int j=0;j<(5-i);j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print(i-j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}