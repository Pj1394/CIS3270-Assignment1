package Chapter4;
/**
 * @author Phillip
 **4.8 (Find the character of an ASCII code)
 * Write a program that receives an ASCII code (an integer between 0 and 127) and 
 * displays its character. 
 *Here is a sample run:
 */
import java.util.Scanner;

public class Exercise4_8 {
	  public static void main(String[] args) {
	    //create Scanner
	    Scanner input = new java.util.Scanner(System.in);

	    // Enter an ASCII code
	    System.out.print("Enter an ASCII code: ");
	    int code = input.nextInt();

	    // Display result
	    System.out.println("The character for ASCII code "
	      + code + " is " + (char)code);
	  }
	}
