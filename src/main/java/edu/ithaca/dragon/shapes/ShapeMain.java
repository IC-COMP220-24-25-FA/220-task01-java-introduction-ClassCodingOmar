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

        Rectangle rectangleArray[] = new Rectangle[5]; 

        //Creating random numbers
        Random rand = new Random();

        for(int i=0; i<5; i++){
            rectangleLength = rand.nextDouble();
            
            while(rectangleLength <= 0){
                rectangleLength = rand.nextDouble();
            }

            rectangleWidth = rand.nextDouble();

            while(rectangleWidth <= 0){
                rectangleWidth = rand.nextDouble();
            }

            rectangleArray[i] = new Rectangle(rectangleLength, rectangleWidth);
        }
        System.out.println("The following rectangles have been created: ");
        System.out.println();

    }
}
