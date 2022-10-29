package com.upskill.java_1;

public class variables {
	
	String country = "usa"; // instance or global variable- variable declared in class level
	
	static String name = "rupa"; // static variable- variables belong to the class. no need of object
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variables in java
		
		// instance or global variable
		
		//static variable
		
		//local variable- variables declared in methods
		
		//method parameter
		
		
		String city = "nyc";//local variable
		
		myMethod3("queens");
		
		
	}
	
	public static void myMethod1(){
		
		String city = "long island"; //local variable
	}

	

	public static void myMethod2(){
		
		String city = "bloomfield"; //local variable - variables declared in methods
	}
	
public static void myMethod3(String county){   // method parameter- variable used as method parameter. it is used to pass the data
		
		String city = "bloomfield"; //local variable
		
		System.out.println("method parameter:: " + county);
	}
}
