// import java.util.ArrayList;
// import java.util.Scanner;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

class Hello {
    @Deprecated
    public int sum(int a, int b) {
        return a + b;
    }
}

@FunctionalInterface
interface Demo {
    void meth1();
}

public class one {
    public static void main(String arg[]) {
        Hello c1 = new Hello();
        int a = c1.sum(19, 1);
        System.out.println(a);

        Demo d1 = ()->{System.out.println("this is a functional interface");};
        d1.meth1();

        // File Myfile = new File("Table.txt");
        // try{
        //     Myfile.createNewFile();
        // }catch(Exception e){
        //     System.out.println(e);
        // }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Table is: ");
        String table = "";
        for(int i = 1;i<=10;i++){
            // System.out.println(num*i);
            table = table + num+" X "+i+" = "+(i*num);
            table  = table + "\n";
        }
        try{
            FileWriter fw = new FileWriter("Table.txt");
            fw.write(table);
            fw.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

// functions called directly and methods called via class method