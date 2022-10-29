package com.upskill.java_2;

public class methodType {
	
	
	 //void method --- no returns 
	//static method---no need obj
	//return type method-- return the data and create and obj
	
	
	public static int hourlyIncome = 65;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		methodType obj = new methodType();
		
		obj.annuallncome1();
		
		System.out.println("Income: " + obj.annualIncome2());
		
		annualIncome3();
		
	
		
	}
	
	
	//void method
	
	public void annuallncome1(){
		int calculateAnnualIncome = hourlyIncome * 2000;
		
		System.out.println("annual income: "+ calculateAnnualIncome);
	}
	
	//return type method
	
	public int annualIncome2(){
		int calculateAnnualIncome = hourlyIncome * 2000;
		
		return calculateAnnualIncome;
	}
	
	public static void annualIncome3(){
		int calculateAnnualIncome = hourlyIncome * 2000;
		
		System.out.println("annual income: "+ calculateAnnualIncome);
		
		
	}
	
}


	



	
	
	
	