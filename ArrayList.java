/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.arraylist;

/**
 * Merge Sort Algorithm Used For This Application 
 * author: Fadi-Al-Tourkman 
 * Student Number: 21487366 
 * date: 11/05/2023
 */
public class ArrayList {

    public static void main(String[] args) {
        MyArrayList<Stock> stockList = new MyArrayList<Stock>();    // this creates a new instance of MyArrayList with Stock type and assigns it to the variable "stockList"
        
        stockList.add(new Stock("Apple", 5.51)); // this add new Stock object with name "Apple" and percentage 5.51 to the "stockList"
        stockList.add(new Stock("Google", 2.52)); // this adds new Stock object with name "Google" and percentage 2.52 to the "stockList"
        stockList.add(new Stock("Amazon", -5.02)); // this add new Stock object with name "Amazon" and percentage -5.02 to the "stockList"
        stockList.add(new Stock("Neflix", -12.49)); // this add new Stock object with name "Netflix" and percentage -12.49 to the "stockList"
        stockList.add(new Stock("Tesla", 13.73)); // this add new Stock object with name "Tesla" and percentage 13.73 to the "stockList"
        stockList.add(new Stock("Ford", -9.35)); // this add new Stock object with name "Ford" and percentage -9.35 to the "stockList"
        stockList.add(new Stock("GameStop", 12.46)); // this add new Stock object with name "GameStop" and percentage 12.46 to the "stockList"
        stockList.add(new Stock("Disney", 8.78)); // this add new Stock object with name "Disney" and percentage 8.78 to the "stockList"
        stockList.add(new Stock("Microsoft", -2.13)); // this add new Stock object with name "Microsoft" and percentage -2.13 to the "stockList"
        stockList.add(new Stock("Nitendo", -6.49)); // this add new Stock object with name "Nitendo" and percentage -6.49 to the "stockList"
        

        System.out.println("Array Size: " + stockList.size());
        System.out.println("Elements Before Sorting: " + "\n" +stockList.toString());  // this prints the initial list of elements in "stockList"
        stockList.resetComparisonCount();   // this resets the comparison count in "stockList" to 0
        stockList.mergeSortAlgorithm(0, (stockList.size() - 1));    // this applies the merge sort algorithm on "stockList" from index 0 to the last index

        System.out.println("Elements After Merge Sorting Order From Highest To Lowest Percentage: " + "\n" + stockList.toString());    // this prints the sorted elements in "stockList" after merge sort
        System.out.println("Total Number Of Comparisons: " + stockList.getCountComparison());   // this prints the total number of comparisons made during the merge sort
    }
}
