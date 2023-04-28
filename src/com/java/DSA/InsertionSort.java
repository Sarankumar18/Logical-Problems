package com.java.DSA;

public class InsertionSort {
	private int[] insertionSort(int[] a, int len) {
		int key,j;
		//to run through array from first element to last elemets
		for(int i = 1 ; i < len ; i++) {
			 key = a[i];
			 j = i-1;
			//To run thorugh sorted sublist creating inner loops
			while( j >= 0 && a[j] > key ) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = key;
		}
		return a;
	}
	public static void main(String[] args) {
		int arr[] = {4,1,9,0,2};
;		InsertionSort is = new InsertionSort();
		is.insertionSort(arr, arr.length);
		for(int i : arr) {
			System.out.println(i);
		}
	}

}
