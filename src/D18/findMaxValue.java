package D18;


import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class findMaxValue {
    public static void main(String[] args) {

    }

    public static void findMax(TreeNode root) {
        TreeNode root;
        int maximumValue = 0;

        //create a queue
        Queue<TreeNode> breadthQueue = new LinkedList<>();
        //add the root outside the while loop
        breadthQueue.add(root);

        System.out.println(breadthQueue);
        System.out.println(root);

        while (breadthQueue != null) {
            TreeNode temp = breadthQueue.poll();
            System.out.println("Visited Node: " + temp);

            if (temp.left != null) {
                breadthQueue.add(temp.left);
            }

            if (temp.right != null) {
                breadthQueue.add(temp.right);
            }
        }
    }
}


