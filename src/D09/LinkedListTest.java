package D09;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void hasloop() {
        Node node = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node;

        LinkedList ll = new LinkedList(node);

        boolean result = ll.hasloop();
        boolean expected = true;

        assertEquals(expected, result);
    }

    @Test
    public void hasNoLoop() {
        Node node = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node.next = node2;
        node2.next = node3;
        node3.next = node4;

        LinkedList ll = new LinkedList(node);

        boolean result = ll.hasloop();
        boolean expected = false;

        assertEquals(expected, result);
    }

}