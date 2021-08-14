package com.blz.algorithm_programs.magic_number;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val = Integer.parseInt(args[0]);
		System.out.println("Select the Value Between 0 to "+val);
		int start = 0, end = 100;
		while(start < end) {
			int mid = start + (end - start)/2;
			System.out.println("Select From Option");
			System.out.println("1.This "+mid+" is greater than imagine value");
			System.out.println("2.This "+mid+" is less than imagine value");
			System.out.println("3.This "+mid+" is your imagine value");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				end = mid - 1;
				break;
			case 2:
				start = mid + 1; 
				break;
			case 3:
				System.out.println("Your Imagine value is "+mid);
				System.out.println("Thank You Participation");
				start = end;
				break;
			default:
				System.out.println("Please Select From Above Option");
				break;
			}
		}
	}

}
