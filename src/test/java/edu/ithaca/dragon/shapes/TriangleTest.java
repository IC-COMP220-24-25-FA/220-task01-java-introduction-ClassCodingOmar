package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    public void invalidConstructorTests(){

        //Tests for multiple failed invalid line lengths. 
        assertThrows(IllegalArgumentException.class, () -> new Triangle(0,0,0));

        assertThrows(IllegalArgumentException.class, () -> new Triangle(1,0,0));

        assertThrows(IllegalArgumentException.class, () -> new Triangle(0,1,1));

        assertThrows(IllegalArgumentException.class, () -> new Triangle(-1,0,0));

        //Tests for lines that fail the Triangle Inequality Theorem.
        assertThrows(IllegalArgumentException.class, () -> new Triangle(5,3,1));

        assertThrows(IllegalArgumentException.class, () -> new Triangle(3,5,1));

        assertThrows(IllegalArgumentException.class, () -> new Triangle(3,1,5));


    }

    @Test
    public void calcAreaTest(){
        Triangle myTriangle = new Triangle(3,3,3);
        assertEquals(3.8971, myTriangle.calcArea(), 0.0001);

        Triangle myTriangleTwo = new Triangle(4, 7, 9);
        assertEquals (13.4164, myTriangleTwo.calcArea(), 0.0001);

    }

    @Test
    public void doubleSizeTest(){
        Triangle myTriangle = new Triangle(3,3,3);
        myTriangle.doubleSize();
        assertEquals(7.7942, myTriangle.calcArea(), 0.0001);

        Triangle myTriangleTwo = new Triangle(7,4,5);
        myTriangleTwo.doubleSize();
        assertEquals(19.5959, myTriangleTwo.calcArea(), 0.0001);
    }
    
}
