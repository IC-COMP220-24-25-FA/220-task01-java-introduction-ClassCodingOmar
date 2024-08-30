package edu.ithaca.dragon.shapes;

//Importing to create random numbers
import java.util.Random;

public class ShapeMain {
    
    public static void main(String[] args){
        //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
        //Allow the user to choose one, double the size of that one, and print them all again
        //Use a loop to repeat the process 5 times
        double rectangleLength;
        double rectangleWidth;
        int randMultiplier;

        Rectangle rectangleArray[] = new Rectangle[5]; 

        //Creating random numbers
        Random rand = new Random();

        for(int i=0; i<5; i++){

            //rand.nextDouble generates a double between 0 and 1.0, we will multiple this number by a random int so that not all doubles are less than one.
            //We set an upper bound of 998, but then add one in order to ensure we don't get a 0 integer. 
            randMultiplier = rand.nextInt(998) + 1;
            rectangleLength = rand.nextDouble() * randMultiplier;
            
            rectangleWidth = rand.nextDouble() * randMultiplier;

            rectangleArray[i] = new Rectangle(rectangleLength, rectangleWidth);
        }
        System.out.println("The following rectangles have been created: ");

        for(int i=0; i<5; i++){
            System.out.println(rectangleArray[i].printRectangle());
        }
    }
}
