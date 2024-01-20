import java.util.ArrayList;
import java.util.HashMap;

import org.w3c.dom.Node;

public class binarytreeHW {

    public static class Node {

        int data;
        Node left;
        Node right;

        Node(int d) {

            data = d;
            left = null;
            right = null;

        }

    }

    public static void printpre(Node root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");
        printpre(root.left);
        printpre(root.right);

    }

    public static boolean Univalued(Node root, int r) {
        if (root == null)
            return true;

        if (root.data != r) {
            return false;
        }

        boolean l = Univalued(root.left, r);
        boolean rl = Univalued(root.right, r);

        if (l == true && rl == true) {
            return true;
        }
        return false;
    }

    public static boolean deletleaf(Node root, int k) {
        if (root == null) {
            return false;
        }

        if (root.data == k && root.left == null && root.right == null) {
            return true;
        }

        boolean l = deletleaf(root.left, k);
        boolean r = deletleaf(root.right, k);

        if (l) {
            root.left = null;
        }
        if (r) {
            root.right = null;
        }

        return false;

    }


        // WRONG
    public static Node Inverbt(Node root) {

        if (root == null) {
            return null;
        }

      
        Node ls =Inverbt(root.left);
        Node rs =  Inverbt(root.right);

        root.left=ls;
        root.right=rs;


        return root;
    }

    public static String getStr(Node root, ArrayList<Node> ans, HashMap<String, Integer> map) {
        if (root == null) {
            return "N";
        }

        String s = Integer.toString(root.data) + "," + getStr(root.left, ans, map) + "," + getStr(root.right, ans, map);

        int v=0;
        if (map.containsKey(s) && map.get(s) == 1) {

            ans.add(root);
            v=map.get(s);
        }


        map.put(s,++v );


        return s;

    }

    public static ArrayList<Node> Duplisubtree(Node root) {

        ArrayList<Node> ans = new ArrayList<>();

        HashMap<String, Integer> map = new HashMap<>();

        getStr(root, ans, map);

        return ans;

    }




    public static int max_sum_path(Node root , int maxsum){

        if(root == null ) return 0;

        int ls=max_sum_path(root.left,maxsum);

        int rs=max_sum_path(root.right,maxsum);


        int s = ls+rs+root.data;
        maxsum=Math.max(maxsum, s);

        return maxsum;




    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        // root.left.left.left = new Node(9);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // System.out.println(Univalued(root,root.data));

        // printpre(root);

        // System.out.println();
        // Inverbt(root);
        // printpre(root);

        // Node sr = new Node(1);
        // sr.left = new Node(2);
        // sr.right = new Node(2);
        // sr.left.left = new Node(3);
        // // sr.left.right=new Node(2);
        // sr.right.left = new Node(3);

        // printpre(sr);
        // ArrayList<Node> ans = Duplisubtree(sr);
        
        // System.out.println();
        
        
        // for(int i=0;i<ans.size();i++){
        //     printpre(ans.get(i));
        //     System.out.println();

        // }
        // deletleaf(sr, 3);
        printpre(root);
        Inverbt(root);
      
        System.out.println();
        printpre(root);



        // System.out.println( max_sum_path(root,-1));
    }
}