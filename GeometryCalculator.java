package Homeworks;

import java.util.Scanner;

/**
 * Geometry Calculator
 * Author: Abdullahi Said
 * Date: 16 September 2024
 * This program provides a menu for calculating the area of a circle, rectangle, triangle, or the volume of a cylinder.
 * It prompts the user to choose an option and then calculates and displays the result based on the user's choice.
 * Input validation is included to ensure valid data is entered.
 */


public class GeometryCalculator {

	public static void main(String[] args) {
		  // Create a Scanner object for user input
        Scanner scnr = new Scanner(System.in);
        int choice;
        double radius, length, width, base, height, area, volume;

        // Display the menu
        System.out.println("***Geometry Calculator***");
        System.out.println("1. Calculate the area of a Circle");
        System.out.println("2. Calculate the area of a Rectangle");
        System.out.println("3. Calculate the area of a Triangle");
        System.out.println("4. Calculate the volume of a Cylinder");

        // Prompt user to enter a choice
        System.out.print("\nEnter your choice (1-4): ");
        choice = scnr.nextInt();

        // Switch statement to handle different choices
        switch (choice) {
            case 1:  // Calculate the area of a circle
                System.out.print("Enter the circle's radius: ");
                radius = scnr.nextDouble();
                if (radius <= 0) {  // Check for positive radius
                    System.out.println("Error: Radius must be a positive number.");
                    break;
                }
                area = Math.PI * radius * radius;  // Area formula
                System.out.printf("The area is %.3f\n", area);
                break;

            case 2:  // Calculate the area of a rectangle
                System.out.print("Enter the rectangle's length: ");
                length = scnr.nextDouble();
                System.out.print("Enter the rectangle's width: ");
                width = scnr.nextDouble();
                if (length <= 0 || width <= 0) {  // Check for positive length and width
                    System.out.println("Error: Length and width must be positive numbers.");
                    break;
                }
                area = length * width;  // Area formula
                System.out.printf("The area is %.3f\n", area);
                break;

            case 3:  // Calculate the area of a triangle
                System.out.print("Enter the triangle's base: ");
                base = scnr.nextDouble();
                System.out.print("Enter the triangle's height: ");
                height = scnr.nextDouble();
                if (base <= 0 || height <= 0) {  // Check for positive base and height
                    System.out.println("Error: Base and height must be positive numbers.");
                    break;
                }
                area = 0.5 * base * height;  // Area formula
                System.out.printf("The area is %.3f\n", area);
                break;

            case 4:  // Calculate the volume of a cylinder
                System.out.print("Enter the cylinder's radius: ");
                radius = scnr.nextDouble();
                System.out.print("Enter the cylinder's height: ");
                height = scnr.nextDouble();
                if (radius <= 0 || height <= 0) {  // Check for positive radius and height
                    System.out.println("Error: Radius and height must be positive numbers.");
                    break;
                }
                volume = Math.PI * radius * radius * height;  // Volume formula
                System.out.printf("The volume is %.3f\n", volume);
                break;

            default:  // Invalid choice
                System.out.println("Error: Invalid choice. Please enter a number between 1 and 4.");
                break;
        }

        // End of program message
        System.out.println("Thanks for using the Geometry Calculator!");

	}

}

/*
Test Output:

***Geometry Calculator***
1.        Calculate the area of a Circle
2.        Calculate the area of a Rectangle
3.        Calculate the area of a Triangle
4.        Calculate the volume of a Cylinder

Enter your choice (1-4): 1
Enter the circle's radius: 3.7
The area is 43.008
Thanks for using the Geometry Calculator!

Enter your choice (1-4): 2
Enter the rectangle's length: 5
Enter the rectangle's width: 4
The area is 20.000
Thanks for using the Geometry Calculator!

Enter your choice (1-4): 5
Error: Invalid choice. Please enter a number between 1 and 4.
Thanks for using the Geometry Calculator!

Enter your choice (1-4): 1
Enter the circle's radius: -3.7
Error: Radius must be a positive number.
Thanks for using the Geometry Calculator!
*/

