package com.zipcodewilmington.arrayutility;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;
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

        return null;
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

//    public T[] mergeArrays(T[] array1, T[] array2) {
//
//    }

  
}
