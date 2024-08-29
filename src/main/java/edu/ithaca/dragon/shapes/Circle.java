package edu.ithaca.dragon.shapes;

public class Circle {
    private double radius;
    private static final double pi = 3.1415926; 
    private static final double squareRootTwo = 1.41421356237; 

    /**
     * @throws IllegalArgumentException if radius is not a positive number
     */
    public Circle(double radius){
        this.radius = radius;
    }

    /**
     * @return the area of this circle
     */
    public double calcArea(){
        double area;
        area = radius * radius * pi;
        return area;
    }

    /**
     * @post doubles the size of this circle
     */
    public void doubleSize(){
         radius = radius * squareRootTwo;
    }

    /**
     * @return the longest straight line that can be drawn within this circle
     */
    public double longestLineWithin(){
        throw new RuntimeException("Not implemented yet");
    }
}
