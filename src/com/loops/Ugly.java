package com.loops;

public class Ugly {
	
	public boolean isUgly(int num) {
		if(num<=0) {
			System.out.println("is not ugly number");
		}
		
		while(num%2==0) {
		     num/=2;
		}
		
		while(num%3==0) {
			num/=3;
		}
		
		while(num%5==0) {
			num/=5;
		}
		
		return num == 1;
		
	}

	public static void main(String[] args) {
		Ugly obj = new Ugly();
		System.out.println(obj.isUgly(5));
	}

}
