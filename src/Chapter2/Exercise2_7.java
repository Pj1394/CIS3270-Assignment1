package Chapter2;

import java.util.Scanner;

public class Exercise2_7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the number of minutes
		System.out.print("Enter the number of minutes: ");
		double minutes = input.nextDouble();

		// Compute the number of years and days
		double years = minutes / 525600;
		double days = (minutes % 525600) / 1440;

		// Display results
		System.out.println(minutes + " minutes is approximately " + years
			+ " years and " + days + " days");
	}
}


