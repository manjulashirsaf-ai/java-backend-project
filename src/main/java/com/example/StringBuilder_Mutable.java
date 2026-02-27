package com.example;

public class StringBuilder_Mutable {

	public static void main(String[] args) {
		String str = "Hello";
		str.concat("World");
		System.out.println(str);
		
		StringBuilder strBuild = new StringBuilder(str);
		System.out.println(strBuild.append(" "+"World"));
		System.out.println(strBuild.reverse());
		
		StringBuffer strBuff = new StringBuffer(str);
		strBuff.append(" World");
		System.out.println(strBuff);
		System.out.println(strBuff.reverse());
		
		String rev = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		System.out.println(rev);
	}
}
