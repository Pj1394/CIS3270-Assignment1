/**
 * 
 */
package Chapter6;

import java.util.Scanner;

/**
 * @author Phillip
 *Use the reverse method to implement isPalindrome. 
 *A number is a palindrome if its reversal is the same as itself. 
 *Write a test program that prompts the user to enter an integer and 
 *reports whether the integer is a palindrome.
 */
public class Exercise6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner input = new Scanner(System.in); // Create a Scanner

			// Prompt the user to enter an integer
			System.out.print("Enter an integer: ");
			int number = input.nextInt();

			// Report whether the integer is a palindrome.
			System.out.println(number + (isPalindrome(number) ? " is " : " is not ") +
				"a palindrome.");
		}

		/** Method isPalindrome returns true if number is a palindrome */
		public static boolean isPalindrome(int number) {
			return number == reverse(number) ? true : false;
		}

		/** Method reverse returns the reversal of an integer */
		public static int reverse(int number) {
			String reverse = ""; 	// Holds reversed number
			String n = number + ""; // Convert number to string
			// Reverse string
			for (int i = n.length() - 1; i >= 0; i--) {
				reverse += n.charAt(i);
			}
			return Integer.parseInt(reverse); // Return reversed integer
		}
	
	}


