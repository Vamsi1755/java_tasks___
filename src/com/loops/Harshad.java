package com.loops;

public class Harshad {
	
	public boolean isHarshad(int num) {
		int sum = 0;
		int temp = num;
		while(num!=0) {
			sum += num%10;
			num/=10;
		}
		return temp%sum==0;
	}

	public static void main(String[] args) {
	  Harshad obj = new Harshad();
	  System.out.println(obj.isHarshad(18)?"Harshad":"!Harshad");
	}

}
