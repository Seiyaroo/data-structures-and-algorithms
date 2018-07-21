package D08;

public class Node {
    public int Value;
    public Node Next;

    public Node(int value) {
        this.Value = value;
        this.Next = null;
    }

    public static Node MergeLists(Node rootA, Node rootB) {
        if (rootA == null)

        {
            throw new NullPointerException("Root A is null");
        }

        if (rootB == null) {
            throw new NullPointerException("Root B is null");
        }

        Node current = rootA;
        Node newNext = rootB;
        Node oldNext = rootA.Next;

        while (newNext != null) {
            current.Next = newNext;
            current = current.Next;
            newNext = oldNext;
            oldNext = current.Next;

    public void AddNodeToTail(Node) {
            if ()
    }

        }

        return rootA;
    }
}

