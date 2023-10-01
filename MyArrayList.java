/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraylist; // package named "mycompany.arraylist"

/**
 * Merge Sort Algorithm Used For This Application 
 * author: Fadi-Al-Tourkman
 * Student Number: 21487366 date: 11/05/2023
 */
public class MyArrayList<ElementType> extends java.util.ArrayList<ElementType> { // this defines the public class which is named "MyArrayList" that extends the java.util.ArrayList class and it has generic type parameter called "ElementType"

    private int countComparison = 0; // this declares a private integer variable which is named "countComparison"

    public int getCountComparison() { // this defines a public void method which is named "getCountComparison" which returns an integer
        return countComparison; //  returns the value of "countComparison"
    }

    public void resetComparisonCount() { //Defines a public void method named "resetComparisonCount"
        countComparison = 0;    // resets "countComparison" to 0
    }
    
    //Merge Sort Algorithm
    public void mergeSortAlgorithm(int Start, int End) { // this Defines a public void method which is named "mergeSortAlgorithm" that takes two integer arguments which are "Start" and "End"
        int Middle = 0; // this Declares and initializes an integer variable named "Middle" to 0
        if (Start < End) { // If the Start index is less than the End index
            Middle = (Start + End) / 2; // Calculates the Middle index
            mergeSortAlgorithm(Start, Middle); // this calls out the "mergeSortAlgorithm" method recursively for the first half of the array
            mergeSortAlgorithm(Middle + 1, End); // this calls out the "mergeSortAlgorithm" method recursively for the second half of the array
            mergeAlgorithm(Start, Middle, End); // this calls out the "mergeAlgorithm" method to merge the two sorted halves of the array
        } else {
            return; 
        }
    }


    //this is the Merge Sort Algorithm - Merging process
    public void mergeAlgorithm(int Left, int Middle, int Right) { // this Defines a public void method named "mergeAlgorithm" that takes three integer arguments which are "Left", "Middle", and "Right"
        int qCount = Left;  // this declares and initializes an integer variable named "qCount" to "Left"
        int sCount = Middle + 1;    // Declares and initializes an integer variable named "sCount" to "Middle + 1"
        int mCount = 0; // Declares and initializes an integer variable named "mCount" to 0
        java.util.ArrayList<Object> array = new java.util.ArrayList<Object>();  // Create a new ArrayList of Object type named "array"
        
        while (qCount <= Middle && sCount <= Right) {   // this loop while both "qCount" is less than or equal to "Middle" and "sCount" is less than or equal to "Right"
            countComparison = countComparison + 1;  // this increments the "countComparison" of variable by 1
            if (((Stock) get(qCount)).getStockPercentage() > ((Stock) get(sCount)).getStockPercentage()) {  // Compare the stock percentages of elements at indices "qCount" and "sCount"
                array.add(mCount, get(qCount)); // Add the elements at index "qCount" to "array"
                qCount = qCount + 1;    // this increments "qCount" by 1
            } else {
                array.add(mCount, get(sCount)); // Add the elements at index "sCount" to "array"
                sCount = sCount + 1;    // this increments "sCount" by 1
            }
            mCount = mCount + 1; // this increments "mCount" by 1
        }
        while (qCount <= Middle) { // this loop while "qCount" is less than or equal to "Middle"
            array.add(mCount, get(qCount)); // Add the elements at index "qCount" to "array"
            mCount = mCount + 1; // this increments "mCount" by 1
            qCount = qCount + 1; // this increments "qCount" by 1
        }

        while (sCount <= Right) {   // this loop while "sCount" is less than or equal to "Right"
            array.add(mCount, get(sCount)); // Add the elements at index "sCount" to "array"
            mCount = mCount + 1;    // this increments "mCount" by 1
            sCount = sCount + 1;     // this increments "sCount" by 1
        }
        for (qCount = Left, mCount = 0; qCount <= Right; qCount++, mCount++) {  // this loops through the elements from index "Left" to "Right" and then updates them with the sorted elements from "array"
            set(qCount, (ElementType) array.get(mCount));
        }
    }
}
