package com.example;

public class PrimenNumbers {
	
	public static void main(String[] str) {
		
		System.out.println("Print prime numbers from 1 to 100: ");
		for(int i = 2; i <= 100; i++) {
			if(isprime(i))
				System.out.print(i + " ");
		}
		
	}
	
	static boolean isprime(int n) {
	
		for(int i = 2; i<=Math.sqrt(n); i++) {
			if(n % i == 0)
				return false;
		}
		return true;
	}
}
