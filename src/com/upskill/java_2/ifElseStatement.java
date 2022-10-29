package com.upskill.java_2;

public class ifElseStatement {
	
	static int age = 170;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		age();
		
		
	}
	
	
	/// in if else u dont know the data
	
	public static void age(){
		
		
		if(age < 13){
			
			System.out.println("you are a child");
			
		}else if(age > 13 && age < 18){
			
			System.out.println("you are a teenager");
			
		}else if(age >= 60){
			
			
			//nested if else statement
			if(age > 100){
				
				System.out.println("you are hero");
			
			} else{
				
				System.out.println("you are a senior");
			}
			
			
			
		} else{
			
			System.out.println("you are a adult");
		}
			
			
	}
}


