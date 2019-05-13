package Chapter8;
/**
 * @author Phillip
 *
 */
public class Exercise8_4 {
	
		  /** Main method */
		  public static void main(String[] args) {
		    // Declare, create, and initialized array
		    double[][] workHours = {
		      {2, 4, 3, 4, 5, 8, 8},
		      {7, 3, 4, 3, 3, 4, 4},
		      {3, 3, 4, 3, 3, 2, 2},
		      {9, 3, 4, 7, 3, 4, 1},
		      {3, 5, 4, 3, 6, 3, 8},
		      {3, 4, 4, 6, 3, 4, 4},
		      {3, 7, 4, 8, 3, 8, 4},
		      {6, 3, 5, 9, 2, 7, 9}};

		    // Create an array to store total weekly hours
		    int[] weeklyHours = new int[workHours.length];
		    for (int a = 0; a < workHours.length; a++)
		      for (int b = 0; b < workHours[a].length; b++)
		        weeklyHours[a] += workHours[a][b];

		    int[] indexList = new int[weeklyHours.length];

		    // Sort weeklyHours
		    sortAndKeepIndex(weeklyHours, indexList);

		    // Display result
		    for (int a = weeklyHours.length - 1; a >= 0; a--)
		      System.out.println("Employee " + indexList[a] + ": " +
		        weeklyHours[a]);
		  }

		  /** The method for sorting the numbers */
		  static void sortAndKeepIndex(int[] list, int[] indexList) {
		    int currentMax;
		    int currentMaxIndex;

		    // Initialize indexList
		    for (int a = 0; a < indexList.length; a++)
		      indexList[a] = a;

		    for (int a = list.length - 1; a >= 1; a--) {
		      // Find the maximum in the list[0..a]
		      currentMax = list[a];
		      currentMaxIndex = a;

		      for (int b = a - 1; b >= 0; b--) {
		        if (currentMax < list[b]) {
		          currentMax = list[b];
		          currentMaxIndex = b;
		        }
		      }

		      // Swap list[a] with list[currentMaxIndex] if necessary;
		      if (currentMaxIndex != a) {
		        list[currentMaxIndex] = list[a];
		        list[a] = currentMax;

		        // Swap the index in indexList too
		        int temp = indexList[a];
		        indexList[a] = indexList[currentMaxIndex];
		        indexList[currentMaxIndex] = temp;
		      }
		    }
		  }
		}
	


