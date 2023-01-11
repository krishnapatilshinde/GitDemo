package com.git.demo;

import java.util.ArrayList;

public class LooslyCoupledArrayList {
	
	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		
		list.add(1);
		list.add("Krishna");
		list.add(2);
		list.add("Shinde");
		
		// here i have to print the elements of an array list 
		
		System.out.println("The elements of an array list is-->>"+list);
		
	}

}
