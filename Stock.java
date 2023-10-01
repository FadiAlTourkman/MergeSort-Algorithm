/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraylist;

/**
 * Merge Sort Algorithm Used For This Application 
 * author: Fadi-Al-Tourkman 
 * Student Number: 21487366 
 * date: 11/05/2023
 */
public class Stock {
    private String stockName;   // this declares a private String variable named "stockName"
    private double stockPercentage; // this declares a private double variable named "stockPercentage"

    public Stock(String stockName, double stockPercentage) {    // this defines a constructor method that takes a String "stockName" and a double "stockPercentage" as arguments
        this.stockName = stockName; // this would assign the values of "stockName" passed as argument to the instance variable "stockName"
        this.stockPercentage = stockPercentage;  // this would assign the values of "stockPercentage" passed as argument to the instance variable "stockPercentage"
    }
    
    public Stock(){ // this defines a constructor method with no arguments
        stockName = " ";    // initializes the "stockName" with an empty String
        stockPercentage = 0.0;  // initializes the "stockPercentage" with 0.0
    }

    public void setStockName(String stockName) { // this defines a public void method named "setStockName" that takes a String "stockName" as argument
        this.stockName = stockName; // this assign the values of "stockName" passed as argument to the instance variable "stockName"
    }

    public void setStockPercentage(double stockPercentage) {    // this defines a public void method named "setStockPercentage" that takes a double "stockPercentage" as argument
        this.stockPercentage = stockPercentage; // this assign the values of "stockPercentage" passed as argument to the instance variable "stockPercentage"
    }

    public String getStockName() {  // this defines a public method named "getStockName" that returns a String
        return stockName;    // Returns the value of "stockName"
    }

    public double getStockPercentage() { // this defines a public method named "getStockPercentage" that returns a double
        return stockPercentage; // returns the value of "stockPercentage"
    }
    
    @Override
    public String toString(){   // this part overrides the toString() method of the Object class
        return "Stock Name: " + stockName + "-" +"Stock Percentage: " + stockPercentage+"%" + "\n"; // returns a formatted string representation of the Stock object
    }
}
