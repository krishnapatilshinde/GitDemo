package com.git.demo;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList<String> arraylist=new ArrayList<String>();
		arraylist.add("Krishna");
		arraylist.add("pooja");
		arraylist.add("gopal");
		
		arraylist.stream().forEach(x->System.out.println(x));
	}

}
