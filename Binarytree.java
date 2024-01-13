import java.util.LinkedList;
import java.util.Queue;

public class Binarytree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int d) {
            data = d;
            left = null;
            right = null;
        }
    }

    static int idx = -1;

    public static Node buildTree(int nodes[]) {

        idx++;
        if (nodes[idx] == -1) {
            return null;
        }

        Node newnode = new Node(nodes[idx]);

        newnode.left = buildTree(nodes);
        newnode.right = buildTree(nodes);

        return newnode;
    }

    public static void printPosttree(Node root) {

        if (root == null) {

            return;

        }

        printPosttree(root.left);
        printPosttree(root.right);
        System.out.println(root.data);

    }

    public static void levelOrder(Node root) {

        Queue<Node> q = new LinkedList<>();

        if (root == null) {
            return;
        }

        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {

            Node curr = q.remove();

            if (curr != null) {
                System.out.print(curr.data);

                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            } else {
                System.out.println();

                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            }

        }

    }



    public static int height( Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        int h= Math.max(lh,rh);
        return h+1;
    }


    public static int NodeCount(Node root){
        if(root == null){
            return 0;
        }

        int lh = NodeCount(root.left);
        int rh = NodeCount(root.right);
       
        return lh+rh+1;
    }



    //diameter


    public static int diameter(Node root){
        if(root==null) return 0;

        int ld=diameter(root.left);
        int rd=diameter(root.right);

        int lh=height(root.left);
        int rh=height(root.right);

        int self  = lh+rh+1; 

        int max= Math.max(ld,rd);
        max= Math.max(max,self);

        return max;

    }
    public static void main(String[] args) {

        // int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        Binarytree tree = new Binarytree();
        // Node root = tree.buildTree(nodes);
        Node root = new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        // System.out.println(root.data);

        // tree.printPosttree(root);

        // tree.levelOrder(root);

        // System.out.println();

        // System.out.println(tree.height(root));
        // System.out.println(NodeCount(root));
        System.out.println(diameter(root));
    }
}