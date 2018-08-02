package D02;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class ArrayShiftTest {

    @Test
    public void insertShiftArray() {
        int[] numbers = {2, 4, 6, 8};
        int n = 5;
        ArrayShift.insertShiftArray(numbers, n);

        int[] expected = {2, 4, 5, 6, 8};
        assertArrayEquals(expected, numbers);
    }
}