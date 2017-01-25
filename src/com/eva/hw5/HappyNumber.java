package com.eva.hw5;

import java.util.HashSet;
import java.util.Set;

/*
 * Write an algorithm to determine if a number is "happy".
 * A happy number is a number defined by the following process: 
 * Starting with any positive integer, 
 * replace the number by the sum of the squares of its digits, 
 * and repeat the process until the number equals 1 (where it will stay), 
 * or it loops endlessly in a cycle which does not include 1. 
 * Those numbers for which this process ends in 1 are happy numbers.
 */

public class HappyNumber {
	public boolean isHappy(int n) {
		/* 
		 * record every occurred number in a HashSet.
		 * Once it cannot be added into the HashSet, return false.
		 * return true when the sum is 1;
		 */
		int sum;
		
		Set<Integer> check = new HashSet<>();
		
		while(check.add(n)) {
			sum = 0;
			while(n>0) {
				sum += (n%10) * (n%10);
				n /= 10;
			}
			if(sum == 1) { 
				return true;
			} else {
				n = sum;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		int n1 = 13;
		int n2 = 3;
		HappyNumber happy = new HappyNumber();
		System.out.println(happy.isHappy(n1));
		System.out.println(happy.isHappy(n2));
		
	}
}
