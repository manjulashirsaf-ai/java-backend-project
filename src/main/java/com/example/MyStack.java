package com.example;

import java.util.ArrayList;
import java.util.List;

public class MyStack<T> {
	private List<T> list = new ArrayList<>();
	
	public void push(T item) {
		list.add(item);
	}
	
	public T pop() {
		if (list.isEmpty()) {
			throw new IllegalStateException("Stack is empty");
		}
		return list.remove(list.size() - 1);
	}

	public T peek() {
		if(!list.isEmpty())
			return list.get(list.size() - 1);
		else {
			System.out.println("stack empty");
			return null;
		}
	}
	
	public int size() {
		return list.size();
	}
	
	public void printStack() {
		System.out.println(list);
	}
	
	public boolean contains(T item) {
		for(T ele : list) {
			if(ele.equals(item)) {
				System.out.println("Element exists");
				return true;
			}
		}
		System.out.println("Element does not exist");
		return false;
	}
}
