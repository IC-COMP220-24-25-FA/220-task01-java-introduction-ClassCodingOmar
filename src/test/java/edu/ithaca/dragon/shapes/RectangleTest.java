package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
    
}
