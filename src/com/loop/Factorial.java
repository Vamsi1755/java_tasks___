package com.loop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		long Factorial = 1;
		
		for(int i=1;i<=n;i++) {
			Factorial *= i;
		}
		System.out.println("Factorial =" + Factorial);
		
		sc.close();
	}

}
