import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class D01_ArrayReverseTest {

    @Test
    public void testEmpty() throws Exception {
        int[] numbers = {};
        D01_ArrayReverse.doubler(numbers);

        int[] expected = {};
        assertArrayEquals(expected, numbers);
    }

    @Test
    public void testDoubler() throws Exception {
        int[] numbers = {2, 4, 6, 8, 10};
        D01_ArrayReverse.doubler(numbers);

        int[] expected = {4, 8, 12, 16, 20};
        assertArrayEquals(expected, numbers);
    }

    @Test
    public void testReverse() throws Exception {
        int[] numbers = {10, 8, 6, 4, 2};
        D01_ArrayReverse.reverse(numbers);

        int[] expected = {2, 4, 6, 8, 10};
        assertArrayEquals(expected, numbers);
    }
}