package com.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        System.out.println("Enter two numbers :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        
        int sum = a + b;
        int diff = a - b;
        int prod = a * b;
        double quo = (double)a / b;
        
        System.out.println("Sum: "+sum+"\n" + "Diff: "+diff+"\n"+"Prod :"+ prod+"\n"+"Quo :"+quo);
    }
}
