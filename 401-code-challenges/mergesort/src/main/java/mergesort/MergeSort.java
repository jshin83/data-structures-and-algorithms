/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package mergesort;

public class MergeSort {

    /**
     * Static method, merge sort
     * @param array int[], array to sort
     * @return int[], sorted array
     */
    public static int[] mergeSort(int[] array) {
        // if null, throw error
        if (array == null) {
            throw new NullPointerException("Your array is empty");
        }
        // if one element, don't bother - just return
        if (array.length == 1) {
            return array;
        }

        // 2 lists to hold data
        int[] left = new int[array.length / 2];
        int[] right = new int[array.length - left.length];
        // split array in half and put into lists
        /*
        Note to self:
        Arrays.copyOf does not only copy elements; it also creates a new array.
        System.arrayCopy copies into an existing array
         */
        System.arraycopy(array, 0, left, 0, left.length);
        System.arraycopy(array, left.length, right, 0, right.length);

        // sort
        mergeSort(left);
        mergeSort(right);

        // merge
        merge(left, right, array);
        return array;
    }

    // helper
    private static void merge(int[] left, int[] right, int[] arr) {
        int i = 0;
        int j = 0;
        int k = 0;

        // compare i and j elements
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        // copy - already sorted
        System.arraycopy(left, i, arr, k, left.length - i);
        System.arraycopy(right, j, arr, k, right.length - j);
    }

}