package com.upskill.java_3;

public class encapsulation {

	
	
	private String name = "sazzad"; // write and read
	private int ssn = 775876970; //write
	private String userName = "sami123"; //read
	
	
	//setter method - name
	//String- sami
	public void setName(String value){
		
		name = value;                        //set the data- write
		
	}
	
	
	//getter mthod
	
	public String getName(){
		
		
		return name;                   //get the date - read                    
	}
	
	
	//int --ssn
	public void setNum(int num){
		
		ssn = num;
	}
	
	
	//String - username
	
	
	
	
	public String getUserName(){
		
		return userName;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		encapsulation obj = new encapsulation();
		
		obj.setName("sazzad");
		
		System.out.println(obj.getName());
		
		
		obj.setNum(12345);
		
	
		
		System.out.println(obj.getUserName());
		
		
		
	}

}
