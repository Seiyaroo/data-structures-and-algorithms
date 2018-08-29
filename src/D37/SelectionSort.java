package D37;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SelectionSort {
    public static void selectionSort(int array[]) {
        int n = array.length;

        //Iterate through the array via loop
        for (int i = 0; i < n-1; i++) {
            //Try to find the minimum element in the array
            int min = i;
            for (int j = i+1; j < n; j++)
                if (array[j] < array[min]) {
                    min = j;
                }
        }
        //Swapping mechanism to swap the min int with the first index in the array
        int temp = array[min];
        array[min] = array[i];
        array[i] = temp;
    }

//    public static void printTheArray(int array[]) {
//        int n = array.length;
//        for (int i = 0; i < n; i++) {
//            System.out.print(array[i] + " ");
//            System.out.println();
//        }
//    }

    public static int isSorted(int array[], int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        if (array[n-1] < array[n-2]) {
            return 0;
        }
        return isSorted(array, n-1);
    }

    public static int[] generateRandomArraysOfNumbers (int[] sizeOf) {
        while (sizeOf.length <= 10) {
            if (int i = 0; i < )
        }
    }

    public static Random shuffleTheArray(int[] arrayShuffle) {
        Random rnd = ThreadLocalRandom.current();
        for (int i = arrayShuffle.length - 1; i > 0; i--) {
            int index = arrayShuffle(Math.random());

            int a = arrayShuffle[index];
            arrayShuffle[index] = arrayShuffle[i];
            arrayShuffle[i] = a;
        }
    }

    //Merge sort method
    public static int[] mergeSort(int[] array, int start, int end) {
        //Defining the middle as the halfway mark of end - start divided by 2
        int middle = (end - start)/2; {
            if (end == start) {
                // aftering finding the middle you subtract that from the start and thats the index
                // you will be splitting down
                int[] leftSide = new int[middle - start];
                // the right side is the end minus the middle + 1 to start your new Right side array that is
                // the second half of your original array
                int[] rightSide = new int[end - middle + 1];
                // run your zipper method that takes in the array, and a left and right side
                zipper(array, leftSide, rightSide);
            }
            // recurse run your mergesort and at the end return the array that is now zipped back up and is
            // a sorted array from left to right ideally
            mergeSort(array, 0, middle);
            mergeSort(array, middle + 1, end);
            return array;
        }
    }

    // Helper function zipper method for mergesort
    public static int[] zipper(int[] arr, int[] L, int[] R) {
        int i = 0;
        int j = 0;
        int k = 0;

        // here you are saying that while the k integer is less than the length of your array
        // you run this function
        while (k < arr.length) {
            // if the length of (L)eft is equal to integer i you will equate array at integer k
            // to the (R)ight side at integer j
            if (i == L.length) {
                arr[k] = R[j];
                continue;
            }
            // if the length of j int matches the (R)ight side length of your array you will proceed through
            // this function
            if (j == R.length) {
                // array at integer k is equal to (L)eft side at index ++
                arr[k] = L[i++];
                continue;
            }
            // Essentially array at index k is = to L index which is less than R's index at that position.
            // you then run through L and R and then return that combined array of L + R which is
            // your return arr
            arr[k] = (L[i] < R[j]) ? L[i++] : R[j++];
        }
        return arr;
    }
}
