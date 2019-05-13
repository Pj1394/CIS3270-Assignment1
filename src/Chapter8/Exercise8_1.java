/**
 * 
 */
package Chapter8;

import java.util.Scanner;

/**
 * @author Phillip
 *Write a test program that reads a 3-by-4 matrix and displays the sum of each column.
 * 
 */
public class Exercise8_1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [][] matrix = getMatrix();
		
		//display the sum of each column
		for (int col = 0; col < matrix[0].length; col++) {
			System.out.println(
					"Sum of the elements at column" + col + 
					"is" + sumColumn(matrix, col));
		}
	}
	
			
			//get the matrix
			public static double[][] getMatrix() {
				
				//create scanner
				Scanner input = new Scanner(System.in);
				final int ROWS = 3;
				final int COLUMNS = 4;
				double[][] m = new double [ROWS][COLUMNS];
				
				//prompt user to enter a 3-4 matrix
				System.out.println("Enter a " + ROWS + " by " +
				COLUMNS + " matrix row by row:");
				
				for (int row = 0; row < m.length; row++)
					for (int col = 0; col < m.length; col++) 
						m[row] [col] = input.nextDouble();
						
						return m;
			}
			
			//sum returns the sume of the elemets in colIndex
			private static double sumColumn(double [][] m, int columnIndex) {
				double sum = 0;
				for (int row = 0; row < m.length; row++) {
					sum += m[row][columnIndex];
					
				}
				
				return sum;
					
				}
				
			}
		


