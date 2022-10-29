package com.upskill.java_3;

public class childAbstractClass extends abstractClass {

	@Override
	public void iDoor() {
		// TODO Auto-generated method stub
		int door = 4;
		
		System.out.println("door: " + door);
	}

	@Override
	public void iWheel() {
		// TODO Auto-generated method stub
	
		int wheel = 4;
		
		System.out.println("wheel: " + wheel);
		
	}

	@Override
	public void iSeat() {
		// TODO Auto-generated method stub
	 
		int seat = 4;
		
		System.out.println("seat: " + seat);
	}

	@Override
	public void iRadio() {
		// TODO Auto-generated method stub
		
		int radio = 1;
		
		System.out.println("radio: " + radio);
	}
	
	
	public static void main(String[] args){
		
		childAbstractClass obj = new childAbstractClass();
		
		obj.iDoor();
		
		obj.engine();
	}

}
