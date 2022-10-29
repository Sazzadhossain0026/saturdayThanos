package com.upskill.java_3;

public class encap2 {
	
	
	
	
	private String name = "sazzad";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

		encap2 obj = new encap2();
		
		obj.setName("rasel");
		
		System.out.println(obj.getName());
	}
	
	
      public void setName(String value){
		
		name = value;                        //set the data- write
		
	}
      
      
      
      public String getName(){
  		
  		
  		return name;                   //get the date - read                    
  	}

}
