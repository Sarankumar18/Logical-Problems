package com.java.DSA;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int a[] = {5,4,3,2,1};
		sort(a,a.length-1,0);
		System.out.println(Arrays.toString(a));
	}
	private static void sort(int a[], int hi, int low ) {
		
		//If no element in the array 
		if(hi <= low) return ;
		int start = low;
		int end = hi;
		int m = start + (end-start) /2;
		int pivot = a[m];
		
		while(start <= end) {
			while(a[start] < pivot) {
				start++;
			}
			while(a[end] > pivot) {
				end--;
			}
			if(start <= end) {
				int temp = a[end];
				a[end] = a[start];
				a[start] = temp;
				start++;
				end--;
			}
		}
		//if my pivot at correct index. then please sort my two halves
		sort(a, low, end );
		sort(a, start, hi);
		
	}

}
