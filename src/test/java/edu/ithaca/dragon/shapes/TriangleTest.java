package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    public void invalidConstructorTests(){
        assertThrows(IllegalArgumentException.class, () -> new Triangle(0,0,0));

        assertThrows(IllegalArgumentException.class, () -> new Triangle(1,0,0));

        assertThrows(IllegalArgumentException.class, () -> new Triangle(0,1,1));

        assertThrows(IllegalArgumentException.class, () -> new Triangle(-1,0,0));
        

    }
    
}
