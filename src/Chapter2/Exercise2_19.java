/**
 * 
 */
package Chapter2;

import java.util.Scanner;

/**
 * @author Phillip
 **2.19 (Geometry: area of a triangle) 
 *Write a program that prompts the user to enter three points 
 *(x1, y1), (x2, y2), (x3, y3) of a triangle 
 * and displays its area.
 * The formula for computing the area of a triangle is
 *
 * s= (side1 + side2 + side3)/2; 
 * √
 * area = s(s − side1)(s − side2)(s − side3)√
 */
public class Exercise2_19 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three points for a triangle: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		
		//Compute Area of Triangle
		double side1 = Math.sqrt((x2 - x3) * (x2 - x3)  + (y2 - y3) * (y2 - y3));
		double side2 = Math.sqrt((x1 - x3) * (x1 - x3)  + (y1 - y3) * (y1 - y3));
		double side3 = Math.sqrt((x1 - x2) * (x1 - x2)  + (y1 - y2) * (y1 - y2));
		
		double area = side1 +side2 + side3; 
		 	
		//Compute Area of Triangle
		System.out.println("The area of the triangle is " + area);
			
	}
}
