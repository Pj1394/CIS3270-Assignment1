/**
 * 
 */
package Chapter3;

import java.util.Scanner;

/**
 * @author Phillip
 * *3.17 (Game: scissor, rock, paper) 
 *  Write a program that plays the popular scissor-rock-paper game. 
 *  (A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock.) 
 *  randomly generates a number 0, 1, or 2 representing scissor, rock, and paper. 
 *  prompts the user to enter a number 0, 1, or 2 
 *  displays a message indicating whether the user or the computer wins, loses, or draws. 
 * 
 */
public class Exercise3_17 {

	
	public static void main(String[] args) {
		// Generate a random number for the computer. 0, 1, or 2
				
		Scanner input = new Scanner(System.in);
		
			int computer = (int)(Math.random() * 3);

				// Prompt the user to enter a number 0, 1, or 2
				System.out.print("Enter one of these numbers : scissor (0), rock (1), paper (2): ");
				int user = input.nextInt();

				
				//Display the computers hand and options
				System.out.print("The Computers choice is  ");
				switch (computer)
				{
					case 0: System.out.print("scissor."); break;
					case 1: System.out.print("rock."); break;
					case 2: System.out.print("paper.");
				}
				//Display your hand options
				System.out.print(" Your choice is ");
				switch (user)
				{
					case 0: System.out.print("scissor"); break;
					case 1: System.out.print("rock"); break;
					case 2: System.out.print("paper ");
				}

				// Display result if computer and user =, its a draw
				//if user has User has 
				//Scissor > paper
				//Rock > Scissor
				//Paper > rock
				//User is the winner
				//else, Computer wins
				if (computer == user)
					System.out.println(" It is a draw! ");
				else
				{
					boolean winner = (user == 0 && computer == 2) ||
							  (user == 1 && computer == 0) || 
							  (user == 2 && computer == 1);
					if (winner)
						System.out.println(". You are the winner! ");
					else
						System.out.println(". The Machines have won! ");

				}
		}
}
						
				



