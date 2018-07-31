package D16;

public class FizzBuzzTree {
    protected TreeNode root;

    public void add(int value) {

    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        return inOrder(builder, this.root).toString();
    }

    private StringBuilder inOrder(StringBuilder builder, TreeNode current) {
        if (current == null) {
            return builder;
        }

        inOrder(builder, current.left);
        builder.append(current.data + " ");
        inOrder(builder, current.right);

        return builder;
    }
}
