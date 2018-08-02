package D17;

import java.util.LinkedList;
import java.util.Queue;

public class breadthFirstTraversal {
    public TreeNode root;
    public static void breadthFirst(TreeNode root) {

        //create a queue
        Queue <TreeNode> QQ = new LinkedList<>();

        //add the root outside the while loop
        QQ.add(root);

        //Run the while that says when its not empty, you add stuff to the Queue
        //and then if the left and right are not empty, you add them to the queue.
        while (!QQ.isEmpty()) {
            TreeNode temp = QQ.poll();
            System.out.println("Visited Node: " + temp.data);

            if (temp.left != null) {
                QQ.add(temp.left);
            }

            if (temp.right != null) {
                QQ.add(temp.right);
            }
        }
    }
}
