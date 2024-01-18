import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearchTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(int val,Node root){
        Node newNode = new Node(val);
        if(root == null){
            root = newNode;
        }
        if(val > root.data){
            //add at right 
            root.right = insert(val, root.right);
        }
        if(val < root.data){
            root.left = insert(val, root.left);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static boolean search(Node root,int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data > key){
            return search(root.left, key);
        }
        if(root.data < key){
            return search(root.right, key);
        }
        return false;
    }

    public static Node inordersuccessor(Node rightroot){
        if(rightroot.left == null){
            return null;
        }
        return inordersuccessor(rightroot.left);
    }

    public static Node deletion(Node root,int key){
        if(key < root.data){
            root.left =  deletion(root.left, key);
        }
        else if(key > root.data){
            root.right =  deletion(root.right, key);
        }else{
            if(root.right == null && root.left == null){
                return null;
            }
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }else{
                Node inordersuccess = inordersuccessor(root.right);
                root.data = inordersuccess.data;
                root.right = deletion(root.right, inordersuccess.data);
                return root;
            }
        }
        return root;
    }

    public static void range(int x,int y,Node root){
        if(root == null){
            return;
        }
        if(root.data >=x && root.data <= y){
            range(x, y, root.left); 
            System.out.print(root.data+" ");
            range(x, y, root.right);
        }else if(root.data > x){
            range(x, y, root.left);
        }else{
            range(x, y, root.right);
        }
    }

    static public void roottoleaf(Node root,ArrayList<Integer> arr){
        if(root == null){
            return;
        }else{
            arr.add(root.data);
        }
        if(root.left == null && root.right == null){
            for (Integer i : arr) {
                System.out.print(i);
            }
            System.out.println();
        }else{
            roottoleaf(root.left,arr);
            roottoleaf(root.right,arr);
        }
        arr.remove(arr.size()-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //tree-    5
        //    1       7
        //      3
        //    2   4
        int val[] = {5,1,3,4,2,7};
        Node root = null;
        for (int i : val) {
            root = insert(i, root);
        }
        System.out.println("Inorder: ");
        inorder(root);

        //search
        System.out.println();
        System.out.println("Enter the key to be searched: ");
        int key = sc.nextInt();
        if(search(root, key)){
            System.out.println("key is present.");
        }else{
            System.out.println("Not present");
        }

        // System.out.println("Enter the key to be deleted: ");
        // int del = sc.nextInt();
        // deletion(root, del);
        // System.out.println("Inorder after deletion: ");
        // inorder(root);

        //printing range
        int x = 3;
        int y = 7;
        range(x,y,root);
        System.out.println();

        //finding all the path from the root to the leaf
        ArrayList<Integer> arr = new ArrayList<>();
        roottoleaf(root, arr);
    }
}
