package com.ashutosh.notecount.main;

import java.util.Scanner;

public class NoteCountDriver {

	public static void main(String[] args) {
		
		MergeSort msObj = new MergeSort();
		NotesCount ncObj = new NotesCount();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of currency denominations");
		int size = sc.nextInt();
		
		int[] notes = new int[size];
		
		System.out.println("Enter the currency denominations value");
		
		for(int i=0; i<size; ++i) {
			notes[i] = sc.nextInt();
		}
		
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		
		

	}

}
