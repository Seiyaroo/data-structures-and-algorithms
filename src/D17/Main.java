package D17;

public class Main {
    public static void main(String[] args) {
        breadthFirstTraversal tree = new breadthFirstTraversal();
        TreeNode17 n53 = new TreeNode17(53);

        TreeNode17 n18 = new TreeNode17(18);
        TreeNode17 n12 = new TreeNode17(12);
        TreeNode17 n24 = new TreeNode17(24);

        TreeNode17 n75 = new TreeNode17(75);
        TreeNode17 n66 = new TreeNode17(66);
        TreeNode17 n99 = new TreeNode17(99);

        // connect nodes
        tree.root = n53;
        n53.left = n18;
        n18.left = n12;
        n18.right = n24;

        n53.right = n75;
        n75.left = n66;
        n75.right = n99;
    }
}
