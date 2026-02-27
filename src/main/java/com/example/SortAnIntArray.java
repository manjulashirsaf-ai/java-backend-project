package com.example;

import java.util.Arrays;

public class SortAnIntArray {

	public static void main(String[] args) {
		
		int[] arr = {9, -1, 0, 8, 3, 7, 6};
		
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
