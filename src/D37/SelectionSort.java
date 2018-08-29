package D37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SelectionSort {
//    // Selection sort method
//    public static void selectionSort(int array[]) {
//        int n = array.length;
//
//        //Iterate through the array via loop
//        for (int i = 0; i < n-1; i++) {
//            //Try to find the minimum element in the array
//            int min = i;
//            for (int j = i+1; j < n; j++)
//                if (array[j] < array[min]) {
//                    min = j;
//                }
//        }
//        //Swapping mechanism to swap the min int with the first index in the array
//        int temp = array[min];
//        array[min] = array[i];
//        array[i] = temp;
//    }

    //Merge sort method
    public static void mergeSort(int arr[], int x, int y, int z)
    {
        // Find sizes of two subarrays to be merged
        int n1 = y - x + 1;
        int n2 = z - y;

        /* Create temp arrays */
        int Left[] = new int [n1];
        int Right[] = new int [n2];

        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            Left[i] = arr[x + i];
        for (int j=0; j<n2; ++j)
            Right[j] = arr[y + 1+ j];
        System.out.println("" + Arrays.toString(arr));
        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray
        int k = x;
        while (i < n1 && j < n2)
        {
            if (Left[i] <= Right[j])
            {
                arr[k] = Left[i];
                i++;
            }
            else
            {
                arr[k] = Right[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of Left[] if any */
        while (i < n1)
        {
            arr[k] = Left[i];
            i++;
            k++;
        }

        /* Copy remaining elements of Right[] if any */
        while (j < n2)
        {
            arr[k] = Right[j];
            j++;
            k++;
        }
        System.out.println("" + Arrays.toString(arr));
    }

    // Main function that sorts arr[Left..Right] using
    // mergeSort()
    public static void sort(int arr[], int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr , m+1, r);

            // Merge the sorted halves
            mergeSort(arr, l, m, r);
        }
    }

    // ==============HELPER===============
    // ==============FUNCTIONS============

//    public static void printTheArray(int array[]) {
//        int n = array.length;
//        for (int i = 0; i < n; i++) {
//            System.out.print(array[i] + " ");
//            System.out.println();
//        }
//    }
//
//    public static int isSorted(int array[], int n) {
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//        if (array[n-1] < array[n-2]) {
//            return 0;
//        }
//        return isSorted(array, n-1);
//    }
        public static int[] generateRandomSizedArray (int size) {

            int[] a = new int[size];

            for (int i = 0; i < size; i++) {
                a[i] = (int)(Math.random()*10);

                for (int j = 0; j < i; j++) {
                    if (a[i] == a[j]) {
                        a[j] = (int)(Math.random()*10);
                    }
                }
            }

            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]+" ");
            }
            System.out.println();
            return a;
        }
//
//    public static Random shuffleTheArray(int[] arrayShuffle) {
//        Random rnd = ThreadLocalRandom.current();
//        for (int i = arrayShuffle.length - 1; i > 0; i--) {
//            int index = arrayShuffle(Math.random());
//
//            int a = arrayShuffle[index];
//            arrayShuffle[index] = arrayShuffle[i];
//            arrayShuffle[i] = a;
//        }
//    }



}
