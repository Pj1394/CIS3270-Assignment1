/**
 * 
 */
package Chapter4;

/**
 * @author Phillip
 *Use the GPS locations for 
 *Atlanta, Georgia; Atlanta
	(33.7489954,-84.3879824)
 *Orlando, Florida; 
 *(28.5383355,-81.3792365)
 *Savannah, Georgia; 
 *(32.0835407,-81.0998342)
 *and Charlotte, North Carolina 
 *(35.2270869,-80.8431267)
 *in the figure in Section 4.1 to 
 *compute the estimated area enclosed by these four cities. 
 *Use the formula in Programming Exercise 4.2 to compute the distance between two cities. 
 *Divide the polygon into two triangles and use the formula in 
 *Programming Exercise 2.19 to compute the area of a triangle.)
 */
public class Exercise4_3 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x1 = 33.7489954; //atlanta
		double y1 = -84.3879824;
	    
		double x2 = 28.5383355;//orlando
	    double y2 = -81.3792364999;
        
	    double x3 = 32.0835407;//Savannah
        double y3 = -81.09983419999998;
	    
        double x4 = 35.2270869;//Charlotte
	    double y4 = -80.84312669999997;
        //Calculate 1st Triangle
	    double side1 = Math.sqrt(Math.pow(x1 - x2, 2 ) + Math.pow(y1, y2)); 
	    
	    double side2 = Math.sqrt(Math.pow(x2 - x3, 2 ) + Math.pow(y2, y3)); 
	    
	    double side3 = Math.sqrt(Math.pow(x1 - x3, 2 ) + Math.pow(y1, y3)); 
	    
	    double s = (side1 + side2 +side3)/ 2;
	    
	    double area = Math.sqrt(s*(s-side1) * (s-side2) * (s- side3));
	   
	    
	    //Calculate 2nd Triangle
	     side1 = Math.sqrt(Math.pow(x1 - x3, 2 ) + Math.pow(y1, y3)); 
	    
	     side2 = Math.sqrt(Math.pow(x4 - x3, 2 ) + Math.pow(y4, y3)); 
	    
	     side3 = Math.sqrt(Math.pow(x1 - x4, 2 ) + Math.pow(y1, y4)); 
	    
	     s = (side1 + side2 +side3)/ 2;
	    
	     area = Math.sqrt(s* (s-side1) * (s-side2) * (s - side3));
	     
	     
	    
	   
	    
		System.out.println("The area enclosed by the 4 cities is"  + area );

	}

}
