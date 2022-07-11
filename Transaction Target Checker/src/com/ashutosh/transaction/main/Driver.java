package com.ashutosh.transaction.main;

import java.util.Scanner;

import com.ashutosh.transaction.service.TransactionService;

public class Driver {

	public static void main(String[] args) {
		
		int[] arr;
		int size, targets;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of transaction array");
		size = sc.nextInt();
		
		arr = new int[size]; //create new array of size input by user
		
		//input array values
		System.out.println("Enter the values of array");
		for(int i=0; i<size; ++i) {
			arr[i] = sc.nextInt();
		}
		
		//input number of targets to be searched
		System.out.println("Enter the total no of targets that needs to be achieved");
		targets = sc.nextInt();
		
		//create object of TransactionService class
		TransactionService obj = new TransactionService();
		
		//invoke checktarget method
		obj.checkTarget(arr, targets);
		
		//close scanner
		sc.close();

	}

}
