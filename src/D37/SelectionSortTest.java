package D37;

import org.junit.Test;

import static org.junit.Assert.*;

public class SelectionSortTest {

    @Test
    public void mergeSortTest() {
        int[] inputArr = {8,5,3,4,2,7,1,6};

        SelectionSort.mergeSort(inputArr, 0, (0 + inputArr.length - 1) / 2, inputArr.length - 1);
//        int[] actual = MergeSort.mergeSort(arr, 0, arr.length - 1);
//        int[] expected = {1,2,3,4,5,6,7,8};
//
//        System.out.println(actual);
//        System.out.println(expected);
//
//        assertArrayEquals(expected, actual);


    }
}