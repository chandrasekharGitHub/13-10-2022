/*
 * Program to find sum and average of some numbers 
 */

package com.arrays.demo;

import java.util.Scanner;

public class Array001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nums[] = new int[5];
		
		System.out.println("Enter " + nums.length + " numbers: ");
		
		for(int i=0; i<nums.length; i++) 
			nums[i] = sc.nextInt();
				
		System.out.println("The values in the array are: ");
		for(int i=0; i<nums.length; i++)
			System.out.println(nums[i]);
		
		int total = 0;
		for(int i=0; i<nums.length; i++)
			//total += nums[i];
			total = total + nums[i];
		
		double average = (double)total/nums.length;
		
		System.out.println("Sum = " + total);
		System.out.println("Average = " + average);
		
			
		sc.close();

	}

}
