package Chapter3;

import java.util.Scanner;




/**
 * @author Phillip
 *
 */
public class Exercise3_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//create scanner
		
		System.out.println("Enter today ");
		int day = input.nextInt();
		
		System.out.println("Enter number of days passed ");
		int futureDay = input.nextInt();
		
		System.out.print(day);
		
		switch (day) {
		case 0:System.out.println(" Today is Sunday ");break;
		case 1:System.out.println(" Today is Monday ");break;
		case 2:System.out.println(" Today is Tuesday ");break;
		case 3:System.out.println(" Today is Wednsday ");break;
		case 4:System.out.println(" Today is Thursday ");break;
		case 5:System.out.println(" Today is Friday ");break;
		case 6:System.out.println(" Today is Sunday ");
		}
		
		switch (futureDay) {
		case 0:System.out.println(" The Future Day is Sunday ");break;
		case 1:System.out.println(" The Future Day is Monday ");break;
		case 2:System.out.println(" The Future Day is Tuesday ");break;
		case 3:System.out.println(" The Future Day is Wednsday ");break;
		case 4:System.out.println(" The Future Day is Thursday ");break;
		case 5:System.out.println(" The Future Day is Friday ");break;
		case 6:System.out.println(" The Future Day is Saturday ");
		
		}
		
	
		
	}
}