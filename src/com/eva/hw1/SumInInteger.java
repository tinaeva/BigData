package com.eva.hw1;

import java.util.Arrays;

public class SumInInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 34, 145, 200};
		System.out.println("Sum of total is " + sumAll(arr));
		String ss = "this is a string";
		char[] c = ss.toCharArray();
		char[] c2 = Arrays.copyOf(c, 4);
		char[] c3 = new char[4];
		System.arraycopy(c, 5, c3, 0, 3);
		String ss2 = Arrays.toString(c);
		System.out.println(c3);
		Arrays.sort(c);
		for(int i=0; i<c.length; i++) {
			System.out.println(c[i]);
		}

	}

	private static long sumAll(int[] arr) {
		// TODO Auto-generated method stub
		long sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

}
