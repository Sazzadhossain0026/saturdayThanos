package com.upskill.java_3;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//practiceForLoop();
		
		//practiceWhileLoop();
		
		//practiceDoWhileLoop();
		
		//infiniteLoop();
		
		nestedForLoop();
	}
	
	
	
	
	public static void practiceForLoop(){      //do again and again upto upper limit
		
		int i;                              // initialize the variable
		
		for(i = 1; i <= 100; i++){           //setting lower limit, upper limit, increment or decrement
			
			
			System.out.println(i);          //statement
		}
		
		
		
		
	}
	
	
	
	public static void practiceWhileLoop(){          //do again and again until condition match
		
		int i = 1;                                    //initialize the variable
		
		while(i <= 10){                              //statement
			
			
			System.out.println("while loop numbers :" + i);
			i++;                                            //increment or decrement
		}
		
	} 
	
	
	
	public static void practiceDoWhileLoop(){             //do action until match the condition
		
		
		int i = 1;
		
		do {
			
			System.out.println("do while loop : " + i);
		
		}while(i <= 2);
	}
	
	
	public static void infiniteLoop(){
		
		
		int i = 1;
		
		for(i = 1;  ; i++){
			
			System.out.println(i);
		}
		
		
	}
	
	
	
	public static void nestedForLoop(){
		
		int i;
		int j;
		
		for(i = 1; i <= 10; i++){
			
			for(j = 1; j <= 10; j++){
				
				int multiplicationTable = i * j;
				
				System.out.print(multiplicationTable + " ");
			}
			
			System.out.println("");
		}
	}
	
	
	
	

}
