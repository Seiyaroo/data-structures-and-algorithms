package D16;

import javax.swing.tree.TreeNode;

public class Tree {
    public abstract class Main extends FizzBuzzTree implements TreeNode {
        public static void main(String[] args) {
            BinarySearchTree tree = new BinarySearchTree();
            tree.add(12);
            tree.add(6);
            tree.add(2);
            tree.add(15);
        }
    }
}

//Adding this to solve merge conflict.