/*
jen shin
This program containes a function to reverse an int array.
24 May 2019
ArrayReverse.java
 */

import java.util.Arrays;

public class ArrayReverse {
    public static void main (String[] args) {
        // create the array to test your code on later
        int[] startArr = new int[] {1,2,3,4,5,10};
        // print it out, nicely
        System.out.println(Arrays.toString(startArr));
        // call your reverseArray method and save the result in a variable
        int[] endArr = reverseArray(startArr);
        // print out the result, nicely
        System.out.println(Arrays.toString(endArr));

        //more tests
        //empty array
        int[] emptyArr = new int[] {};
        System.out.println(Arrays.toString(emptyArr));
        System.out.println(Arrays.toString(reverseArray(emptyArr)));

        //length of two
        int[] twoElemArr = new int[] {1, 2};
        System.out.println(Arrays.toString(twoElemArr));
        System.out.println(Arrays.toString(reverseArray(twoElemArr)));

        //odd length array
        int[] oddLenArr = new int[] {1, 2, 3};
        System.out.println(Arrays.toString(oddLenArr));
        System.out.println(Arrays.toString(reverseArray(oddLenArr)));

        //one element array
        int[] oneElArr = new int[] {1};
        System.out.println(Arrays.toString(oneElArr));
        System.out.println(Arrays.toString(reverseArray(oneElArr)));

        //neg number array
        int[] negElArr = new int[] {-1, -2, -3};
        System.out.println(Arrays.toString(negElArr));
        System.out.println(Arrays.toString(reverseArray(negElArr)));
    }

    /**
     * This function takes in an int array
     * and reverses the contents.
     * It is assumed the input is an int array.
     * This function will not work for an array that is not int.
     * @param inputArray
     * @return inputArray
     */
    public static int[] reverseArray(int[] inputArray) {
        // if one or no elements, return array
        int arrLen = inputArray.length;
        if(arrLen < 2) {
            return inputArray;
        }
        for(int i = 0; i < inputArray.length / 2; i++) {
            inputArray[i] += inputArray[arrLen - 1 - i];
            inputArray[arrLen - 1 - i] = inputArray[i] - inputArray[arrLen - 1 - i];
            inputArray[i] -= inputArray[arrLen - 1 - i];
        }
        return inputArray;
    }

}