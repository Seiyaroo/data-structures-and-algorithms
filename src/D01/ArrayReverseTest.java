package D01;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class ArrayReverseTest {
    @Test
    public void testEmpty() throws Exception {
        int[] numbers = {};
        ArrayReverse.doubler(numbers);

        int[] expected = {};
        assertArrayEquals(expected, numbers);
    }

    @Test
    public void testDoubler() throws Exception {
        int[] numbers = {2, 4, 6, 8, 10};
        ArrayReverse.doubler(numbers);

        int[] expected = {4, 8, 12, 16, 20};
        assertArrayEquals(expected, numbers);
    }

    @Test
    public void testReverse() throws Exception {
        int[] numbers = {10, 8, 6, 4, 2};
        ArrayReverse.reverse(numbers);

        int[] expected = {2, 4, 6, 8, 10};
        assertArrayEquals(expected, numbers);
    }
}