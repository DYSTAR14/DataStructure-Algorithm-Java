package com.blz.algorithm_programs.string_permutations;

public class IterativeMethod {
	static String arr1[];
	public void permutation(String string,int n ) {
		char[] a = string.toCharArray(); 
		int[] p = new int[n];
		int i = 1;
		int count=0;
		arr1[count] = string;
		count++;
		while (i < n) {
			if(p[i]<i) {
				int j = ((i%2) == 0) ? 0 : p[i];
				arr1[count] = swap(a,i,j);
				count++;
				p[i]++;
				i=1;
			}
			else {
				p[i]=0;
				i++;
			}
		}
	}

	private String swap(char a[], int start, int end) {
		char temp = a[start];
		a[start] = a[end];
		a[end] = temp;
		return String.valueOf(a);
	}

	public static String[] iterative() {
		IterativeMethod iterativeMethod = new IterativeMethod();
		System.out.println("For IterativeMethod");
		String string = "ABC";
		int n = string.length();
		arr1=new String[n*2];
		iterativeMethod.permutation(string,n);
		for (String str : arr1) {
			System.out.print(str+" ");
		}
		System.out.println();
		return arr1;
		
	}

}
