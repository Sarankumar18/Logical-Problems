package com.java.DSA;

public class BubbleSort {
	private int count =0;
	private int[] bubbleSort(int a[], int len) {
		//arr = [3,6,1,0,3,7];
		int temp ;
		boolean sorted = true;
		for(int i = 0; i < len-1; i++) {
			//if ith element is less than i+1 th element , then not replacing
			if(a[i] > a[i+1]) {
				temp = a[i+1];
				a[i+1] = a[i];
				a[i] = temp;
				sorted = false;
				count++;
			}
			if(sorted == false) bubbleSort(a,len);
		}
		return a;
	}

	public static void main(String[] args) {
		int arr[] = {3,7,8,4,10};
		BubbleSort bs = new BubbleSort();
		bs.bubbleSort(arr,arr.length);
		//System.out.println();
		for(int i : arr) {
			System.out.print(i+",");
		}
		System.out.println("Count: "+ bs.count);
	}

}
