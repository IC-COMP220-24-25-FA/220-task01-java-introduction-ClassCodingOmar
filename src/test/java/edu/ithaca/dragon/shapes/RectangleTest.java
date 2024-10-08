package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    public void testConstructerError(){
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(0,0));
    }

    @Test
    public void calcAreaTest(){
        //Creating Rectangle and testing calc area
        Rectangle myRectangle = new Rectangle(2,2); 
        assertEquals(4,myRectangle.calcArea());
    }

    @Test
    public void doubleSizeTest(){
        //Creating Rectangle and testing doubleSize function.
        Rectangle myRectangle = new Rectangle(2,2);
        myRectangle.doubleSize();
        assertEquals(8, myRectangle.calcArea());

    }

    @Test
    public void longestLineWithinTest(){
        //Creating Rectangle and testing longestLine function.
        Rectangle myRectangle = new Rectangle(2,2);
        assertEquals(2.828, myRectangle.longestLineWithin(), .001);
    }

    @Test
    public void printRectangleTest(){
        Rectangle myRectangle = new Rectangle(3,5);
        assertEquals("3.0 x 5.0", myRectangle.printRectangle());
    }
    
}
