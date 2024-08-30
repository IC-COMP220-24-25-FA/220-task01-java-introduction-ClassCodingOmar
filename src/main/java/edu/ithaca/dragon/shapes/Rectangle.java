package edu.ithaca.dragon.shapes;

public class Rectangle {
    private double length;
    private double width;
    

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
        throw new RuntimeException("Not implemented yet");
    }
    
}
