/**
 * 
 */
package Chapter2;

import java.util.Scanner;

/**
 * @author Phillip
 *(Health application: computing BMI) 
 *Body Mass Index (BMI)  
 *It can be calculated by taking your weight in kilograms and dividing by the square of your height in meters. 
 *Write a program that prompts the user to enter a weight in pounds and height in inches and displays the BMI.
 * Note that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
 */
public class Exercise2_14 {
	
	public static void main(String[] args) {
		// Create Scanner
		
		Scanner input =new Scanner(System.in);
		
		//Prompt user to Enter Weight and Height
		System.out.print("Enter weight in pounds. ");
		double weight = input.nextDouble();
		
		System.out.print("Enter height in inches. ");
		double height = input.nextDouble();
		
		//Create variable to do equation
		final double kilogramsPerPound = 0.45359237;
		final double metersPerInch = 0.0254;
		
		//compute BMI with Equation weight * height squared
		double weightInKilograms= weight * kilogramsPerPound;
		double heightInMeters = height * metersPerInch;
		double bmi = weightInKilograms/(heightInMeters * heightInMeters);
		
		//Display Results 
		
		System.out.println("BMI is " + bmi ); 
		
		}

}
