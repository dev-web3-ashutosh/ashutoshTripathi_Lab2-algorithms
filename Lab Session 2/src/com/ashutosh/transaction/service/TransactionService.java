package com.ashutosh.transaction.service;

import java.util.Scanner;

public class TransactionService {
	
	Scanner sc = new Scanner(System.in);
	
	public void checkTarget(int[] array, int noOfTargets) {
		
		for(int x=0; x<noOfTargets; ++x) {
			int value, sum=0;
			boolean achieved = false; //to know if target has been achieved
			
			System.out.println("Enter the value of target");
			value = sc.nextInt(); //input target to be searched
			
			for(int i=0; i<array.length; ++i) {
				sum += array[i];
				if(sum >= value) {
					System.out.println("Target achieved after " + (i+1) + " transactions");
					achieved = true;
					break;
				}
			}
			if(achieved == false) {
				System.out.println("Given target is not achieved");
			}
		}
		
	}

}
