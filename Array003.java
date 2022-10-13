package com.arrays.demo;

import java.util.Scanner;

public class Array003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String names[] = new String[5];
		
		System.out.println("Enter " + names.length + " names: ");
		for(int i=0; i<names.length; i++) {
			names[i] = sc.nextLine();  
		}
		
		System.out.println("Enter the name you want to find:");
		String name = sc.nextLine();
		
		boolean isFound = false;
		
		for(int i=0; i<names.length; i++) {
			if(names[i].equals(name)) {
				System.out.println("The " + name + " is found in the list.");
				isFound = true;
				break;
			}
		}
		
		if(!isFound)
			System.out.println("The " + name + " is not found in the list.");
		
		sc.close();

	}

}
