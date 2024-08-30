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

        //Triangles must satisfying the rule: No side of any triangle can be longer than the other two lines added together.

        if (lineOne > lineTwo + lineThree){
            throw new IllegalArgumentException("Side length one is too long.");
        }

        if (lineTwo > lineThree + lineOne){
            throw new IllegalArgumentException("Side length two is too long.");
        }

        if (lineThree > lineOne + lineTwo){
            throw new IllegalArgumentException("Side length three is too long.");
        }


    }

    public double calcArea(){
        double area;

        return area;
    }
    
}
