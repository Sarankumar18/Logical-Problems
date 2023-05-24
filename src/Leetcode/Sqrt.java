package Leetcode;

/*
 
Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

*/


public class Sqrt {

	public static void main(String[] args) {
		
		int num = 16;
		int r = num;
		while(r*r > num)
			r = (r + num/r) /2;
		System.out.println("Square root of " + num + ": " + r);

	}

}
