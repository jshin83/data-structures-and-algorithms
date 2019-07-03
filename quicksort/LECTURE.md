# Lecture Notes
## Quick Sort
Comparison sort that uses a pivot and swaps elements
depending on whether if the elements are larger or smaller than the pivot.
The pivot's final place in the array is found, and the subarrays to its left andd
right recurse this same process.


### Learning Objectives
+ How quick sort works
    + pivot and partitioning
+ Big O
    + Time: O(nlogn) normally, but if pivot is one extreme or another (ie
    1 or 999999), O(n2)
    + Space: O(logn) -> recursive call stack halving, in-place swaps

### Lecture Flow
+ What is Quick Sort
+ Big O
+ Look at pseudocode
+ Code-along

### Diagram
![one](https://www.interviewcake.com/images/svgs/quicksort__input_unsorted_list.svg?bust=203)
![two](https://www.interviewcake.com/images/svgs/quicksort__input_unsorted_list_with_left_and_right_pointer.svg?bust=203)
![three](https://www.interviewcake.com/images/svgs/quicksort__input_list_with_swappped_8_and_3.svg?bust=203)
![four](https://www.interviewcake.com/images/svgs/quicksort__input_list_with_moving_the_left_pointer_to_7.svg?bust=203)
![five](https://www.interviewcake.com/images/svgs/quicksort__input_list_with_moving_the_right_pointer_to_2.svg?bust=203)
![six](https://www.interviewcake.com/images/svgs/quicksort__input_list_with_swapped_pivot_and_7.svg?bust=203)
![seven](https://www.interviewcake.com/images/svgs/quicksort__input__list_divided_on_two_smaller_lists.svg?bust=203)

![diagram](https://i2.wp.com/www.techiedelight.com/wp-content/uploads/Quicksort.png?fit=577%2C410&ssl=1)

### Algorithm
Divides array into two subarrays that compares to a pivot (in this case,
the right-most element). With left and right pointers, move elements comparing to
pivot. When left and right pointers meet, move pivot to that spot (final spot
in the sorted array).

Recurse.

### Pseudocode
    ALGORITHM QuickSort(arr, left, right)
        if left < right
            // Partition the array by setting the position of the pivot value
            DEFINE position <-- Partition(arr, left, right)
            // Sort the left
            QuickSort(arr, left, position - 1)
            // Sort the right
            QuickSort(arr, position + 1, right)

    ALGORITHM Partition(arr, left, right)
        // set a pivot value as a point of reference
        DEFINE pivot <-- arr[right]
        // create a variable to track the largest index of numbers lower than the defined pivot
        DEFINE low <-- left - 1
        for i <- left to right do
            if arr[i] <= pivot
                low++
                Swap(arr, i, low)

             // place the value of the pivot location in the middle.
         // all numbers smaller than the pivot are on the left, larger on the right.
         Swap(arr, right, low + 1)
        // return the pivot index point
         return low + 1

    ALGORITHM Swap(arr, i, low)
        DEFINE temp;
        temp <-- arr[i]
        arr[i] <-- arr[low]
        arr[low] <-- temp

### Readings and References
#### Watch
+ [youtube](https://www.youtube.com/watch?v=8hEyhs3OV1w)
#### Read
+ [interviewcake](https://www.interviewcake.com/concept/java/quicksort)
+ [GeeksforGeeks](https://www.geeksforgeeks.org/quick-sort/)