package D17;

import D16.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class breadthFirstTraversal {
    public TreeNode17 root;
    protected static void breadthFirst(TreeNode root) {

        //create a queue
        Queue <TreeNode> QQ = new LinkedList<>();
        //add the root outside the while loop
        QQ.add(root);

        System.out.println(QQ);
        System.out.println(root);

        while (QQ != null) {
            TreeNode temp = QQ.poll();
            System.out.println("Visited Node: " + temp);

            if (temp.left != null) {
                QQ.add(temp.left);
            }

            if (temp.right != null) {
                QQ.add(temp.right);
            }
        }
    }
}
