package com.code;

import java.time.Year;

public class leapYearModern{


	public static void main(String[] args) {
		
		int year = 2026;
		boolean isLeap = Year.isLeap (year);

		if (isLeap){
			System.out.println(year + "is not a leap year");
		}else{
			System.out.println(year + "is aleap year");
		}
		
		
	}

}
