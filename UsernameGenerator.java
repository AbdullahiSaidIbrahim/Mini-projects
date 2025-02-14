//Name: Abdullahi Said
//Author: Abdullahi Said
//Class & Section: MC 2024 FALL-CSC110AB 13779
//Date Written: September 3, 2024
//Brief Description: This program prompts the user for their first and last name, 
//and generates a username composed of the first letter of the first name, the first 
//four characters of the last name, and a random number between 23 and 2024.
//Description of inputs: The user's first and last name entered separately.
//Description of outputs: A generated username string.
package Homeworks;
import java.util.Scanner;
import java.util.Random;

public class UsernameGenerator {
	
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        System.out.println("******Username Generator******");

	        // Prompt user for their first name
	        System.out.print("Enter your first name: ");
	        String firstName = scanner.nextLine();

	        // Prompt user for their last name
	        System.out.print("Enter your last name: ");
	        String lastName = scanner.nextLine();

	        // Generate the username
	        String firstInitial = firstName.substring(0, 1); // Get first letter of first name
	        String lastNamePart = lastName.substring(0, 4); // Get first four letters of last name
	        int randomNumber = 23 + random.nextInt(2024 - 23 + 1); // Generate a random number between 23 and 2024

	        String username = firstInitial + lastNamePart + randomNumber;

	        // Display the generated username
	        System.out.println("Username Generated: " + username);

	        System.out.println("Adios!");

	        // Close the scanner
	        scanner.close();
	}
}
	


/* 
Test Output:

******Username Generator******

Enter your first name: Abdullahi
Enter your last name: Said
Username Generated: ASaid1928
Adios!
*/
