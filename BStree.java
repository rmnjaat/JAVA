import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BStree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int da) {
            data = da;
            left = null;
            right = null;

        }
    }

    // public static Node Buildbstree(Node root, int val) {
    //     if (root == null) {
    //         root = new Node(val);
    //         return root;
    //     }

    //     if (root.data > val) {
    //         Node l = Buildbstree(root.left, val);

    //         root.left = l;
    //     }
    //     if (root.data < val) {
    //         Node r = Buildbstree(root.right, val);

    //         root.right = r;
    //     }

    //     return root;

    // }

    public static void printInd(Node root) {
        if (root == null)
            return;
        printInd(root.left);
        System.out.print(root.data + " ");
        printInd(root.right);
    }

    // public static boolean Search(Node root, int key) {

    //     if (root == null)
    //         return false;

    //     if (root.data == key) {
    //         return true;
    //     }

    //     if (root.data > key) {
    //         return Search(root.left, key);
    //     }
    //     if (root.data < key) {
    //         return Search(root.right, key);
    //     }

    //     return false;

    // }

    // // delete Node

    // public static Node delete(Node root, int val) {

    //     if (root.data < val) {
    //         root.right = delete(root.right, val);
    //     } else if (root.data > val) {
    //         root.left = delete(root.left, val);
    //     } else {
    //         // case 1 --leaf

    //         if (root.left == null && root.right == null) {
    //             return null;
    //         }

    //         // case-2
    //         if (root.left == null) {
    //             return root.right;
    //         } else if (root.right == null) {
    //             return root.left;
    //         }

    //         // case 3

    //         Node in = findinorder(root.right);

    //         root.data = in.data;

    //         root.right = delete(root.right, in.data);

    //     }

    //     return root;
    // }

    // public static void printInRange(Node root, int k1, int k2) {

    //     if (root == null)
    //         return;

    //     printInRange(root.left, k1, k2);
    //     if (root.data >= k1 && root.data <= k2) {
    //         System.out.println(root.data);
    //     }
    //     printInRange(root.right, k1, k2);
    // }

    // public static Node findinorder(Node root) {

    //     while (root.left != null) {
    //         root = root.left;
    //     }

    //     return root;
    // }

    // public static void rootToleafPath(Node root, ArrayList<Node> ans) {
    //     if (root == null) {

    //         return;
    //     }

    //     ans.add(root);

    //     if (root.left == null && root.right == null) {
    //         for (int i = 0; i < ans.size(); i++) {
    //             System.out.print(ans.get(i).data + " - ");
    //         }
    //         System.out.println();

    //     }

    //     rootToleafPath(root.left, ans);
    //     rootToleafPath(root.right, ans);
    //     ans.remove(ans.size() - 1);

    // }

    // public static boolean ValidBst(Node root, Integer mian, Integer maax) {
    //     if (root == null)
    //         return true;

    //     if (mian != null && root.data >= mian) {
    //         return false;
    //     }

    //     else if (maax != null && root.data <= maax) {
    //         return false;
    //     }

    //     return ValidBst(root.left, mian, maax) && ValidBst(root.right, mian, maax);

    // }

    // public static Node Mirror(Node root) {
    //     if (root == null) {
    //         return null;
    //     }

    //     Node ls = Mirror(root.left);
    //     Node rs = Mirror(root.right);

    //     root.left = ls;
    //     root.right = rs;

    //     return root;
    // }

    // public static Node CeateBst(int arr[],int st,int end){
    //     if(st> end)return null;


    //     int mid = (st+end)/2;

    //     Node root= new Node(arr[mid]);

    //     root.left = CeateBst(arr, st, mid-1);
    //     root.right = CeateBst(arr,  mid+1,end);

    //     return root;
        

    //     }



    //     // Largest BST  in BT

    //    static class Info {
    //     boolean isBst;
    //     int size;
    //     int min;
    //     int max;


    //     public Info(boolean b,int s,int m, int ma){
    //         isBst=b;
    //         size=s;
    //         min=m;
    //         max=ma;
    //     }
        
    //    }

    //    public static int max_bst=0;
    //    public static Info largestBST(Node root){

    //     if(root==null){
    //         return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
    //     }

    //     Info li=largestBST(root.left);
    //     Info ri=largestBST(root.right);
    //     int size= li.size+ri.size+ 1;
    //     int min = Math.min(root.data,Math.min(li.min, ri.min));
    //     int max = Math.max(root.data,Math.max(li.max, ri.max));
        
    //     if(root.data <= li.max || root.data >= ri.min){
    //        return new Info(false, size, min, max); 
    //     }

    //     if(li.isBst && ri.isBst){
    //         max_bst=Math.max(max_bst, size);
    //        return new Info(true, size, min, max);
    //     }

    //     return new Info(false,size,min,max);


    //    }


       public static void findInorder(Node root , ArrayList<Integer> a1){
        if(root == null){
            return ;
        }
        
        findInorder(root.left, a1);
        a1.add(root.data);
        findInorder(root.right, a1);

       }



       public  static Node Build_bstree(ArrayList<Integer> a, int s ,int e){

        if(s > e){
            return null;
        }

        int mid= (s+e)/2;

        Node root = new Node(a.get(mid));

        root.left=Build_bstree(a, s, mid-1);
        root.right=Build_bstree(a, mid+1, e);

        return root;

        
       }


      public static Node MergeBst(Node r1,Node r2){

        ArrayList<Integer> a1= new ArrayList<>();
        ArrayList<Integer> a2= new ArrayList<>();

        // ArrayList<Integer> a3 = new ArrayList<>();
        findInorder(r1,a1);
        findInorder(r2,a2);
       

        for(int i=0;i<a2.size();i++){
            a1.add(a2.get(i));
        }

        Collections.sort(a1);

         Node root=Build_bstree(a1,0,a1.size()-1);

         return root;
       


      }

    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };

        Node root = null;

        // for (int i = 0; i < values.length; i++) {
        //     root = Buildbstree(root, values[i]);
        // }

        // printInd(root);
        // // System.out.println(Search(root,3));
        // delete(root, 5);
        // System.out.println();

        // printInd(root);

        // printInRange(root, 5, 12);
        // ArrayList<Node> ans= new ArrayList<>();
        // rootToleafPath(root,ans);

        // System.out.println(ValidBst(root,null,null));

        // printInd(root);

        // Mirror(root);
        // System.out.println();

        // printInd(root);

        int arr[]={3,5,6,8,10,11,12};
        // printInd(CeateBst(arr,0,arr.length-1));




        //bt bst
        Node btr=new Node(50);
        btr.left=new Node(30);
        btr.left.left=new Node(5);
        btr.left.right=new Node(20);


        btr.right=new Node(60);
        btr.right.left=new Node(45);
        btr.right.right=new Node(70);
        btr.right.right.left=new Node(65);
        btr.right.right.right=new Node(80);

        // Info i=largestBST(btr);

        // System.out.println(max_bst);



        Node r1 = new Node(2);
        r1.left= new Node(1);
        r1.right= new Node(4);

        Node r2 = new Node(9);
        r2.left = new Node(3);
        r2.right = new Node(12);

        Node r3=MergeBst(r1,r2);

        printInd(r3);


    }
}