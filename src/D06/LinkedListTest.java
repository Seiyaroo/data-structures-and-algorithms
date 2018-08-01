package D06;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

class LinkedListTest {
    public LinkedList empty;
    public LinkedList l1;
    public LinkedList l2;
    public LinkedList l3;
    public LinkedList l4;

    @Before
    void setUp() {
        empty = new LinkedList();

        l1 = new LinkedList();
        l1.prepend(12);

        l2 = new LinkedList();
        l2.prepend(14);
        l2.prepend(12);

        l3 = new LinkedList();
        
    }

    @Test
    void toStringEmptyList() {
        assertEquals("[]", empty.toString());
    }

    @Test
    void toStringEmptyListTwo() {
        assertEquals("[12]", l2.toString());
    }

    @Test
    void toStringEmptyListThree() {

        assertEquals("[12, 14]", l3.toString());
    }

    @Test
    void toStringEmptyListFour() {

        assertEquals("[12, 14, 19, 92, 45]", l4.toString());
    }

    @Test
    void prepend() {
    }

    @Test
    void isEmpty() {
    }

    @Test
    void size() {
    }

    @Test
    void get() {
    }

    @Test
    void printList() {
    }

    @Test
    void append() {
    }

    @Test
    void insertBefore() {
    }

    @Test
    void insertAfter() {
    }
}