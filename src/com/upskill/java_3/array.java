package com.upskill.java_3;

import java.util.HashMap;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int age = 30;
		
		int ageStudent [] = new int []{30, 35, 34, 23, 16};  //array
		
		String nameStudent[] = new String[]{"sadman", "mumu", "samad", "chodon", "moti"};
		
		//array index [0] [1] [2] [3] [4]
		
		
		System.out.println("age = " + ageStudent[4]);
		
		System.out.println("total student = " + ageStudent.length);
		
		
		System.out.println("name: " + nameStudent[1]);
		
		System.out.println("total name " + nameStudent.length);
		
		
		
		
		
		// multi dimensional array
		
		//array index [0][0] [0][1] [0][2] [0][3] [0][4]
		//            [1][1] [1][2] [1][3] [1][4] [1][5]   
		
		int [][] ageStudent2D = { {30, 40, 50, 39, 27}, {45, 65, 47, 27, 54} };
		
		
		System.out.println("student age 2D = " + ageStudent2D[0][4]);
		
		System.out.println("total student 2D: " + ageStudent2D.length);
		
		
		
		
		
		
		}

}
