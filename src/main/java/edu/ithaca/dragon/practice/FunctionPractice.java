package edu.ithaca.dragon.practice;

import java.util.List;
import java.util.ArrayList;
public class FunctionPractice {

    /**
     * @return the largest of the 3 numbers
     * @throws IllegalArgumentException if any of the numbers is negative
     */
    public static int largestOfThree(int first, int second, int third){
        throw new RuntimeException("Not Implemented");
    }
    
    /**
     * @return the final price at register of the given item after discount and tax applied
     */
    public static double calcSalePrice(double originalPrice, double discountPercent, double salesTax){
        double salePrice;
        //Converting entered doubles to a demical for easier calculation
        double decimalPercent = discountPercent/100;
        double decimalTax = salesTax/100;
        
        salePrice = originalPrice - (originalPrice * decimalPercent);
        salePrice = salePrice + (salePrice * decimalTax);

        return salePrice;
    }

    /**
     * @return true if the data collected shows the dog is good, false if bad dog today
     */
    public static boolean isGoodDog(int yearsOld, int daysSinceShoesChewed, boolean fetchedThePaperToday){
        //Dogs are always good
        return true;
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the first occurence.
     */
    public static int findFirstLargest(List<Integer> numbers){
        //Initialized to first index
        int largestIndex = 0;
        //Checking for empty index
        if (numbers.isEmpty()){
            return -1;
        }

        for (int i=1;i<(numbers.size());i++){
            if (numbers.get(i) > numbers.get(largestIndex) ){
                largestIndex = i;
            }
        }

        return largestIndex;
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the last occurence.
     */
    public static int findLastLargest(List<Integer> numbers){
        //Initialized to first index
        int largestIndex = 0;
        //Checking for empty index
        if (numbers.isEmpty()){
            return -1;
        }

        for (int i=1;i<(numbers.size());i++){
            if (numbers.get(i) >= numbers.get(largestIndex) ){
                largestIndex = i;
            }
        }

        return largestIndex;
    }

    /**
     * @return the string that has contains the most occurences of the given letter
     * @throws 
     */
    public static String findFirstMostOccurencesOfLetter(List<String> words, char letter){
        throw new RuntimeException("Not Implemented");
    }


}
