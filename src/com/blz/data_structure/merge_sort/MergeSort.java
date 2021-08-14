package com.blz.data_structure.merge_sort;

public class MergeSort {

	void merge(int arr[], int l, int m, int r) {
		int l1 = m - l + 1;
		int r1 = r - m;

		int L[] = new int[l1];
		int R[] = new int[r1];

		for (int i = 0; i < l1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < r1; ++j)
			R[j] = arr[m + 1 + j];

		int i = 0, j = 0;

		int k = l;
		while (i < l1 && j < r1) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < l1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < r1) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	void sort(int arr[], int l, int r) {
		if (l < r) {
			int m = l + (r - l) / 2;

			sort(arr, l, m);
			sort(arr, m + 1, r);

			merge(arr, l, m, r);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 12, 11, 13, 5, 6, 7 };

		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; ++i)
			System.out.print(arr[i] + " ");
	}

}
