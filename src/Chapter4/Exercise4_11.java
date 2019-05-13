/**
 * 
 */
package Chapter4;

import java.util.Scanner;

/**
 * @author Phillip
 **4.11 (Decimal to hex) Write a program that prompts the user to enter an 
 *integer between 0 and 15 and displays its corresponding hex number. 
 *For an incorrect input number, display invalid input. Here is a sample run:
 */
public class Exercise4_11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stu         
			    Scanner input = new Scanner(System.in);

			        System.out.print("Enter a decimal value (0 to 15): ");
			        int decimal = input.nextInt();


			        if (decimal <= 15 && decimal  >= 10) {
			            int value = ('A' + decimal - 10);
			            System.out.println("The hex value is " + (char)value );
			        }

			        else if (decimal  <= 10 && decimal  >= 0) {
			                System.out.println("The hex value is " + decimal );
			        }

			        else {
			            System.out.println("Invalid input");
			        }
			    }
			

	}


