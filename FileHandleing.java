import java.io.File;
import java.io.FileWriter;
import java.text.FieldPosition;
import java.util.Scanner;

public class FileHandleing {
    public static void main(String[] args) {
        //to create a new file
        // File f1 = new File("Nandini.txt");
        // try{
        //     f1.createNewFile();
        // }catch(Exception e){
        //     System.out.println(e);
        // }

        //write in a file 
        // try{
        //     FileWriter wf = new FileWriter("Nandini.txt");
        //     wf.write("this is our first file from the file handling vedio");
        //     wf.close();
        // }catch(Exception e){
        //     System.out.println(e);
        // }

        //reading a file
        // File f = new File("Nandini.txt");
        // try{
        //     Scanner sc = new Scanner(f);
        //     while(sc.hasNextLine()){
        //         String line = sc.nextLine();
        //         System.out.println(line);
        //     }
        //     sc.close();
        // }catch(Exception e){
        //     System.out.println(e);
        // }

        //deleting a file
        File f = new File("Nandini.txt");
        if(f.delete()){
            System.out.println("file: "+f.getName()+" is deleted");
        }else{
            System.out.println("Error");
        }
    }
}
