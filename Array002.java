package com.arrays.demo;

import java.util.Scanner;

public class Array002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nums[] = new int[5];
		
		System.out.println("Enter " + nums.length + " numbers: ");
		
		for(int i=0; i<nums.length; i++) 
			nums[i] = sc.nextInt();
		
		System.out.println("Please enter a number to find: ");
		int f = sc.nextInt();
		
		boolean isFound = false;
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i] == f) {
				System.out.println("Number is found.");
				isFound = true;
				break;
				
			}
		}
		
		
		if(isFound == false) {
			System.out.println("Number is not found");
		}
		
		
		sc.close();

	}

}
