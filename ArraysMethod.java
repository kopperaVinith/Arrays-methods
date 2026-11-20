package com.arrays;

import java.util.Arrays;

public class ArraysMethod {
	
	public static void main(String[] args) {
		int arr[] = {34, 89, 23, 19};
		
		System.out.println(Arrays.toString(arr));
		
		
		int arr1[] = {12, 89, 38, 20, 47};
		System.out.println(Arrays.toString(arr1));
		
		Arrays.sort(arr1);
		
		System.out.println(Arrays.toString(arr1));
		
		int a[] = {10, 20, 60};
		int b[] = {10, 20, 10};
		System.out.println(Arrays.equals(a,  b));
		
		System.out.println(Arrays.compare(a, b));
		
		int arr3[] = new int[5];
		System.out.println(Arrays.toString(arr3));
		
		Arrays.fill(arr3, 7);
		System.out.println(Arrays.toString(arr3));
		
		int arr4[] = {2,4,6,7,8};
		int[] cpy = Arrays.copyOf(arr4, 3);
		int[] cpr = Arrays.copyOfRange(arr4, 0, 9);
		System.out.println(Arrays.toString(cpy));
		System.out.println(Arrays.toString(cpr));
		
	}

}
