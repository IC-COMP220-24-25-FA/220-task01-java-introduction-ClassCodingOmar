package edu.ithaca.dragon.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class FunctionPracticeTest {

    @Test
    public void largestOfThreeTest(){
        assertEquals(5, FunctionPractice.largestOfThree(4, 5, 2));
        assertEquals(5, FunctionPractice.largestOfThree(5, 4, 2));
        assertEquals(5, FunctionPractice.largestOfThree(4, 2, 5));
        assertEquals(5, FunctionPractice.largestOfThree(5, 5, 5));

        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(-1, -1, -1));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, -1, 3));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, 3, -1));
    }

    @Test
    public void calcSalePriceTest(){
        //Expecting inputs in the following format(Price, percentage in form of out of 100 ergo 50 for 50%, tax in form of out of 100 ergo 50 for 50%)
        assertEquals(FunctionPractice.calcSalePrice(100,0,0),100);
        assertEquals(FunctionPractice.calcSalePrice(100,50,10), 55);
    }

    @Test
    public void isGoodDogTest(){
        //Dogs are always good
        assertEquals(FunctionPractice.isGoodDog(5,3,true),true);
        assertEquals(FunctionPractice.isGoodDog(2,5,false),true);
    }

    @Test
    public void findFirstLargestTest(){
        List<Integer> testList = new ArrayList<Integer>();
        //Returning value of -1 for empty list
        assertEquals(FunctionPractice.findFirstLargest(testList),-1);
        //Testing with values
        Collections.addAll(testList, 1,4,6,2,4);
        assertEquals(FunctionPractice.findFirstLargest(testList),2);
        testList.clear();
        Collections.addAll(testList,0,0,0,0,0);
        assertEquals(FunctionPractice.findFirstLargest(testList),0);
    }

    @Test
    public void findLastLargetTest(){
        List<Integer> testList = new ArrayList<Integer>();
        //Returning value of -1 for empty list
        assertEquals(FunctionPractice.findLastLargest(testList),-1);
        //Testing with values
        Collections.addAll(testList, 1,4,6,2,4);
        assertEquals(FunctionPractice.findLastLargest(testList),2);
        testList.clear();
        Collections.addAll(testList,0,0,0,0,0);
        assertEquals(FunctionPractice.findLastLargest(testList),4);
    }

    @Test
    public void findFirstMostOccurencesOfLetterTest(){
        List<String> testList = new ArrayList<String>();
        //Checking for empty strings error
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.findFirstMostOccurencesOfLetter(testList, 'a'));
        //Testing various use cases
        Collections.addAll(testList, "This", "Is", "A", "List", "Of","Testing", "Words");
        //Throwing an error if character never appears
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.findFirstMostOccurencesOfLetter(testList, 'z'));
        
        assertEquals(FunctionPractice.findFirstMostOccurencesOfLetter(testList,'a'),"A");
        assertEquals(FunctionPractice.findFirstMostOccurencesOfLetter(testList,'t'),"Testing");
    }
    
}
