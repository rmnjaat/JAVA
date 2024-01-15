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
        System.out.println(Kthancister(root, 5, 2));

    }
}