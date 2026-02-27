package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<>();
		
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Pear");
		
		System.out.println("Student at index 1:" + fruits.get(1));
		
		fruits.remove(2);
		
		System.out.println(fruits);
		
		List<String> letters = new LinkedList<>();
		
		letters.add("A");
		letters.add("B");
		letters.add("C");
		letters.add("D");
		
		System.out.println("Letter at index 0:" + letters.get(0));
		
		letters.remove(0);
		
		System.out.println(letters);
		
		ArrayList<String> students = new ArrayList<String>();
		students.add("Mary");
		students.add("John");
		students.add("Kelly");
		students.add("Stephane");
		students.add("Joe");
		
		/*for(int i = 0; i < students.size(); i++) {
			if(students.get(i).equalsIgnoreCase("John")) {
				students.remove(i);
				break;
			}
		}*/
		
		students.removeIf(student -> student.equalsIgnoreCase("John"));
		
		students.add(1, "David");
		System.out.println("Total number of students: " + students.size());
		
		Collections.sort(students);
		
		students.replaceAll(student -> student.toUpperCase());
		
		System.out.println(students);
	}
}
