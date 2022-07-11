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
		
		arr = new int[size];
		
		for(int i=0; i<size; ++i) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		targets = sc.nextInt();
		
		TransactionService obj = new TransactionService();
		
		obj.checkTarget(arr, targets);
		
		sc.close();

	}

}
