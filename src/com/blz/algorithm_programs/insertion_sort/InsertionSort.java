package com.blz.algorithm_programs.insertion_sort;

public class InsertionSort {

	public void insertionSorting(int arr[]){
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] > temp ) {
					arr[j+1] = arr[j];
					j--;
			}
			arr[j+1] = temp;
		}
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		InsertionSort insertionSort = new InsertionSort();
		int arr[] = {64, 34, 25, 12, 22, 11};
		insertionSort.insertionSorting(arr);
	}

}
