package com.upskill.java_3;

import com.upskill.java_2.methodType;

public class polymorphism extends methodType {
	
	
	
	//polymorphism is the ability of an object to take on many forms.
	//method overloading(compile time polymorphism/static binding)-- same method name with different signature to overload
	//method overriding(runtime polymorphism/dynamic binding)--same method name from parent class to override

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		car("red", 2);
		
		annualIncome3();
	}
	
	//method overloading
	public static void car(){
		
		
		System.out.println("my car is a honda");
	}
	
	public static void car(String color){
		
		System.out.println("my car is a honda and the color is " + color); //same method but diffrent signature
	}
	
	
    public static void car(String color, int door){
		
		System.out.println("my car is a honda and the color is " + color + "and it has " + door + " doors"); //same method but diffrent signature
	}
    
    
    
    
    //method overriding
    
    public static void annualIncome3(){
		int calculateAnnualIncome = hourlyIncome * 2000 + 1000;
		
		System.out.println("annual income: "+ calculateAnnualIncome);  //same method from methodType from parent class but its overridden by adding 1000
		
		
	}
    
    
    /////this is a second commit
    
    
    
    //test devSazzad

}
