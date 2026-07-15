package com.loop;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		

		        Scanner sc = new Scanner(System.in);

		        int total = 0;

		        for (int i = 1; i <= 5; i++) {
		            System.out.print("Enter Marks of Subject " + i + " : ");
		            int marks = sc.nextInt();
		            total += marks;
		        }

		        double average = total / 5.0;

		        System.out.println("Total Marks : " + total);
		        System.out.println("Average Marks : " + average);

		        sc.close();
		    }
		
	}


