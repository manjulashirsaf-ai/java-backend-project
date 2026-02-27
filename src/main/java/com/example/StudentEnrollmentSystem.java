package com.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class StudentEnrollmentSystem {

	public static void main(String[] args) {
		
		Set<Integer> studentIds = new HashSet<Integer>();
		studentIds.add(1);
		studentIds.add(2);
		studentIds.add(3);
		studentIds.add(4);
		studentIds.add(5);
		studentIds.add(5);
		
		Iterator<Integer> it = studentIds.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Map<String, Integer> map = new HashMap<>();
		map.put("Alice", 5);
		map.put("Joe", 3);
		map.put("John", 4);
		map.put("Jack", 6);
		map.put("Mansi", 2);
		map.put("Mansi", 3);
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		Queue<String> counselingQueue = new LinkedList<>();
        counselingQueue.offer("Alice");
        counselingQueue.offer("Joe");
        counselingQueue.offer("John");
        counselingQueue.offer("Jack");
        counselingQueue.offer("Mansi");

        System.out.println("\nInitial Counseling Queue: " + counselingQueue);

        // Simulate students getting counseling
        System.out.println("\n--- Counseling Session ---");
        while (!counselingQueue.isEmpty()) {
            String student = counselingQueue.poll(); // remove first student
            System.out.println(student + " has been counseled.");
        }

        System.out.println("Counseling Queue Empty: " + counselingQueue.isEmpty());
	}
}
