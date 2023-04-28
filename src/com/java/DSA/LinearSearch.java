package com.java.DSA;

public class LinearSearch {
	private static int search() {
		int [] arr= {0,3,4,2,1,4,4};
		int n = arr.length;
		int target = 20;
		if(arr.length == 0) return -1;
		for(int i = 0 ; i< n ; i ++) {
			int ele = arr[i];
			if(ele == target)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		System.out.println(LinearSearch.search());
	}

}
