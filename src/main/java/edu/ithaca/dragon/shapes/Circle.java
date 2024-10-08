package edu.ithaca.dragon.shapes;
import java.text.DecimalFormat;

public class Circle implements Shape {
    private double radius;
    private static final double pi = Math.PI; 
    private static final double squareRootTwo = Math.sqrt(2); 

    public static final  DecimalFormat formattedValue = new DecimalFormat("#.00");

    /**
     * @throws IllegalArgumentException if radius is not a positive number
     */
    public Circle(double radius){
        this.radius = radius;
        if (radius <= 0){
            throw new IllegalArgumentException();
        }
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
        double diameter;
        diameter = radius * 2;
        return diameter;
    }

    public String toString(){
        String toStringFormat;
        toStringFormat = "Circle with Radius: " + formattedValue.format(radius);

        return toStringFormat;
    }
}
