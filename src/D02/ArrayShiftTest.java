package D02;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;

public class ArrayShiftTest {

    @Test
    public void insertShiftArray() {
        int[] numbers = {2, 4, 6, 8};
        int n = 5;
        int[] result = ArrayShift.insertShiftArray(numbers, n);

        int[] expected = {2, 4, 5, 6, 8};

        assertNotEquals(expected.length, result.length);
    }
}

//adding this so I can push on new branch.