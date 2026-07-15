package com.loops;

public class Perfect {
	
	public boolean isPerfect(int num) {
		
		int sum=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		
		return sum==num;
	}

	public static void main(String[] args) {
		Perfect obj = new Perfect();
		System.out.println(obj.isPerfect(7)?"perfect":"!perfect");
	}

}
