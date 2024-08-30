package edu.ithaca.dragon.shapes;

public class Triangle {
    private double lineOne;
    private double lineTwo;
    private double lineThree;

    public Triangle (double lineInputOne, double lineInputTwo, double lineInputThree){
        lineOne = lineInputOne;
        lineTwo = lineInputTwo;
        lineThree = lineInputThree;

        if (lineOne <= 0 | lineTwo <= 0 | lineThree <=0){
            throw new IllegalArgumentException("Side lengths must be greater than 0.");
        }
    }
    
}
