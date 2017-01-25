package com.eva.hw5;

/* Given an array nums, write a function to move all 0's to the end of it 
 * while maintaining the relative order of the non-zero elements. 
 * For example, given nums = [0, 1, 0, 3, 12], 
 * after calling your function, nums should be [1, 3, 12, 0, 0].
 * Note: You must do this in-place without making a copy of the array.
 * Note: Minimize the total number of operations.
*/
public class MoveZerosToEnd {

	public int[] moveZeros(int[] nums) {
		// TODO Auto-generated method stub
		int index = 0;
		for(int num : nums) {
			if(num != 0) {
				nums[index++] = num;
			}
		}
		
		while(index < nums.length) {
			nums[index++] = 0;
		}
		return nums;
	}
	
	public static void main(String[] args) {
		MoveZerosToEnd obj = new MoveZerosToEnd();
		int[] nums = {0,1,0,3,12};
		for(int i: nums) {
			System.out.print(i);
		}
		System.out.println("");
		for(int j: obj.moveZeros(nums)){
			System.out.print(j);
		}

	}

}
