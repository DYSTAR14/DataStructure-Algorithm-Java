package com.blz.algorithm_programs.anagram_detection;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {

	public boolean anagramChecker(String s1, String s2) {
		char string1[] = s1.toLowerCase().toCharArray();
		char string2[] = s2.toLowerCase().toCharArray();
		Arrays.sort(string1);
		Arrays.sort(string2);
		if (Arrays.equals(string1, string2)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		AnagramDetection anagramDetection = new AnagramDetection();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String");
		String string1 = sc.next();
		System.out.println("Enter Second String");
		String string2 = sc.next();
		if (anagramDetection.anagramChecker(string1, string2)) {
			System.out.println("Two Strings are Anagram");
		} else {
			System.out.println("Two Strings are not Anagram");
		}
	}
}
