package minuteandhour;

import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		System.out.println("Enter the value");
		String testValue = new Scanner(System.in).nextLine();
		// just pass the value to the actual calc method
		validateAndCalculate(testValue);
		
	}

	
	
	/**
	 * @param testValue
	 * @return
	 * Method to validate the input String and calculate the angle
	 */
	private static void validateAndCalculate(String testValue) {
		String time[] = testValue.split(":");
		int hour = Integer.parseInt(time[0]);
		int minute = Integer.parseInt(time[1]);
		// validate hour and minute
		if(hour >= 0 && hour < 24 && minute >= 0 && minute < 60) {
			// calc the angle of hour and minute with reference to 12
			
			// each hour takes about 60 minutes hence  360 degrees / 12 hours * 60 Minutes
			int hourAngle = (int) (( hour%12 * 60 + minute ) * 0.5);
			
			// minutes are spaced with a difference of 6 degrees (360/60)
			int minuteAngle = minute * 6;
			
			int result = Math.abs(minuteAngle - hourAngle);
			
			if((minuteAngle > hourAngle)) {
				result =  360 - result;
			} 
			System.out.println(result);
			
		} else {
			System.out.println("Invalid input");
		}
		
	}

}
