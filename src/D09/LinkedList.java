package D09;

public class LinkedList {
    Node head;

    public LinkedList (Node node) {
        head = node;
    }

//    public void add(Node newNode) {
//        newNode.next = head;
//        head = newNode;
//    }

    public boolean hasloop () {
       Node fast = head;
       Node slow = head;

       while (fast != null) {
           slow = slow.next;
           fast = fast.next.next;

           if (fast == slow) {
               return true;
           }
       }
       return false;
    }
}
