package Chapter1;

//Display Population after 5 years if:
//1 birth after 7 seconds
//1 death after 13 seconds
//1 immigrant after 45 seconds
//current Population is 312032486
//calculate seconds per year as 60 * 60 * 24 *365
//Calculate Per Year as (Blank) Per year / Rate
//Calculate Rate per year as: births - deaths + Immigration = rate per year
public class Example1_11 {
	public static void main(String[] args) {
		
		        System.out.println("current population is 312032486");
		        
		        int currentPopulation= 312032486;
		        int numberOfSecondsInYear = 31536000;
		        //number of seconds in a year 60 * 60 * 24 *365 = 31536000
		 
		        //Population after 1 year, number of births (7 seconds = 1 birth | plus)
		        int birthsPerYear = numberOfSecondsInYear / 7;
		        System.out.println("brithsPerYear: " + birthsPerYear);
		 
		        //Population after, number of deaths (13 seconds = 1 death | minus)
		        int deathsPerYear = numberOfSecondsInYear / 13;
		        System.out.println("deathsPerYear: " + deathsPerYear);
		 
		        //Population after, number of immigrants (45 seconds = 1 immigrant | plus)
		        int immigrantsPerYear = numberOfSecondsInYear / 45;
		        System.out.println("immigrantsPerYear: " + immigrantsPerYear);
		 
		        //Rate per year
		        int ratePerYear = birthsPerYear - deathsPerYear + immigrantsPerYear;
		        System.out.println("ratePerYear: " + ratePerYear);
		 
		        System.out.println("End of year 1 the population is " +(currentPopulation + (1 * ratePerYear)));
		        System.out.println("End of year 2 the population is " +(currentPopulation + (2 * ratePerYear)));
		        System.out.println("End of year 3 the population is " +(currentPopulation + (3 * ratePerYear)));
		        System.out.println("End of year 4 the population is " +(currentPopulation + (4 * ratePerYear)));
		        System.out.println("End of year 5 the population is " +(currentPopulation + (5 * ratePerYear)));
		    }
		
	}


