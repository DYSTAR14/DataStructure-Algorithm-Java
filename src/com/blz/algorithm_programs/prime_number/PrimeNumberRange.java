package com.blz.algorithm_programs.prime_number;

import java.util.Scanner;

public class PrimeNumberRange {

	public void primeNumber(int number) {
		boolean flag;
		if(number >= 2) {
			for (int i = 2; i <= number; i++) {
				flag = true;
				for (int j = 2; j <= i/2 ; j++) {
					if(i%j == 0) {
						flag = false;
					}
				}
				if(flag == true) {
					System.out.print(i+" ");
				}
			}
		}
		else {
			System.out.println("It does not contain Prime Number ");
		}
	}
	public static void main(String[] args) {
		PrimeNumberRange primeNumberRange = new PrimeNumberRange();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to print Prime Number");
		primeNumberRange.primeNumber(sc.nextInt());

	}

}
