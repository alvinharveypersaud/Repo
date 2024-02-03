/*
 * Class: CMSC203 
 * Instructor: Professor Evazi
 * Description: (Give a brief description for each Class)
 * Due: MM/DD/YYYY
 * Platform/compiler:
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Alvin Persaud
*/

package ESPGame;

import java.util.Scanner;
import java.util.Random;

public class ESPGame
{
	public static void main(String args[])
	{
		//Constant values used in the program
		final String COLOR_BLACK = "Black";
		final String COLOR_RED = "Red";
		final String COLOR_ORANGE = "Orange";
		final String COLOR_YELLOW = "Yellow";
		final String COLOR_GREEN = "Green";
		final String COLOR_BLUE = "Blue";
		final String COLOR_PURPLE = "Purple";
		final int NUM_ATTEMPTS = 11;
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int score = 0;
		
		String userName;
		String userDesc;
		String dueDate;
		
		System.out.println("Enter your name: ");
		userName = sc.nextLine();
		System.out.println("Describe yourself: ");
		userDesc = sc.nextLine();
		System.out.println("Due date: ");
		dueDate = sc.nextLine();
		System.out.println("CMSC203 Assigmnent 1: Test your ESP skills! ");
		
		int numCorrect = 0;
		//This for loop prompts the user to guess a color 11 times
		for(int i = 1; i <= NUM_ATTEMPTS; i++)
		{
			int numColor;
			numColor = rand.nextInt(7);
			String color;
			
			if(numColor == 0)
				color = COLOR_BLACK;
			else if(numColor == 1)
				color = COLOR_RED;
			else if(numColor == 2)
				color = COLOR_ORANGE;
			else if(numColor == 3)
				color = COLOR_YELLOW;
			else if(numColor == 4)
				color = COLOR_GREEN;
			else if(numColor == 5)
				color = COLOR_BLUE;
			else
				color = COLOR_PURPLE;
			 
			System.out.println("Round " + i);
			System.out.println("\nI am thinking of a color.");
			System.out.println("Is it Black, Red, Orange, Yellow, Green, Blue, or Purple?");
			System.out.println("Enter your guess: ");
			
			boolean firstTry = true;
			boolean isCorrect = false;
			//This while loop will always run until the user guesses correctly
			while(!isCorrect)
			{
				
				String guess;
				guess = sc.nextLine();
				//If the user guesses correctly, the program prints out what color it generated
				if(guess.toLowerCase().equals(color.toLowerCase()))
				{
					/*If the user guesses correctly on the first try, their score increments by 1.
					If not, the firstTry boolean will be set to false and the user will continue
					to be prompted to guess until the user guesses correctly*/
					if(firstTry)
						score++;
					isCorrect = true;
					System.out.println("\nI was thinking of " + color);
				}
				else
				{
					firstTry = false;
					System.out.println("You entered the incorrect color. Is it Black, Red, Orange, Yellow, Green, Blue, or Purple?");
					System.out.println("Enter your guess again: ");
				}
			}
		}
		System.out.println("Game Over\n\n");
		System.out.println("You guessed " + score + " out of " + NUM_ATTEMPTS + " correctly.");
		
		System.out.println("Student name: " + userName);
		System.out.println("User description: " + userDesc);
		System.out.println("Due date: " + dueDate);
		sc.close();
	}
}

