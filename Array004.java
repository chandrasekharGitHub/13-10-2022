/*
 * 
 * Write a program to sum only positive number from an array
 * 
 */
package com.arrays.demo;

public class Array004 {

	public static void main(String[] args) {
		// 1, 5, 7, -3, 8, -5, 9, -1, 2, -6 = 32
		
		int nums[] = {1, 5, 7, -3, 8, -5, 9, -1, 2, -6}; // you can use scanner to accept values
		
		int sum = 0;
		
		// use continue to achieve it
		for(int i=0; i<nums.length; i++) {
			if(nums[i] < 0)
				continue;
			
			sum = sum + nums[i];
		}
		
		System.out.println("Sum = " + sum);

	}

}
