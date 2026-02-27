package com.example;

import java.util.Scanner;

public class CalculatorTest {
public static void main(String[] args) {
		
		/*System.out.println("Calculator: ");
		System.out.println("Enter two numbers :");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		sc.close();*/
		
		int res = Calculator.add(10, 20);
		double res1 = Calculator.add(3.4, 6.6);
		
		System.out.println(res);
		System.out.println(res1);
	}
}
