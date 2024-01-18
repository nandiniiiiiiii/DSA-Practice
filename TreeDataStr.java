import java.util.*;

import javax.xml.stream.events.NotationDeclaration;

public class TreeDataStr {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BT {
        int idx = -1;
        public Node buildTree(int node[]) {
            idx++;
            if (node[idx] == -1) {
                return null;
            }
            Node newNode = new Node(node[idx]);
            newNode.left = buildTree(node);
            newNode.right = buildTree(node);
            return newNode;
        }
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static int levelOrder(Node root) {
        if (root == null) {
            System.out.println("Tree is empty");
            return 0;
        }
        int h=0;
        Queue<Node> q1 = new LinkedList<>();
        q1.add(root);
        q1.add(null);

        while (!q1.isEmpty()) {
            Node curNode = q1.remove();
            if (curNode == null) {
                System.out.println();
                h++;
                if (q1.isEmpty()) {
                    break;
                } else {
                    q1.add(null);
                }
            } else {
                System.out.print(curNode.data + " ");
                if (curNode.left != null) {
                    q1.add(curNode.left);
                }
                if (curNode.right != null) {
                    q1.add(curNode.right);
                }
            }
        }
        return h;
    }

    public static int NumberofNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int lefttree = NumberofNodes(root.left);
        int righttree = NumberofNodes(root.right);

        return lefttree + righttree + 1;
    }

    public static int SumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftdata = SumOfNodes(root.left);
        int rightdata = SumOfNodes(root.right);

        return leftdata+rightdata+(root.data);
    }

    //function to calculate height of a tree
    public static int heightOfTree(Node root){
        if(root == null){
            return 0;
        }

        int leftheight = heightOfTree(root.left);
        int rightheight = heightOfTree(root.right);

        int height = Math.max(leftheight, rightheight) + 1;
        return height;
    }

    //Diameter of a Tree - Number of Nodes in longest path b/w any 2 nodes
    //there are 3 cases to find the longest diameter -
                //1- in the ls
                //2- in the rs
                //3- in the rs+ls+1
                //max out of these three are chossen as the largest diameter

    //this will take O(n)2
    public static int maxDiameter(Node root){
        if(root == null){
            return 0;
        }
        int dialeft = maxDiameter(root.left);
        int diaright = maxDiameter(root.right);
        int diaroot = heightOfTree(root.left) + heightOfTree(root.right) +1;

        return Math.max(dialeft, Math.max(diaright, diaroot));
    }

    static class TreeInfo{
        int ht;
        int dim;
        public TreeInfo(int ht,int dim){
            this.ht = ht;
            this.dim = dim;
        }
    }

    //this will take O(n)
    public static TreeInfo maxDiameter2(Node root){
        if(root == null){
            return new TreeInfo(0, 0);
        }
        TreeInfo left = maxDiameter2(root.left);
        TreeInfo right = maxDiameter2(root.right);
        
        int maxheight = Math.max(left.ht, right.ht) + 1;  //taking val from treeinfo
        
        int dimleft = left.dim;
        int dimright = right.dim;
        int dimroot = left.ht + right.ht +1;
        int maxdir = Math.max(dimleft, Math.max(dimright, dimroot));
        
        TreeInfo newinfo = new TreeInfo(maxheight, maxdir);
        return newinfo;
    }

    ///we have to find wheter a give tree is the sub tree of the original one
    public static boolean ismatch(Node root,Node subroot) {
        if(root == null && subroot == null){
            return true;
        }
        if(root == null || subroot == null){
            return false;
        }
        if(root.data == subroot.data){
            return ismatch(root.left, subroot.left) && ismatch(root.right, subroot.right);
        }
        return false;
    }
    public static boolean findsubtree(Node root,Node subroot){
        if(subroot == null){
            return true;
        }
        if(root == null){
            return false;
        }
        if(root.data == subroot.data){
            if(ismatch(root, subroot)){
                return true;
            }
        }
        return findsubtree(root.left, subroot) || findsubtree(root.right, subroot);
    }

    public static int sumatk(Node root,int k){
        Queue<Node> q1 = new LinkedList<>();
        int sum = 0;
        if(root == null){
            return 0;
        }
        if(k == 1){
            return root.data;
        }
        int n = 1;
        q1.add(root);
        q1.add(null);
        while(!q1.isEmpty()){
            Node curNode = q1.remove();
            if(curNode == null){
                System.out.println();
                n++;
                if(q1.isEmpty()){
                    break;
                }else{
                    q1.add(null);
                }
            }else{
                System.out.print(curNode.data+" ");
                if(n == k){
                    sum = sum + curNode.data;
                }
                if(curNode.left != null){
                    q1.add(curNode.left);
                }
                if(curNode.right != null){
                    q1.add(curNode.right);
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        // making a binary tree from a given array
        int node[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BT b1 = new BT();
        Node root = b1.buildTree(node);
        // System.out.println(root.data);
        // preorder(root); //1,2,4,5,3,6
        // System.out.println();
        // postorder(root); //4,5,2,6,3,1
        // System.out.println();
        // inorder(root); //4,2,5,1,3,6

        // level order
        int h = levelOrder(root);
        System.out.println("Height: "+h);

        // count nubmer of nodes in a tree
        System.out.println("Number of Nodes are: " +NumberofNodes(root));

        //sum of all the nodes 
        System.out.println("Sum of all the Nodes: "+SumOfNodes(root));

        //max. diameter- longest path between two nodes
        // System.out.println("Max. diameter: "+maxDiameter(root));      //with T.c = O(n)2
        System.out.println("Max diameter:  "+maxDiameter2(root).dim);    //with T.c = O(n) 

        //sub tree of another tree
        int subtree[] = {2,4,-1,-1,5,-1,-1};
        // int subtree[] = {-1};           //null is always the part of  the given tree
        BT b2 = new BT();
        Node subroot = b2.buildTree(subtree);
        int h1 = levelOrder(subroot);
        if(findsubtree(root, subroot)){
            System.out.println("It is a subtree of the given tree");
        }else{
            System.out.println("No such sub tree found");
        }

        //sum of all nodes at k level
        System.out.println("Sum : "+sumatk(root, 3));
    }
}
