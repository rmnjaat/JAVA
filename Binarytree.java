// import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.HashMap;
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

    // static int idx = -1;

    // public static Node buildTree(int nodes[]) {

    //     idx++;
    //     if (nodes[idx] == -1) {
    //         return null;
    //     }

    //     Node newnode = new Node(nodes[idx]);

    //     newnode.left = buildTree(nodes);
    //     newnode.right = buildTree(nodes);

    //     return newnode;
    // }

    public static void printPosttree(Node root) {

        if (root == null) {

            return;

        }

        System.out.println(root.data);
        printPosttree(root.left);
        printPosttree(root.right);

    }

    // public static void levelOrder(Node root) {

    //     Queue<Node> q = new LinkedList<>();

    //     if (root == null) {
    //         return;
    //     }

    //     q.add(root);
    //     q.add(null);

    //     while (!q.isEmpty()) {

    //         Node curr = q.remove();

    //         if (curr != null) {
    //             System.out.print(curr.data);

    //             if (curr.left != null) {
    //                 q.add(curr.left);
    //             }
    //             if (curr.right != null) {
    //                 q.add(curr.right);
    //             }
    //         } else {
    //             System.out.println();

    //             if (q.isEmpty()) {
    //                 break;
    //             } else {
    //                 q.add(null);
    //             }
    //         }

    //     }

    // }

    // // Approach1
    // // public static int height(Node root) {
    // // if (root == null) {
    // // return 0;
    // // }
    // // int lh = height(root.left);
    // // int rh = height(root.right);
    // // int h = Math.max(lh, rh);
    // // return h + 1;
    // // }

    // // public static int NodeCount(Node root) {
    // // if (root == null) {
    // // return 0;
    // // }

    // // int lh = NodeCount(root.left);
    // // int rh = NodeCount(root.right);

    // // return lh + rh + 1;
    // // }

    // // // diameter

    // // public static int diameter(Node root) {
    // // if (root == null)
    // // return 0;

    // // int ld = diameter(root.left);
    // // int rd = diameter(root.right);

    // // int lh = height(root.left);
    // // int rh = height(root.right);

    // // int self = lh + rh + 1;

    // // int max = Math.max(ld, rd);
    // // max = Math.max(max, self);

    // // return max;

    // // }

    // // Approch 2

    // /**
    //  * ret
    //  */
    // static class ret {
    //     int height;
    //     int diam;

    //     public ret(int h, int d) {
    //         height = h;
    //         diam = d;
    //     }
    // }

    // public static ret diameter(Node root) {
    //     if (root == null) {
    //         return new ret(0, 0);
    //     }

    //     ret ld = diameter(root.left);
    //     ret rd = diameter(root.right);

    //     int dia = Math.max(ld.diam, Math.max(rd.diam, ld.height + rd.height + 1));
    //     int h = Math.max(ld.height, rd.height) + 1;

    //     return new ret(h, dia);

    // }

    // public static boolean isIdentical(Node root, Node subroot) {
    //     if (root == null && subroot == null) {
    //         return true;
    //     }
    //     if (root == null || subroot == null) {
    //         return false;
    //     }
    //     if (root.data == subroot.data) {
    //         return isIdentical(root.left, subroot.left) && isIdentical(root.right, subroot.right);
    //     }
    //     return false;
    // }

    // public static boolean subtree(Node root, Node subroot) {

    //     if (subroot == null)
    //         return true;
    //     if (root == null)
    //         return false;

    //     if (root.data == subroot.data) {
    //         if (isIdentical(root, subroot)) {
    //             return true;
    //         }
    //     }
    //     return subtree(root.left, subroot) || subtree(root.right, subroot);

    // }

    // static class info {
    //     Node node;
    //     int hz;

    //     info(Node n, int h) {

    //         node = n;
    //         hz = h;

    //     }

    // }

    // public static void topview(Node root) {
    //     Queue<info> q = new LinkedList<>();

    //     HashMap<Integer, Node> map = new HashMap<>();

    //     int mine = 0;
    //     int maxe = 0;

    //     q.add(new info(root, 0));
    //     q.add(null);

    //     while (!q.isEmpty()) {

    //         info curr = q.remove();

    //         if (curr == null) {
    //             if (q.isEmpty()) {
    //                 break;
    //             } else {
    //                 q.add(null);
    //             }
    //         }

    //         else {
    //             if (!map.containsKey(curr.hz)) {
    //                 map.put(curr.hz, curr.node);
    //             }

    //             if (curr.node.left != null) {
    //                 q.add(new info(curr.node.left, curr.hz - 1));
    //                 mine = Math.min(mine, curr.hz - 1);
    //             }
    //             if (curr.node.right != null) {
    //                 q.add(new info(curr.node.right, curr.hz + 1));
    //                 maxe = Math.max(maxe, curr.hz + 1);
    //             }
    //         }

    //     }

    //     for (int i = mine; i <= maxe; i++) {
    //         System.out.println(map.get(i).data);
    //     }

    // }

    // // kth level treversal

    // public static void kthlevel(Node root, int l, int k) {
    //     if (root == null) {
    //         return;
    //     }

    //     if (l == k) {
    //         System.out.print(root.data + " ");
    //         return;
    //     }

    //     kthlevel(root.left, l + 1, k);
    //     kthlevel(root.right, l + 1, k);
    // }

    // // LCA

    // public static boolean getPath(Node root, int n, ArrayList<Node> path) {

    //     if (root == null) {
    //         return false;
    //     }

    //     path.add(root);

    //     if (root.data == n) {
    //         return true;
    //     }

    //     boolean b = getPath(root.left, n, path);
    //     boolean r = getPath(root.right, n, path);

    //     if (b || r) {
    //         return true;
    //     }

    //     path.remove(path.size() - 1);
    //     return false;

    // }

    // public static Node lastCommon(Node root, int n1, int n2) {
    //     ArrayList<Node> path1 = new ArrayList<>();
    //     ArrayList<Node> path2 = new ArrayList<>();

    //     // getting path
    //     getPath(root, n1, path1);
    //     getPath(root, n2, path2);

    //     // last common ancister
    //     int i = 0;
    //     for (; i < path1.size() && i < path2.size(); i++) {

    //         if (path1.get(i) != path2.get(i)) {
    //             break;
    //         }

    //     }

    //     // lcA
    //     Node lca = path1.get(i - 1);

    //     return lca;

    // }

    // // recursive lca

    // public static Node lca2(Node root, int n1, int n2) {

    //     if (root == null) {
    //         return null;
    //     }

    //     if (root.data == n1 || root.data == n2) {
    //         return root;
    //     }

    //     Node ll = lca2(root.left, n1, n2);
    //     Node rl = lca2(root.right, n1, n2);

    //     if (ll == null) {
    //         return rl;
    //     }
    //     if (rl == null) {
    //         return ll;
    //     }

    //     return root;

    // }

    // public static int dis(Node root, int n) {
    //     if (root == null)
    //         return -1;

    //     if (root.data == n)
    //         return 0;

    //     int ld = dis(root.left, n);
    //     int rd = dis(root.right, n);

    //     if (ld == -1 && rd == -1)
    //         return -1;

    //     else if (ld == -1) {
    //         return rd + 1;
    //     } else {
    //         return ld + 1;
    //     }

    // }

    // public static int mindistance(Node root, int n1, int n2) {
    //     Node lca = lca2(root, n1, n2);

    //     int dis1 = dis(lca, n1);
    //     int dis2 = dis(lca, n2);

    //     return dis1 + dis2;

    // }

    public static int Kthancister(Node root, int n, int k) {

        if (root == null) {
            return -1;
        } 

        if (root.data == n) {
            return 0;
        }

        int ld = Kthancister(root.left, n, k);
        int rd = Kthancister(root.right, n, k);

        if (ld == -1 && rd == -1)
            return -1;

        int di = Math.max(ld, rd);

        if (di + 1 == k) {
            System.out.println(root.data);

        }

        return di + 1;
    }



    public static int SumTransform(Node root){
        if(root == null ) return 0;

       int ls = SumTransform(root.left);
       int rs = SumTransform(root.right);

       int r= root.data;

       root.data=ls+rs;

        return ls+rs+r;

    }

    public static void main(String[] args) {

        // int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        Binarytree tree = new Binarytree();
        // Node root = tree.buildTree(nodes);
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        // root.left.left.left = new Node(9);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        // System.out.println(root.data);

        // tree.printPosttree(root);

        // tree.levelOrder(root);

        // System.out.println();

        // System.out.println(tree.height(root));
        // System.out.println(NodeCount(root));
        // System.out.println(diameter(root));
        // System.out.println(diameter(root).diam);

        // Node subroot = new Node(2);
        // subroot.left = new Node(4);
        // subroot.right = new Node(5);
        // System.out.println(subtree(root, subroot));

        // topview(root);

        // kthlevel(root,1,3);

        // Node r=lastCommon(root,4,5);
        // System.out.println(r.data);

        // System.out.println(mindistance(root, 4, 6));
    //    Kthancister(root, 5, 2);

    SumTransform(root);

    printPosttree(root);

    }
}