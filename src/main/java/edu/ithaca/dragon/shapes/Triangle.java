package edu.ithaca.dragon.shapes;

public class Triangle {
    private double lineOne;
    private double lineTwo;
    private double lineThree;
    private static final double squareRootTwo = Math.sqrt(2); 

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
        //To calculate a triangle's area from three sides one must follow Heron's formula:
        //Area = squareroot(s(s-a)(s-b)(s-c)) where s is the semi-perimeter.
        //s = (a+b+c)/2
        //Therefore we will make a variable for the semiperimeter and perimeter just to make calculations simpler instead of nesting equations. 

        double perimeter;
        double semiperimeter;
        perimeter = lineOne + lineTwo + lineThree;
        semiperimeter = perimeter/2;

        //To maintain simplicity of code and avoid nesting equations and potentially inducing more error, we will now initialize a few more helper variables.
        //These aren't necessary, but it reduces risk of error in making sure equations are properly nested. Can be removed if there's optimization concerns.
        double heronTotalValue;
        double heronA;
        double heronB;
        double heronC;

        heronA = semiperimeter - lineOne;
        heronB = semiperimeter - lineTwo;
        heronC = semiperimeter - lineThree;

        heronTotalValue = semiperimeter * heronA * heronB * heronC;

        area = Math.sqrt(heronTotalValue);

        return area;
    }

    public void doubleSize(){
        //To double the size of a triangle, each side must be multipled by sqrt(2).
        lineOne = lineOne * squareRootTwo;
        lineTwo = lineTwo * squareRootTwo;
        lineThree = lineThree * squareRootTwo;

    }

    public double longestLineWithin(){
        //Smarter mathmaticians have prooved that the longest line of a triangle is always one of the sides.
        
        double longestLine;
        longestLine = lineOne;

        if (lineTwo > longestLine){
            longestLine = lineTwo;
        }

        if (lineThree > longestLine){
            longestLine = lineThree;
        }

        return longestLine;
    }
    
}
