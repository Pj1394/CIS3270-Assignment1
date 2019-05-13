package Chapter2;

public class Exercise2_8{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long totalMilliseconds = System.currentTimeMillis();
		
		//TODO  obtain total seconds since midnight, Jan 1, 1970
		long totalSeconds = totalMilliseconds / 1000; 
		
		//Compute current second in the minutes in the hour
		long currentSecond = totalSeconds % 60;
		
		//Obtain the total minutes
		long totalMinutes = totalSeconds / 60;
		
		//Compute the current minutes in the hour
		long currentMinute = totalMinutes % 60;
		
		//Obtain total hours
		long totalHours = totalMinutes / 60;
		
		//Compute the current hour
		long currentHour = totalHours % 24;
		
		//Display Results 
		System.out.println(" Current time is " + currentHour + " ; " + currentMinute + " : "  + currentSecond + " GMT ");
	}
}
		