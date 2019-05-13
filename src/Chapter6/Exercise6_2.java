package Chapter6;

import java.util.Scanner;
/**
 * @author Phillip
 *
 */
public class Exercise6_2 {
		  public static void main(String[] args) {
		    //create scanner
			Scanner input = new Scanner(System.in);
		    
			//prompt user to Enter number
		    System.out.print("Enter a number: ");
		    long value = input.nextLong();

		    //Disply the sum of the digits 
		    System.out.println("The sum of digits for " + value +
		      " is " + sumDigits(value));
		  }
		  //method to calculate the sum of digits 
		  public static int sumDigits(long n) {
		    long temp = Math.abs(n);
		    int sum = 0;

		    while (temp != 0) {
		      int remainder = (int)(temp % 10);
		      sum += remainder;
		      temp = temp / 10;
		    }

		    return sum;
		  }
		}



