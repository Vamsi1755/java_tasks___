package com.code;

public class task_5 {

	public static void main(String[] args) {
		
		double basicSalary = 30000.00;
		double hra = 5000;
		double da = 21000.00;
		
		double grossSalary = basicSalary + hra + da;
		
	    System.out.println(grossSalary);
	    
	    System.out.println("after comparing : "+ (grossSalary<50000));
	    
	    grossSalary += 5000;
	    
	    System.out.println("update salary ; "+ grossSalary);

	}

}
