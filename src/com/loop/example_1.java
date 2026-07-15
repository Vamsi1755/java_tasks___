package com.loop;

public class example_1 {
	
	public void revesedNumber(int num) {
		int reverse = 0;
		while (num != 0) {
			int reminder = num%10;
			reverse = reverse * 10 + reminder;
			 num /= 10;
		}System.out.println(reverse);
	}

	public static void main(String[] args) {
		 int a = 1234;
		 
		 
		 example_1 obj = new example_1();
		 
		 obj.revesedNumber (a);
		 
		 
		 }

	}


