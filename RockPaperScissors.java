package Homeworks;
		/**
		 * Program Name: RockPaperScissors.java
		 * Author: Abdullahi Said
		 * Class: CSC 110
		 * Date Written: 09/25/2024
		 * Brief Description: This program allows the user to play a Rock Paper Scissors game against the computer for a specified number of rounds. 
		 * The computer randomly picks rock, paper, or scissors, and the program keeps track of wins, losses, and ties.
		 * Description of inputs: User inputs their name, the number of rounds, and their choices (rock, paper, or scissors).
		 * Description of outputs: The program announces who won each round, keeps track of stats, and declares the overall winner at the end of all rounds.
		 */
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
	

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        Random random = new Random();
		        String[] rps = {"rock", "paper", "scissors"};
		        String playerChoice, computerChoice;
		        int playerWins, computerWins, ties, roundsPlayed, rounds = 0;
		        String playAgain;

		        System.out.println("Welcome to Rock Paper Scissors!");

		        do {
		            // Step 1: Get the player's name and handle empty input
		            String playerName = "";
		            while (playerName.isEmpty()) {
		                System.out.print("Enter your name: ");
		                playerName = scanner.nextLine().trim(); // Trim to remove leading spaces
		                if (playerName.isEmpty()) {
		                    System.out.println("Name cannot be empty. Please enter your name.");
		                }
		            }

		            // Step 2: Get the number of rounds and validate the input
		            boolean validInput = false;
		            while (!validInput) {
		                System.out.print("How many rounds would you like to play? ");
		                String roundInput = scanner.nextLine().trim(); // Read the input as a string and trim whitespace
		                try {
		                    rounds = Integer.parseInt(roundInput); // converting input to an integer
		                    if (rounds > 0) {
		                        validInput = true; // If it's a valid positive number, set validInput to true
		                    } else {
		                        System.out.println("Number of rounds must be a positive integer.");
		                    }
		                } catch (NumberFormatException e) {
		                    System.out.println("Invalid input. Please enter a valid number.");
		                }
		            }

		            playerWins = 0;
		            computerWins = 0;
		            ties = 0;
		            roundsPlayed = 0;

		            // Step 3-6: Play the specified number of rounds
		            while (roundsPlayed < rounds) {
		                System.out.print("Round " + (roundsPlayed + 1) + ": Rock, Paper, or Scissors? ");
		                playerChoice = scanner.nextLine().toLowerCase();

		                // Validate player input
		                if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
		                    System.out.println("Invalid choice! Please enter 'rock', 'paper', or 'scissors'.");
		                    continue; // Skip this round and ask again
		                }

		                // Step 3: Computer makes a random choice
		                computerChoice = rps[random.nextInt(3)];

		                // Step 5: Inform player about the round result
		                System.out.println(playerName + " played " + playerChoice + " - Computer played " + computerChoice);

		                // Step 6: Determine the winner for the round
		                if (playerChoice.equals(computerChoice)) {
		                    System.out.println("It's a tie!");
		                    ties++;
		                } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
		                           (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
		                           (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
		                    System.out.println("You won this round!");
		                    playerWins++;
		                } else {
		                    System.out.println("You lost this round!");
		                    computerWins++;
		                }

		                roundsPlayed++;
		            }

		            // Step 7: Determine the final winner
		            System.out.println("\nGame Over!");
		            System.out.println("Final Results:");
		            System.out.println(playerName + " won " + playerWins + " rounds.");
		            System.out.println("Computer won " + computerWins + " rounds.");
		            System.out.println("There were " + ties + " ties.");

		            double playerWinPercentage = ((double) playerWins / rounds) * 100;
		            double computerWinPercentage = ((double) computerWins / rounds) * 100;

		            System.out.printf("%s, you won %.2f%% of the time.\n", playerName, playerWinPercentage);
		            System.out.printf("Computer won %.2f%% of the time.\n", computerWinPercentage);

		            if (playerWins > computerWins) {
		                System.out.println(playerName + " is the overall winner!");
		            } else if (computerWins > playerWins) {
		                System.out.println("The computer is the overall winner!");
		            } else {
		                System.out.println("It's a tie game overall!");
		            }

		            // Step 8: Ask if the user wants to play again
		            System.out.print("Would you like to play again? (yes/no): ");
		            playAgain = scanner.nextLine().toLowerCase();

		        } while (playAgain.equals("yes"));

		        // Step 9b: Quit and print a goodbye message
		        System.out.println("Thanks for playing! Goodbye!");
		        scanner.close();
		    
		

		/**
		 * Validation Test Case Run:
		 * 
		 * Welcome to Rock Paper Scissors!
		 * Enter your name: 
		 * Name cannot be empty. Please enter your name.
		 * Enter your name: Abdullahi
		 * How many rounds would you like to play? 
		 * Invalid input. Please enter a valid number.
		 * How many rounds would you like to play? -5
		 * Number of rounds must be a positive integer.
		 * How many rounds would you like to play? 3
		 * Round 1: Rock, Paper, or Scissors? banana
		 * Invalid choice! Please enter 'rock', 'paper', or 'scissors'.
		 * Round 1: Rock, Paper, or Scissors? rock
		 * Abdullahi played rock - Computer played paper
		 * You lost this round!
		 * 
		 * Round 2: Rock, Paper, or Scissors? paper
		 * Abdullahi played paper - Computer played rock
		 * You won this round!
		 * 
		 * Round 3: Rock, Paper, or Scissors? scissors
		 * Abdullahi played scissors - Computer played scissors
		 * It's a tie!
		 * 
		 * Game Over!
		 * Final Results:
		 * Abdullahi won 1 rounds.
		 * Computer won 1 rounds.
		 * There were 1 ties.
		 * Abdullahi, you won 33.33% of the time.
		 * Computer won 33.33% of the time.
		 * It's a tie game overall!
		 * Would you like to play again? (yes/no): no
		 * Thanks for playing! Goodbye!
		 */
	

}
}
