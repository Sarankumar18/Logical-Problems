package com.java.DSA;

public class SelectioSort {

	public static void main(String[] args) {
		int a[] = {5,4,1,7,2,9,0,-3};
		SelectioSort s = new SelectioSort();
		s.selectionSort(a, a.length);
		for(int ele : a) {
		System.out.println(ele);
		}
	}
	
	private int[] selectionSort(int a[], int n) {
		int min;
		for(int i =  0; i < n-1; i++) {
			min = i;
			for(int j = i+1; j < n ; j++) {
				if(a[j] < a[min]) {
					min = j;
				}
			}
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
			
			
		}
		
		return a;
	}

}
