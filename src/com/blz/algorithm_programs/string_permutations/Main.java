package com.blz.algorithm_programs.string_permutations;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String arr1[] = IterativeMethod.iterative(); 
		Arrays.sort(arr1);
		System.out.println("After Sorting");
		for (String str : arr1) {
			System.out.print(str+" ");
		}
		System.out.println();
		String arr2[] = RecursionMethod.recursion();
		Arrays.sort(arr2);
		System.out.println("After Sorting");
		for (String str : arr2) {
			System.out.print(str+" ");
		}
		System.out.println();
		if(Arrays.equals(arr1,arr2)) {
			System.out.println("Arrays are Equal");
		}
		else {
			System.out.println("Arrays are not Equal");
		}
	}

}
