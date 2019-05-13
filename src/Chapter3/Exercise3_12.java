/**
 * 
 */
package Chapter3;

import java.util.Scanner;

/**
 * @author Phillip
 *
 */
public class Exercise3_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a three digit integer");
		int number = input.nextInt();
		
		
		
		
		int digit1 = number / 100;
		int digit3 = number % 10;
		
		//test for Palindrome 
		if (digit3 == digit1) {
			System.out.print(number + " is a palindrome");
		  } else {
		   System.out.print(number + " is not a palindrome");
		  }
		 
		 }
		 
		}
		