/**
 * 
 */
package Chapter4;

import java.util.Scanner;

/**
 * @author Phillip
 *
 */
public class Exercise4_13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			Scanner input = new Scanner(System.in);

			// Prompt the user to enter a letter
			System.out.print("Enter a letter: ");
			String s = input.nextLine();
			char vowel= s.charAt(0);

			if (Character.isLetter(vowel))
			{
				switch(Character.toUpperCase(vowel))
				{
				case 'A': System.out.println(vowel + " is a vowel"); break;
				case 'E': System.out.println(vowel + " is a vowel"); break;	
				case 'I': System.out.println(vowel + " is a vowel"); break;
				case 'O': System.out.println(vowel + " is a vowel"); break;
				case 'U': System.out.println(vowel + " is a vowel"); break;
				default : System.out.println(vowel + " is a consonant"); 
				}
			}
			else
				System.out.println(vowel + " is an invalid input");
		}
	

	}


