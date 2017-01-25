package com.eva.hw5;

import java.util.HashSet;

/*
 * Given an array of integers, find if the array contains any duplicates. 
 * Your function should return true if any value appears at least twice in the array, 
 * and it should return false if every element is distinct.
 */

public class DupArray {
	public boolean findDuplicates(int[] nums) {
		if(nums.length == 0 || nums == null) 
			return false;
		HashSet<Integer> set = new HashSet<>();
		for(int num : nums) {
			if(!set.add(num)) return true;
		}
		return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DupArray da = new DupArray();
		int[] arr1 = new int[]{1,4,124,53,2,12,1};
		int[] arr2 = {100,200,300};
		System.out.println(da.findDuplicates(arr1)); // should return true
		System.out.println(da.findDuplicates(arr2)); // should return false
	}

}
