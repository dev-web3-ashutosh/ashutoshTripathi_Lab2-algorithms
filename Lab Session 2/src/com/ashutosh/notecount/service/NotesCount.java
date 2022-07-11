package com.ashutosh.notecount.service;

public class NotesCount {
	
	public void noteCounter(int[] notes, int amount) {
		
		int[] notesCounter = new int[notes.length]; //to keep track of number of notes of each denomination
		
		try {
			for(int i=0; i<notes.length; ++i) {
				if(amount >= notes[i]) {
					notesCounter[i] = amount/notes[i];
					int remainder = amount % notes[i];
					amount = amount - remainder;
				}
			}
			if(amount>0) {
				System.out.println("exact amount cannot be given with the highest denomination");
			}
			else {
				System.out.println("Your payment approach in order to give min no of notes will be");
				for(int i=0; i<notes.length; ++i) {
					if(notesCounter[i] != 0) {
						System.out.println(notes[i] + ":" + notesCounter[i]);
					}
				}
			}
		} catch (ArithmeticException e) {
			System.out.println(e + " notes of denomination 0 is invalid");
		}
		
	}

}
