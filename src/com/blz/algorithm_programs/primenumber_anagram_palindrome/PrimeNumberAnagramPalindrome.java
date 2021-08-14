package com.blz.algorithm_programs.primenumber_anagram_palindrome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrimeNumberAnagramPalindrome {

	public <T> T[] primeNumber(int number) {
		List<Integer> primeNumbersList = new ArrayList<>();
		T[] primeNList = null;
		boolean flag;
		if (number >= 2) {
			for (int i = 2; i <= number; i++) {
				flag = true;
				for (int j = 2; j <= i / 2; j++) {
					if (i % j == 0) {
						flag = false;
					}
				}
				if (flag == true) {
					System.out.print(i + " ");
					primeNumbersList.add(i);
				}
			}
			primeNList = (T[]) primeNumbersList.toArray();
			System.out.println();
			return primeNList;
		} else {
			System.out.println("It does not contain Prime Number ");
			return primeNList;
		}

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

	public <T> boolean anagramChecker(T primeNList, T primeNList2) {

		int firstArray[] = numberInArray((int) primeNList);
		int secondArray[] = numberInArray((int) primeNList2);
		Arrays.sort(firstArray);
		Arrays.sort(secondArray);
		if (Arrays.equals(firstArray, secondArray)) {
			return true;
		} else {
			return false;
		}
	}

	public <T> T[] anagram(T[] primeNList) {
		List<Integer> anagramNumbersList = new ArrayList<>();
		T[] anagramNList = null;
		for (int i = 0; i < primeNList.length; i++) {
			for (int j = i; j < primeNList.length - 1; j++) {
				if (anagramChecker(primeNList[i], primeNList[j + 1])) {
					System.out.println("Prime Number : " + (int) primeNList[i] + " Anagram : " + (int) primeNList[j + 1]);
//					anagramNumbersList.add((int) primeNList[i]);
					boolean val1 = anagramNumbersList.contains((int) primeNList[i]);
					if(!val1) {
						anagramNumbersList.add((int) primeNList[i]);
					}
					boolean val2 = anagramNumbersList.contains((int) primeNList[j+1]);
					if(!val2) {
						anagramNumbersList.add((int) primeNList[j+1]);
					}
				}
			}
		}
		anagramNList = (T[]) anagramNumbersList.toArray();
		return anagramNList;

	}

	public <T> boolean palindromeChecker(int value) {
		int rem, reverse = 0, originalVal = value;
		for (; value != 0; value /= 10) {
			rem = value % 10;
			reverse = reverse * 10 + rem;
		}
		if (originalVal == reverse) {
			return true;
		} else {
			return false;
		}

	}

	public <T> T[] palindrome(T[] anagramNList) {
		List<Integer> palindromeNumbersList = new ArrayList<>();
		for (int i = 0; i < anagramNList.length; i++) {
			if (palindromeChecker((int) anagramNList[i])) {
				palindromeNumbersList.add((int) anagramNList[i]);
				System.out.println("Palindrome Number : "+(int) anagramNList[i]);
			}
		}
		T[] palindromeNList = (T[]) palindromeNumbersList.toArray();
		return palindromeNList;

	}

	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumberAnagramPalindrome primeNumberRange = new PrimeNumberAnagramPalindrome();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to print Prime Number");
		T[] primeNList;
		primeNList = primeNumberRange.primeNumber(sc.nextInt());
		primeNList = primeNumberRange.anagram(primeNList);
		primeNList = primeNumberRange.palindrome(primeNList);
	}

}
