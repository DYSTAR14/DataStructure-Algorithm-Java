package com.blz.algorithm_programs.string_permutations;

public class RecursionMethod {
	static String arr2[];
	Integer count=0;
	public void permutation(String string, int start, int end) {
		if (start == end) {
			arr2[count] = string;
			count++;
		} else {
			for (int i = start; i <= end; i++) {
				string = swap(string, start, i);
				permutation(string, start+1, end);
				string = swap(string, start, i);
			}
		}
	}

	private String swap(String string, int start, int end) {
		char temp;
		char[] charArray = string.toCharArray();
		temp = charArray[start];
		charArray[start] = charArray[end];
		charArray[end] = temp;
		return String.valueOf(charArray);
	}

	public static String[] recursion() {
		RecursionMethod recursionMethod = new RecursionMethod();
		System.out.println("For RecursionMethod");
		String string = "ABC";
		int n = string.length();
		arr2=new String[n*2];
		recursionMethod.permutation(string, 0, n-1);
		for (String str : arr2) {
			System.out.print(str+" ");
		}
		System.out.println();
		return arr2;
	}
}
