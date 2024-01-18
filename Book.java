import java.util.*;

class Access {
    String name;
    Access(String name) {
        this.name = name;
    }

    public void history(){
        String a1[] = {"name = X","Author = Y","Issued date = A","Issued for = B"};
        System.out.println("book info: ");
        for (String c : a1) {
            System.out.println(c);
        }
        
    }

    public void add(char book){
        System.out.println(book+" is added.");
    }

    public void check(){
        char arr[] = {'A','B','C','D','E'};
        for (char c : arr) {
            System.out.println(c);
        }
    }

    public void back(char book){
        System.out.println(book+" is returned");
    }

    public void issue(char book){
        System.out.println(book+" is added to the list");
    }

    public void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter task: 1-add, 2-return, 3-issue: ");
        int num = sc.nextInt();
        if(num == 1){
            System.out.println("Books available: ");
            check();
            System.out.println("Enter the book you want to add: ");
            char book = sc.next().charAt(0);
            add(book);
        }else if(num == 2){
            System.out.println("Enter the book to be returned: ");
            // String input = sc.nextLine();
            char book = sc.next().charAt(0);
            back(book);
        }else if(num == 3){
            System.out.println("Enter the book you want to issue: ");
            char book = sc.next().charAt(0);
            issue(book);
        }else{
            System.out.println("Invalid input");
        }
        sc.close();
    }
}

public class Book {
    // library management system that issues books to the student
    // 1- book name
    // 2- Book author
    // 3- Issued to
    // 4- Issued on
    // usesr show add,return and issue book, take entry with the user name
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your name: ");
            String name = sc.nextLine();
            Access a = new Access(name);
            a.history();
            a.main();
            sc.close();
        }

    }
}
