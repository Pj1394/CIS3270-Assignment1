package Chapter5;

import java.util.Scanner;

public class Exercise5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner input = new Scanner(System.in);

			int positives = 0; 	// Count the number of positive numbers
			int negatives = 0; 	// Count the number of negative numbers
			int count = 0;			// Count all numbers
			double total = 0;		//  total


			// Prompt  user to enter an number or 0 to exit
			System.out.print("Enter an integer, the input ends if it is 0: ");
			int number = input.nextInt();

			if (number == 0) {	
				System.out.println("No numbers are entered except 0");
				System.exit(1);
			}

			while (number != 0) {
				if (number > 0)
					positives++;	// Increase positives
				else
					negatives++;	// Increase negatives
				total += number;	// total
				count++;				// Increase  count
				number = input.nextInt();
			}

			//  average
			double average = total / count;

			// Display results
			System.out.println(
				"The number of positive is " + positives +
				"\nThe number of negatives is " + negatives +
				"\nThe total is total " + total +
				"\nThe average is " + average);
		}
	
	}


