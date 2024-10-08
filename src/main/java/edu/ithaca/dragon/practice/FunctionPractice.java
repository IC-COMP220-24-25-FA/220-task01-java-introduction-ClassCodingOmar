package edu.ithaca.dragon.practice;

import java.util.List;
public class FunctionPractice {

    /**
     * @return the largest of the 3 numbers
     * @throws IllegalArgumentException if any of the numbers is negative
     */
    public static int largestOfThree(int first, int second, int third){
        int largestNumber = first;
        if (first < 0 | second < 0 | third < 0){
            throw new IllegalArgumentException();
        }

        if (largestNumber < second){
            largestNumber = second;
        }
        if (largestNumber < third){
            largestNumber = third;
        }
        return largestNumber;
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

        //Checking for one unit index
        if(numbers.size() == 1){
            return 0;
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

        //Checking for one unit index
        if(numbers.size() == 1){
            return 0;
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
        if(words.size() == 0){
            throw new IllegalArgumentException();
        }

        String finalWord = "";
        String tempWord = "";
        int letterCount = 0;
        int finalLetterCount = 0;
        for (int i=0;i<words.size();i++){
            for(int j=0;j<words.get(i).length();j++){
                if (words.get(i).toLowerCase().charAt(j)==letter){
                    tempWord = words.get(i);
                    letterCount++; 
                }
            }

            if (letterCount > finalLetterCount){
                finalLetterCount = letterCount;
                finalWord = tempWord;
            }
            letterCount = 0;
        }

        if (finalLetterCount == 0){
            throw new IllegalArgumentException();
        }

        return finalWord;
    }


}
