package Chapter2;


import java.util.Scanner;

public class Exercise2_5 {
	 public static void main(String[] args) {
		
		//Create Scanner

		Scanner input = new Scanner(System.in);

		//Prompt user
		System.out.print(" Enter Integer for Subtotal ");
		double Subtotal= input.nextDouble();

		System.out.print(" Enter Integer for Gratuity ");
		double Gratuity = input.nextDouble();

		//Calculate gratuity and Subtotal
		int GratuityRate = 0;
		double Gratuity1= Subtotal * (GratuityRate / 100);
		double Total = Subtotal + Gratuity1;

		//Display Result
		 
		System.out.println("The Gratuity is $. " + Gratuity + " The Total is $. " + Total);
		
	 }
	 
}