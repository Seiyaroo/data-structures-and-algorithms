package D18;

import java.util.LinkedList;
import java.util.Queue;

public class FindMaxValue {

    public static int findMax(TreeNode root) {

        //create a queue
        Queue<TreeNode> breadthQueue = new LinkedList<>();

        //add the root outside the while loop
        breadthQueue.add(root);
        int maximumValue = root.data;

        while (!breadthQueue.isEmpty()) {
            TreeNode temp = breadthQueue.poll();


            //compares the placeholder maxVal as 0 and if the new highest encountered val is > than that
            // then you can say the new value is the max value currently. Until another is encountered.
            if (temp.data > maximumValue) {
                maximumValue = temp.data;
            }

            System.out.println("Visited Node: " + temp.data);
            System.out.println("Maximum value is " + temp.data);

            if (temp.left != null) {
                breadthQueue.add(temp.left);
            }

            if (temp.right != null) {
                breadthQueue.add(temp.right);
            }
        }
        return maximumValue;
    }
}


