# Lecture Notes
## Merge Sort
Merge Sort is a divide and conquer algorithm; an input array
is divided in half, and is called recursively. When it goes down to one
element, the call works up and merges two subarrays.

## Learning Objectives
+ What is merge sort
+ Look at pseudocode
+ Code along to write the functions
+ When merge sort is useful

## Lecture Flow
+ Definition
+ [Big O](https://www.khanacademy.org/computing/computer-science/algorithms/merge-sort/a/analysis-of-merge-sort)
+ How to code it

## Diagram

Courtesy of GeeksForGeeks Visual ![image](https://www.geeksforgeeks.org/wp-content/uploads/Merge-Sort-Tutorial.png)

## Algorithm


## Pseudocode

    ALGORITHM Mergesort(arr)
        DECLARE n <-- arr.length

        if n > 1
          DECLARE mid <-- n/2
          DECLARE left <-- arr[0...mid]
          DECLARE right <-- arr[mid...n]
          // sort the left side
          Mergesort(left)
          // sort the right side
          Mergesort(right)
          // merge the sorted left and right sides together
          Merge(left, right, arr)

    ALGORITHM Merge(left, right, arr)
        DECLARE i <-- 0
        DECLARE j <-- 0
        DECLARE k <-- 0

        while i < left.length && j < right.length
            if left[i] <= right[j]
                arr[k] <-- left[i]
                i <-- i + 1
            else
                arr[k] <-- right[j]
                j <-- j + 1

            k <-- k + 1

        if i = left.length
           set remaining entries in arr to remaining values in right
        else
           set remaining entries in arr to remaining values in left


## Readings and References

### Watch
+ [youtube](https://www.youtube.com/watch?v=ZRPoEKHXTJg)

### Read
+ [GeeksForGeeks](https://www.geeksforgeeks.org/merge-sort/)
+ [Baeldung](https://www.baeldung.com/java-merge-sort)
