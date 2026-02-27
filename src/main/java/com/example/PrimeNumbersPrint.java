package com.example;

import java.util.Scanner;

public class PrimeNumbersPrint {
	
	public static void main(String[] args) {
		
		System.out.println("Print prime numbers up to :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int i = 2;
		while(i <= n) {
			
			if(isprime(i))
				System.out.print(i + " ");
			i++;
		}
	} 
	
	static boolean isprime(int n) {
		
		for(int i = 2; i<= Math.sqrt(n); i++){
			if(n % i == 0)
				return false;
		}
		return true;
	}
}
	

