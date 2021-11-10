//-------------------------------------------------------------------------
//Assignment 1
//Written By: HARMANVIR SINGH (Student ID: 40019114)
//For COMP 248 Section U- Winter 2021
//-------------------------------------------------------------------------

import java.util.Scanner;
public class LetterEncryption {

	public static void main(String[] args) {
			System.out.println("************************************************************* \n"
					+"\t Welcome to Letter Encryption Program \n" 
					+"*************************************************************" );
			// Creating a Scanner class Object.
			Scanner keyIn = new Scanner(System.in);					
			System.out.print("Enter the first word with 3 characters:  ");	
			String word_1 = keyIn.next();
			
			// Displaying message for user to to enter second word.
			System.out.print("Enter the second word with 3 characters:  ");	
			String word_2 = keyIn.next();
			keyIn.close();
			System.out.println("The length of the word "+word_1 + " is "+ word_1.length());
			System.out.println("The length of the word "+word_1 + " is "+ word_2.length());
			String mergedWord = "";
			
			/* The sequence: 3rd character of W1 + 3rd character of W2 + 1st character of W1 + 1st
				character of W2 + 2nd character of W1 + 2nd character of W2, display the new
				generated word. */
			
			mergedWord = word_1.charAt(2) +""+ word_2.charAt(2) +
						 word_1.charAt(0) +""+word_2.charAt(0) +
						 word_1.charAt(1) +""+word_2.charAt(1);
			
			// Swapping the 2nd and 6th characters of the new word.
			String temp ="";
			String secondCharacter = mergedWord.charAt(1)+"";
			String sixthCharacter = mergedWord.charAt(5)+"";
			temp = secondCharacter;
			secondCharacter = sixthCharacter;
			sixthCharacter = temp;
			
			// Swapping the 1st and 5th characters of the new word.
			temp ="";
			String firstCharacter = mergedWord.charAt(0)+"";
			String fifthCharacter = mergedWord.charAt(4)+"";
			temp = firstCharacter;
			firstCharacter = fifthCharacter;
			fifthCharacter = temp;
			
			// Displaying the new word.
			mergedWord = firstCharacter +""+ secondCharacter +
						 word_1.charAt(0) +""+word_2.charAt(0) +
						 fifthCharacter +""+sixthCharacter;
			
			System.out.println("Generating the encrypted word...");
			System.out.println("The encrypted word is : " + mergedWord+".");
			System.out.println("Thank you for using Letter Encryption Program!");
			
	}
}
