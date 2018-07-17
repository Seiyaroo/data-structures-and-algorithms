package D06;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    public LinkedList empty;
    public LinkedList l1;
    public LinkedList l2;
    public LinkedList l3;
    public LinkedList l4;


    @BeforeEach
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
        assertEquals("[]", empty.l1.ToString());
    }

    @org.junit.jupiter.api.Test
    void toStringEmptyList() {
        assertEquals("[12]", empty.l2.ToString());
    }

    @org.junit.jupiter.api.Test
    void toStringEmptyList() {
        assertEquals("[12, 14]", empty.l3.ToString());
    }

    @org.junit.jupiter.api.Test
    void toStringEmptyList() {
        assertEquals("[12, 14, 19, 92, 45]", empty.l4.ToString());
    }

    @AfterEach
    void tearDown() {
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