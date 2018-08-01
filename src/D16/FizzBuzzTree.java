package D16;

public class FizzBuzzTree {
    protected TreeNode root;

    public static void main(String[] args) {
        System.out.println("hi");
    }

    public static void FizzBuzzMovement(TreeNode current) {
        if (current != null) {
            FizzBuzzMovement(current.left);
            FizzBuzzAction(current.data);
            FizzBuzzMovement(current.right);
        }
    }

    public static void FizzBuzzAction(int value) {
        if (value % 3 == 0 && value % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (value % 3 == 0) {
            System.out.println("Fizz");
        } else if (value % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(value);
        }
    }
}
