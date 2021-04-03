package com.zipcodewilmington.arrayutility;

import java.util.Arrays;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T>  {  // created a generic class here

    T[] inputArray;

    public ArrayUtility() {} 

    public ArrayUtility(T[] inputArray) {  // constructor takes a generic type of array
        this.inputArray = inputArray;
    }


    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
//        int newLength = this.inputArray.length + arrayToMerge.length;
//
//        T[] mergedArray = Arrays.copyOf(inputArray, newLength);
//
////        inputArray = new <~>[newLength];
//        int counter = 0;
//        for (T element : inputArray) {
//            if (element.equals(valueToEvaluate)) {
//                counter++;
//            }
//        }
//        for (T element: arrayToMerge) {
//            if (element.equals(valueToEvaluate)) {
//                counter++;
//            }
//        }
//        return counter;
        Integer counter = this.getNumberOfOccurrences(valueToEvaluate);
        for (T element : arrayToMerge) {
            if (element.equals(valueToEvaluate)) {
                counter++;
            }
        }
        return counter;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
//        int arr1Length = inputArray.length;
//        int arr2Length = arrayToMerge.length;
//        T[] mergedArray = Arrays.copyOf(inputArray, arr1Length + arr2Length);
//        int j = 0;
//        for(int i = inputArray.length; i < mergedArray.length; i++) {
//            mergedArray[i] = arrayToMerge[j];
//            j++;
//        }
        T[] mergedArray = this.mergeArrays(arrayToMerge);
        T mostCommonElement = null;
        int globalCount = 0;

        for (int i = 0; i < mergedArray.length; i++) {
            T tempElement = mergedArray[i]; // this tempEl holds element@0, @1, so on
            int tempCount = 0;   // is going to hold the number of times element@0 is duped
            for (int j = 0; j < mergedArray.length; j++) {  // this loop will compare tempEl to each element in array and check for dupes
                if (tempElement.equals(mergedArray[j]))
                    tempCount++;         // if the tempEl(ex. element@0) == any elements in array, increase counter. this will give us the number of occurrences of each el in array
                    // each loop of array will return the number of occurrences of each element
                    // just need to compare
                    // if tempCount (the count of that current element) is greater than the global count, set global count to that -- found an element that occurs more frequently than my previous count
                    // also set mostcommon element to tempElement
                    // the element that I was just examining has the current most occurrences, and set that to the global element
            }
            if (tempCount > globalCount) {
                globalCount = tempCount;
                mostCommonElement = tempElement;
            }
        }
        return mostCommonElement;
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        int counter = 0;
        for (T element: inputArray) {
            if (element.equals(valueToEvaluate)) {
                counter++;
            }
        }
        return counter;
    }

    public T[] removeValue(T valueToRemove) {

        return null;
    }


    public T[] mergeArrays(T[] arrayToMerge) {
        int arr1Length = inputArray.length;
        int arr2Length = arrayToMerge.length;
        T[] mergedArray = Arrays.copyOf(inputArray, arr1Length + arr2Length);
        int j = 0;
        for(int i = inputArray.length; i < mergedArray.length; i++) {
            mergedArray[i] = arrayToMerge[j];
            j++;
        }
        return mergedArray;
    }

  
}
