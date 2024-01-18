import java.util.Scanner;

class Book {
    String bookarr[] = { "A", "B", "C", "D", "E" };

    public void showbook() {
        System.out.println("Books avaliable are: ");
        for (String eleString : bookarr) {
            System.out.print(eleString + " ");
        }
        System.out.println();
    }

    public void issuebook(String book) {
        System.out.println("book issued: " + book);
        System.out.println("Issue Date: 01/06/2023");
        System.out.println("Return Date: 07/06/2023");
    }

    public void returnbook() {
        System.out.println("book returned: ");
    }

    public void addboook(String book) {
        System.out.println("book added: " + book);
    }

    public void bookavaliable() {
        System.out.println("books avaliable are: ");
        for (String ele : bookarr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}

public class Library {
    public static void main(String args[]) {
        Book obj = new Book();
        obj.showbook();
        System.out.println("1- issue book, 2- return book, 3- add book, 4- showAvaliable book");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        if (a == 1) {
            System.out.println("Issue Book: ");
            System.out.print("Enter book to be issued: ");
            String br = sc.nextLine();
            obj.issuebook(br);

        } else if (a == 2) {
            System.out.println("Return Book: ");
            obj.returnbook();

        } else if (a == 3) {
            System.out.println("Add Book: ");
            System.out.println("Enter book to be added: ");
            String br = sc.nextLine();
            obj.addboook(br);
        } else if (a == 4) {
            System.out.println("Show Avaliable books: ");
            obj.bookavaliable();
        } else {
            System.out.println("invalid");
        }
    }
}
