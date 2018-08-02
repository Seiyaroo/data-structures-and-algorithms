package D06;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {
    public LinkedList empty;
    public LinkedList l1;
    public LinkedList l2;
    public LinkedList l3;
    public LinkedList l4;

    @Before
    public void setUp() {
        empty = new LinkedList();

        l1 = new LinkedList();
        l1.prepend(12);

        l2 = new LinkedList();
        l2.prepend(14);
        l2.prepend(12);

        l3 = new LinkedList();
        
    }

    @Test
    public void toStringEmptyList() {
        assertEquals("[]", empty.toString());
    }

    @Test
    public void toStringEmptyListTwo() {
        assertEquals("[12]", l2.toString());
    }

    @Test
    public void toStringEmptyListThree() {

        assertEquals("[12, 14]", l3.toString());
    }

    @Test
    public void toStringEmptyListFour() {

        assertEquals("[12, 14, 19, 92, 45]", l4.toString());
    }

    @Test
    public void prepend() {
    }

    @Test
    public void isEmpty() {
    }

    @Test
    public void size() {
    }

    @Test
    public void get() {
    }

    @Test
    public void printList() {
    }

    @Test
    void append() {
    }

    @Test
    public void insertBefore() {
    }

    @Test
    public void insertAfter() {
    }
}