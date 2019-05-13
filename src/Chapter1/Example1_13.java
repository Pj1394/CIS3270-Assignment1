package Chapter1;

//Write Program that solves Equation
/*Cramer’s rule to solve the following 2 × 2 system of linear equation:
*ax + by = e
*cx + dy = f
* x = (e * d - b * f) / (a * d - b * c)
* y = (a * f - e * c) / (a * d - b * c)
* 3.4x + 50.2y = 44.5
*2.1x + .55y = 5.9
*/
public class Example1_13 {

  public static void main(String[] args) {

      // Variables for formula
      double a = 3.4;
      double b = 50.2;
      double c = 2.1;
      double d = 0.55;
      double e = 44.5;
      double f = 5.9;

      //Solve for X
      double x = (e * d - b * f) / (a * d - b * c);
      //Solve for Y
      double y = (a * f - e * c) / (a * d - b * c);

      //Display results
      System.out.println("x = " + x + " y = " + y);

  }
}