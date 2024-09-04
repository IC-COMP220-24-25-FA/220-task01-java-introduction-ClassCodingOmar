package edu.ithaca.dragon.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

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
        fail("Not implemented yet");
    }

    @Test
    public void findLastLargetTest(){
        fail("Not implemented yet");
    }

    @Test
    public void findFirstMostOccurencesOfLetterTest(){
        fail("not implemented yet");
    }
    
}
