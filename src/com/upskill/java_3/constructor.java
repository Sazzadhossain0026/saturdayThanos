package com.upskill.java_3;

public class constructor {

	/*constructor is an inheritence of class, method same as class name. java will execute the constructor first.
	 * constructor cannot be static or override nor void or return type
	 * default constructor- no constructor is initialized
	 * parametarize constructor- add different signature
	 * constructor overloading- different signature
	 */
	
	String adName;
	int adAge;
	String adCity;
	
	
	public constructor(String name, int age){
		
	adName = name;
    adAge = age;
		
	}
	
	public constructor (String name, int age, String city){
		
		adName = name;
		adAge = age;
		adCity = city;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		constructor obj = new constructor("sazzad", 30);
		
		
		System.out.println(obj.adName);
		System.out.println(obj.adAge);
		
		
		constructor obj2 = new constructor("sazzad", 30, "nyc"); //constructor overloading
		

		System.out.println(obj2.adName);
		System.out.println(obj2.adAge);
		System.out.println(obj2.adCity);
		
		
		
	}

}
