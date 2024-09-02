package edu.ithaca.dragon.shapes;

//Importing to create random numbers
import java.util.Random;
//Importing Scanner util to read inputs
import java.util.Scanner;

import java.text.DecimalFormat;

public class ShapeMain {
    
    public static void main(String[] args){
        //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
        //Allow the user to choose one, double the size of that one, and print them all again
        //Use a loop to repeat the process 5 times
        double rectangleLength;
        double rectangleWidth;
        int randMultiplier;
        int userInput = -1;


        //Creating scanner to read user inputs
        Scanner input = new Scanner(System.in);

        //Rectangle array to store all 5 user rectangles
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

        printArray(rectangleArray);

        for (int j=0; j<5; j++){
            System.out.println("Which rectangle would you like to double? (1-5)");
        
            while (userInput < 0 | userInput > 5){
                try {
                    userInput = input.nextInt();
                    input.nextLine();
                }
                catch (Exception e){
                    System.out.println("Error: Must be a number");
                    input.nextLine();
                    userInput = -1;
                }
                if (userInput < 0 | userInput > 5){
                    System.out.println("Please enter a valid input (1-5)");
                }
            }

            rectangleArray[userInput-1].doubleSize();
            System.out.println("You chose rectangle " + userInput);

            printArray(rectangleArray);
            userInput = -1;
        }
        input.close();
    }

    //Helper function to print array
    public static void printArray(Rectangle rectangleArray[]){
        
        //Creating a number format to remove excess decimals
        DecimalFormat formattedValue = new DecimalFormat("#.00");
        //Creating variable to print in place of i, since math arguments were getting confused in println function.
        int printValue;

        for(int i=0; i<5; i++){
            printValue = i+1;
            System.out.println("Rectangle " + printValue + ": ");
            System.out.println("Dimensions: " + rectangleArray[i].printRectangle());
            System.out.println("Area: " + formattedValue.format(rectangleArray[i].calcArea()));
            System.out.println("Longest Line: " + formattedValue.format(rectangleArray[i].longestLineWithin()) + '\n');
        }

    }
}
