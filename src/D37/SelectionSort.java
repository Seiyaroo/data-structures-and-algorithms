package D37;


import java.util.Random;

public class SelectionSort {
    // Selection sort method
    public static double[] selectionSort(double[] input) {
        //Iterate through the array via loop
        for (int i = 0; i < input.length; i++) {
            //Try to find the minimum element in the array
            int min = i;

            for (int j = i + 1; j < input.length; j++) {
                if (input[j] < input[min]) {
                    min = j;
                }
            }
        //Swapping mechanism to swap the min int with the first index in the array
        double tempStorage = input[i];
        input[i] = input[min];
        input[min] = tempStorage;
    }
    return input;
}

    //Merge sort method
    void mergeSort(double array[], int left, int middle, int right) {
        // Find sizes of two subarrays to be merged
        int n1 = middle - left + 1;
        int n2 = right - middle;

        /* Create temp arrays */
        double Left[] = new double[n1];
        double Right[] = new double[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            Left[i] = array[left + i];
        for (int j = 0; j < n2; ++j)
            Right[j] = array[middle + 1 + j];


        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = left;
        while (i < n1 && j < n2) {
            if (Left[i] <= Right[j]) {
                array[k] = Left[i];
                i++;
            } else {
                array[k] = Right[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of Left[] if any */
        while (i < n1) {
            array[k] = Left[i];
            i++;
            k++;
        }

        /* Copy remaining elements of Right[] if any */
        while (j < n2) {
            array[k] = Right[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // mergeSort()
    public void sort(double[] inputArr, int left, int right) {
        if (left < right) {
            // Find the middle point
            int middle = (left + right) / 2;

            // Sort first and second halves
            sort(inputArr, left, middle);
            sort(inputArr, middle + 1, right);

            // Merge the sorted halves
            mergeSort(inputArr, left, middle, right);
        }
    }


    // ==============HELPER===============
    // ==============FUNCTIONS============

    public static double[] randomN(int size) {
        double[] randomData = new double[size];

        for (int i = 0; i < size; i++) {
            Random randVal = new Random();
            randomData[i] = randVal.nextDouble() * 10000;
        }

        return randomData;
    }


    public static double[] duplicator(double[] original) {
        double[] copy = new double[original.length];

        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        return copy;
    }

    public static boolean isSorted(double[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i + 1] < input[i]) {
                return false;
            }
        }
        return true;
    }
}

