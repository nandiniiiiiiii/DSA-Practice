public class ButterflyPattern {
    public static int fact(int i){
        if(i == 0){
            return 1;
        }else{
            return fact(i-1)*i;
        }
    }
    public static void main(String args[]) {
        // // 1st part
        // for (int i = 1; i <= 4; i++) {
        //     for (int j = 0; j < i; j++) {
        //         System.out.print("*");
        //     }
        //     for (int j = 0; j < 2 * (4 - i); j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j < i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // // 2nd part
        // for (int i = 0; i < 4; i++) {
        //     for (int j = 0; j < (4-i); j++) {
        //         System.out.print("*");
        //     }
        //     for (int j = 0; j < 2 * (i); j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j < (4-i); j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Pascal Triangle
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                if(j==0 || j==i-1){
                    System.out.print(" 1");
                }else{
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
}