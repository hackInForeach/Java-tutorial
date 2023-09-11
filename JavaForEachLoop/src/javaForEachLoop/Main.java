package javaForEachLoop;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// for-each = traversing technique to iterate through the elements in an array/collection
		//            less steps, more readable
		//			  less flexible
		
		
		
		String[] animals = {"cat","dog","rat","bird"};
		
		ArrayList<String> animals1=new ArrayList();
		animals1.add("cat");
		animals1.add("dog");
		animals1.add("rat");
		animals1.add("bird");
		
		
		for (String animal:animals1) {
			System.out.println(animal);
		}
		
		

	}

}
