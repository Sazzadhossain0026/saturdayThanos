package com.upskill.java_3;

public class implementInterface implements Interface {

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
		
	}

	@Override
	public void iRadio() {
		// TODO Auto-generated method stub
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		childAbstractClass obj = new childAbstractClass();
		
		obj.iDoor();
		
	}

	
	
	
}
