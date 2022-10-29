package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;

public class hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// hashmap stores multiple data using key-value pair, implemantation of map interface
		
				HashMap<String, Integer> student = new HashMap<String, Integer>();
				
				student.put("sazzad", 29);
				student.put("mumu",   28);
				student.put("mintu", 23);
				
				
				System.out.println("student age " + student.get("sazzad"));
				
				//another hashmap
				HashMap<String , String> info = new HashMap<String, String>();
				
				info.put("usa", "ny");
				info.put("bangladesh", "chittagong");
				
				
				System.out.println("information : " + info.get("usa"));
				
				
				
				
				//hashset store collection containing unique value, implementation of set interface
				
				HashSet<String> car = new HashSet<String>();
				
				car.add("bmw");
				car.add("mercedes");
				car.add("honda");
				
				System.out.println("car " + car);
				
				
				//hashtable is same as hashmap but it is single threaded and more synchronous
				
		
		
	}
	


}
