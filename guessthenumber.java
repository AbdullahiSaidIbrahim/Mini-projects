/*Abdullahi Said 
guess the number game*/
import java.util.Random;
import java.util.Scanner;

public class guessthenumber {

	public static void main(String[] args) {
		Random random = new Random ();
		Scanner scanner = new Scanner(System.in);
		 
		int randomNumber = random.nextInt(10) +1;
		System.out.println("The random number is" + randomNumber);
		
		while (true) {
		System.out.println(" Guess the Random Number between 1-10");
		int userInput= scanner.nextInt();
		int guess = -1;
		
		if( userInput == randomNumber) {
			System.out.println("YESSSSSS YOU WON THE RANDOM NUMBERIS " + randomNumber);
		break;
		}
		else if (randomNumber> guess) {
		System.out.println("Thats too high try again");
		}
		else {
		System.out.println("Thats too low try again ");
		}
		}
		
		
		
		

	}

}
