package edu.ithaca.dragon.shapes;
import java.text.DecimalFormat;

public class Rectangle implements Shape{
    private double length;
    private double width;

    public static final  DecimalFormat formattedValue = new DecimalFormat("#.00");
    

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
        
        if (length <= 0){
            throw new IllegalArgumentException("Invalid length");
        }

        if (width <= 0){
            throw new IllegalArgumentException("Invalid width");
        }
    }

    public double calcArea(){
       double area;
       area = length * width;

       return area;
    }

    public void doubleSize(){
        //Doubling length to double size of Rectangle
        length = 2 * length;
    }

    public double longestLineWithin(){
        //Longest line is the diagonal, formala is d = sqrt(l^2 + w^2)
        double diagonal;
        double diagonalSquared;

        diagonalSquared = length * length + width * width;
        diagonal = Math.sqrt(diagonalSquared);

        return diagonal;
    }

    public String printRectangle(){
        String rectangleDimensions;
        rectangleDimensions = formattedValue.format(length) + " x " + formattedValue.format(width);

        return rectangleDimensions;

    }

    public String toString(){
        String toStringFormat;
        toStringFormat = "Rectangle with Length: " + formattedValue.format(length) + " and Width: " +formattedValue.format(width);
        
        return toStringFormat;
    }
    
}
