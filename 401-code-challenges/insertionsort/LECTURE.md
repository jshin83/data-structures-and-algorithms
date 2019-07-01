# Lecture Notes: Insertion Sort
This is the code for an insertion sort, which is most useful when we know an array
is mostly sorted.

## Learning Objectives
+ insertion sort algorithm
+ running time
+ space

## Lecture Flow
+ Insertion Sort PseudoCode
+ Insertion Sort Algorithm
+ Insertion Sort Visual
+ Code-along for Insertion Sort
+ When to Use Insertion Sort

## Diagram
![insertion sort visual](https://s3.amazonaws.com/hr-challenge-images/insertion-sort/InsertionSortCorrect-small.png)

## Algorithm
+ Insertion sort iterates through an array. The array is iterated from 0 to its length and as the index iterates,
 the elements to the left of the index are in sorted order. You could think of the elements on the left of index
 i to be a sorted subarray. In an inner while loop, the subarray of sorted order is searched
 from index from i to 0 to "insert" the element a position, if the data in the index to the left is less than the element.

## Pseudocode
    InsertionSort(int[] arr)

    FOR i = 1 to arr.length

      int j <-- i - 1
      int temp <-- arr[i]

      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1

      arr[j + 1] <-- temp

## Readings and References
### Watch
+ [Video](https://www.youtube.com/watch?v=8oJS1BMKE64)

### Read and Bookmark

+ Article 1: [Khan Academy](https://www.khanacademy.org/computing/computer-science/algorithms/insertion-sort/a/insertion-sort)
+ Article 2: [Tutorial Horizon](https://algorithms.tutorialhorizon.com/insertion-sort-java-implementation/)
