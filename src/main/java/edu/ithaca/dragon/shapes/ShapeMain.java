package edu.ithaca.dragon.shapes;

//Importing to create random numbers
import java.util.Random;
//Importing Scanner util to read inputs
import java.util.Scanner;
//Importing Number Formatter
import java.text.DecimalFormat;
//Importing Lists
import java.util.List;
import java.util.ArrayList;

public class ShapeMain {
    
    public static void main(String[] args){
        //New code for interface use
        int selectedShape;
        List<Shape> shapeArray = new ArrayList<Shape>();
        //Creating seperate rand object, to prevent disturbing old code
        Random rand2 = new Random();
        //Similar story for all the other repeated variables from later in the code
        int randMultiplier2;

        //Boolean to check for valid shapes in the event of triangle construction
        boolean validShape = false;

        //For loop creating and printing initial loop
        for (int i=0;i<10;i++){
            //Random int (0-2) generated to determine shape type
            selectedShape = rand2.nextInt(3);
            randMultiplier2 = rand2.nextInt(998) + 1;
            if (selectedShape == 0){
                shapeArray.add(i, new Circle((randMultiplier2*rand2.nextDouble())));
            }
            if (selectedShape == 1){
                shapeArray.add(i, new Rectangle((randMultiplier2*rand2.nextDouble()), (randMultiplier2*rand2.nextDouble())));
            }
            if (selectedShape == 2){
                //While loop with try catch until a valid triangle is created
                while (validShape == false){
                    try{
                        shapeArray.add(i, new Triangle((randMultiplier2*rand2.nextDouble()), (randMultiplier2*rand2.nextDouble()), (randMultiplier2*rand2.nextDouble())));
                        validShape = true;
                    }
                    catch(Exception e){

                    }
                }
                validShape = false;
            }
            //Printing 
            System.out.println(shapeArray.get(i).toString());
        }

        //Doubling each element and printing again
        for (int i=0;i<10;i++){
            shapeArray.get(i).doubleSize();
            System.out.println(shapeArray.get(i).toString());
        }




        //OLD Rectangle Printer Begins
        //Declared Variables
        double rectangleLength;
        double rectangleWidth;

        //randMultiplier will be used to make doubles from more than just 0-1.
        int randMultiplier;

        //userInput will be used to check for proper user inputs. Set to -1 in order to fail input checks initially. 
        int userInput = -1;


        //Creating scanner to read user inputs
        Scanner input = new Scanner(System.in);

        //Rectangle array to store all 5 user rectangles
        Rectangle rectangleArray[] = new Rectangle[5]; 

        //Creating random numbers
        Random rand = new Random();

        //For loop that will generate random doubles to populate the rectangle array
        for(int i=0; i<5; i++){

            //rand.nextDouble generates a double between 0 and 1.0, we will multiple this number by a random int so that not all doubles are less than one.
            //We set an upper bound of 998, but then add one in order to ensure we don't get a 0 integer. 
            randMultiplier = rand.nextInt(998) + 1;
            rectangleLength = rand.nextDouble() * randMultiplier;
            
            rectangleWidth = rand.nextDouble() * randMultiplier;

            rectangleArray[i] = new Rectangle(rectangleLength, rectangleWidth);
        }

        //Printing the array for the first time. 
        System.out.println("The following rectangles have been created: ");
        printArray(rectangleArray);

        //For loop asking user which rectangle they want to double and printing the new arrays 5 times
        for (int j=0; j<5; j++){
            System.out.println("Which rectangle would you like to double? (1-5)");
            
            //While loop to catch invalid inputs
            while (userInput < 0 | userInput > 5){
                //Try catch to get input, if input is not a number an error message will be printed, buffer is always cleared after getting the input
                try {
                    userInput = input.nextInt();
                    input.nextLine();
                }
                catch (Exception e){
                    System.out.println("Error: Must be a number");
                    input.nextLine();
                    userInput = -1;
                }
                //If statement to remind the user to print a valid input while the while loop is failing
                if (userInput < 0 | userInput > 5){
                    System.out.println("Please enter a valid input (1-5)");
                }
            }

            //Doubling the selected rectangle, and printing new rectangles
            rectangleArray[userInput-1].doubleSize();
            System.out.println("You chose rectangle " + userInput);
            printArray(rectangleArray);

            //Reseting user input
            userInput = -1;
        }
        //Closing scanner
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
