package com.blz.data_structure.primenumber_anagrams_range2d;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeAnagramNumbersRange2D {
	public boolean isPrime(int num) {
		if (num == 0 || num == 1) {
			return false;
		}
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public int[] numberInArray(int value) {
		int count = 0;
		int arr[] = new int[String.valueOf(value).length()];
		while (value > 0) {
			int digit = value % 10;
			arr[count++] = digit;
			value = value / 10;
		}
		return arr;
	}

	public boolean isAnagram(Integer primeN1, Integer primeN2) {

		int firstArray[] = numberInArray((int) primeN1);
		int secondArray[] = numberInArray((int) primeN2);
		Arrays.sort(firstArray);
		Arrays.sort(secondArray);
		if (Arrays.equals(firstArray, secondArray)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		PrimeAnagramNumbersRange2D primeAnagramNumbersRange2D = new PrimeAnagramNumbersRange2D();
		List<Integer> primeList;
		int start = 0, end = 100, arraySize = 0;
		Integer[][] primeNumber = new Integer[10][];
		for (int i = 0; i < 10; i++) {
			primeList = new ArrayList<>();
			for (int j = start; j <= end; j++) {
				if (primeAnagramNumbersRange2D.isPrime(j)) {
					primeList.add(j);
					arraySize++;
				}
			}
			primeNumber[i] = (Integer[]) primeList.toArray(new Integer[arraySize]);
			System.out.println();
			start = end + 1;
			end += 100;
			arraySize = 0;
		}
		System.out.println("Prime Numbers");
		for (Integer[] prime : primeNumber) {
			for (Integer val : prime) {
				System.out.print(val + " ");				
			}
			System.out.println();
		}

		Integer[][] anagramNumber = new Integer[10][];
		List<Integer> anagramList;
		int count = 0;
		for (int i = 0; i < 10; i++) {
			anagramList = new ArrayList<>();
			for (int j = 0; j < primeNumber[i].length; j++) {
				for (int k = j; k < primeNumber[i].length-1; k++) {
					if (primeAnagramNumbersRange2D.isAnagram(primeNumber[i][j], primeNumber[i][k + 1])) {
						boolean val1 = anagramList.contains(primeNumber[i][j]);
						if(!val1) {
							anagramList.add(primeNumber[i][j]);
							arraySize++;
						}
						boolean val2 = anagramList.contains(primeNumber[i][k + 1]);
						if(!val2) {
							anagramList.add(primeNumber[i][k + 1]);
							arraySize++;
						}
					}
				}
			}
			anagramNumber[i] = anagramList.toArray(new Integer[arraySize]);
			arraySize=0	;
		}
		System.out.println("Anagram Numbers");
		for (Integer[] anagram : anagramNumber) {
			for (Integer val : anagram) {
				System.out.print(val + " ");				
			}
			System.out.println();
		}
	}
}
