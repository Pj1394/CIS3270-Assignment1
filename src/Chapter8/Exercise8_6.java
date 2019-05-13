package Chapter8;

import java.util.Scanner;
/**
 * @author Phillip
 *
 */
public class Exercise8_6 {
	

	
	  
	  public static void main(String[] args) {
				// Initialize two 3 x 3 matrices
				double[][] matrix1 = getmatrix(1);
				double[][] matrix2 = getmatrix(2);

				// Initialize matrix3 with the multiplication of matrix1 and matrix2
				double[][] matrix3 = multiplyMatrix(matrix1, matrix2);

				// Display matrix1, matrix2 and matrix3
				print(matrix1, matrix2, matrix3);
			}

			/** getmatrix */
			public static double[][] getmatrix(int n) {
				// Create a Scanner
				Scanner input = new Scanner(System.in);

				// Prompt the user to enter a 3 x 3 matrix
				System.out.print("Enter matrix" + n + ": ");

				double[][] m = new double[3][3];
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++)
						m[i][j] = input.nextDouble();
				}

				return m;
			}

			/** multiplyMatrix multiplies two matrices and returns the result */
			public static double[][] multiplyMatrix(double[][] a, double[][] b) {
				double[][] c = new double[3][3];

				for (int i = 0; i < c.length; i++) {
					for (int j = 0; j < c[i].length; j++) {
						for (int h = 0; h < c.length; h++) {
							c[i][j] += a[i][h] * b[h][j];
						}
					}
				}
				return c;
			}


			/** print displays all the elements in row r */
			public static void print(double[][] m, int r) {	
				for (int j = 0; j < m[r].length; j++) {
					System.out.printf("%5.1f", m[r][j]);
				}	
			}

			/** print displays results */
			public static void print(double[][] m1, double[][] m2, double[][] m3) {
				System.out.println("The matrices are added as follows");
				
				for (int i = 0; i < 3; i++) {
					print(m1, i);
					System.out.print((i == 1 ? "   * " : "     "));
					print(m2, i);
					System.out.print((i == 1 ? "   = " : "     "));
					print(m3, i);
					System.out.println();
				}
			}
		}
