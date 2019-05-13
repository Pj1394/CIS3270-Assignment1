/**
 * 
 */
package Chapter5;

import java.util.Scanner;

/**
 * @author Phillip
 **5.9 (Find the two highest scores) Write a program that prompts the user to enter the number of students and each student’s name and score, and 
 *finally displays the student with the highest score and 
 *the student with the second-highest score. 
 *Use the next() method in the Scanner class to read a name rather 
 *using the nextLine() method.
 *
 */
public class Exercise5_9 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the number of students
		System.out.print("Enter the number of students: ");
		int numberOfStudents = input.nextInt();

		int score,highest = 0, 	// Holds students' score  			
				// Highest score 
			 secondHigest = 0;	// Second highest score
		String name = "", 		// Holds students' name
				 student1 = "", 	// Highest scoring student name
				 student2 = "";	// Second highest scoring student name
		
		// Prompt the user to enter each students' name and score
		System.out.println("Enter each students' name and score:");
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.print(
				"Student: " + (i + 1) + "\n   Name: ");
			name = input.next();
			System.out.print("   Score: ");
			score = input.nextInt();

			if (i == 0) {
				//first student the highest scoring student 
				highest = score;
				student1 = name;
			}
			else if (i == 1 && score > highest) {
				// Second student entered scored
				// higher than first student
				secondHigest = highest;
				highest = score;
				student2 = student1;
				student1 = name;
			}
			else if (i == 1) {
				// Second  entered scored
				// lower than first 
				secondHigest = score;
				student2 = name;
			}		
			else if (i > 1 && score > highest && score > secondHigest) {
				// Last  entered has the highest score 
				secondHigest = highest;
				student2 = student1;
				highest = score;
				student1 = name;
			}
			else if (i > 1 && score > secondHigest) {
				// Last entered has the second highest score 
				student2 = name;
				secondHigest = score;
			}
		}

		// Display the  with the highest score
		// and the student with the second-highest score.
		System.out.println(
			
			"Score is" + student1 + 
			 "Score is"+ student2);
	}

}


