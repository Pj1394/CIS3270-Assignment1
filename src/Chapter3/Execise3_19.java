/**
 * 
 */
package Chapter3;

import java.util.Scanner;

/**
 * @author Phillip
 * **3.19 (Compute the perimeter of a triangle)
 * Write a program that reads three edges for a triangle and computes the perimeter 
 * if the input is valid. 
 *Otherwise, display that the input is invalid. 
 * The input is valid if the sum of every pair of two edges is greater than the remaining edge.
 */
public class Execise3_19 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in); 
		
		// Prompt the user to enter three edges for a triangle
		System.out.println("Enter three edges for a triangle:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		 
	    // Compute the sides of the triangle
	    double edge1 =
	      Math.pow (Math.pow (x2 - x1, 2) + Math.pow (y2 - y1, 2), 0.5);
	    double edge2 =
	      Math.pow (Math.pow (x3 - x2, 2) + Math.pow (y3 - y2, 2), 0.5);
	    double edge3 =
	      Math.pow (Math.pow (x1 - x3, 2) + Math.pow (y1 - y3, 2), 0.5);
	    
	    // Compute area of the triangle 
	    double area = edge1 + edge2 + edge3;
	    System.out.println("The area of the triangle is" + area );
	  
	   
	    
		
		System.out.println(isValid(edge1, edge2, edge3) ? 
			"The area of the triangle is" + area:
		  	"Input is invalid");
		
	}

	private static boolean isValid(double edge1, double edge2, double edge3) {
		
		return false;
	}
}

