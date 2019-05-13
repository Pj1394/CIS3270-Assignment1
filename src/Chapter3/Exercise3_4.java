
package Chapter3;

/**
 * @author Phillip
 ***3.4 (Random month) Write a program that randomly generates an integer between 1 and 12
 * displays the English month name January, February, …, 
 * December for the number 1, 2, …, 12, accordingly.
 */
public class Exercise3_4 {
	public static void main(String[] args) {
		// Generate an integer between 1 and 12.
		//if you do 1 + 12 month will stay December
		//must do it this way to generate a new random number 
		int month = (int)((Math.random() * 12) +1);
	

		// Display the English month name January, Febuary...Etc.
		switch (month)
		{
			case 1: System.out.println("Month is January "); break;
			case 2: System.out.println("Month is February "); break;
			case 3: System.out.println("Month is March "); break;
			case 4: System.out.println("Month is April "); break;
			case 5: System.out.println("Month is May "); break;
			case 6: System.out.println("Month is June "); break;
			case 7: System.out.println("Month is July "); break;
			case 8: System.out.println("Month is August ");break;
			case 9: System.out.println("Month is September ");break;
			case 10: System.out.println("Month is October");break;
			case 11: System.out.println("Month is November ");break;
			case 12: System.out.println("Month is December ");break;
		}
	}
}

					
	


