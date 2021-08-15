package com.blz.data_structure.primenumber_range2d;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberRange2D {
	public boolean isPrime(int num) {
		if( num == 0 || num == 1) {
			return false;
		}
		for (int i = 2; i <= num/2 ; i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		PrimeNumberRange2D primeNumberRange2D = new PrimeNumberRange2D();
		List<Integer> primeList;
		int start = 0, end = 100, arraySize=0;
		Integer[][] primeNumber = new Integer[10][];
		for (int i = 0; i < 10; i++) {
			primeList = new ArrayList<>();
			for (int j = start; j <= end; j++) {
				if(primeNumberRange2D.isPrime(j)) {
					primeList.add(j);
					arraySize++;
				}
			}
			primeNumber[i] = (Integer[]) primeList.toArray( new Integer[arraySize]);
			System.out.println(primeNumber[i].length);
			for(Integer prime : primeNumber[i] ) {
				System.out.print(prime+" ");
			}
			System.out.println();
			start = end + 1;
			end += 100;
			arraySize = 0;
		}
		
	}

}
