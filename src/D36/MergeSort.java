package D36;

//Crediting Geeks for Geeks

/* Java program for Merge Sort */
public class MergeSort {
    // Merges two subarrays of arr[]. 
    // First subarray is arr[l..m] 
    // Second subarray is arr[m+1..r] 
    void mergeSort(int array[], int left, int middle, int right) {
        // Find sizes of two subarrays to be merged 
        int n1 = middle - left + 1;
        int n2 = right - middle;

        /* Create temp arrays */
        int Left[] = new int[n1];
        int Right[] = new int[n2];

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
    void sort(int arr[], int l, int r) {
        if (l < r) {
            // Find the middle point 
            int m = (l + r) / 2;

            // Sort first and second halves 
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves 
            mergeSort(arr, l, m, r);
        }
    }
}