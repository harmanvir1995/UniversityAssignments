import java.util.Scanner;

//-------------------------------------------------------------------------
// Assignment 1
// Written By: HARMANVIR SINGH (Student ID: 40019114)
// For COMP 248 Section U- Winter 2021
//-------------------------------------------------------------------------

public class DigitEncryption {

	public static void main(String[] args) {
		System.out.println("************************************************************* \n"
				+"\t Welcome to Password Encryption Program \n" 
				+"*************************************************************" );
		// Creating a Scanner class Object.
		Scanner keyIn = new Scanner(System.in);
		
		// Displaying message for user to to enter password.
		System.out.print("Please enter a 6-digits number : ");	
		
		// Storing the password entered by user in the variable.
		int enteredPassword = keyIn.nextInt();					
		keyIn.close();
		
		System.out.println("Generating the encrypted number...");
		final int TEN = 10;
		int sixthDigit = enteredPassword % TEN;
		enteredPassword = enteredPassword/TEN;
		int fifthDigit = enteredPassword % TEN;
		enteredPassword = enteredPassword/TEN;
		int fourthDigit = enteredPassword % TEN;
		enteredPassword = enteredPassword/TEN;
		int thirdDigit = enteredPassword %10;
		enteredPassword = enteredPassword/TEN;
		int secondDigit = enteredPassword % TEN;
		enteredPassword = enteredPassword/TEN;
		int firstDigit = enteredPassword % TEN;
		enteredPassword = enteredPassword/TEN;

		// Swapping 1st Digit with the 6th Digit
		int swap; 												
		swap = firstDigit;
		firstDigit = sixthDigit;
		sixthDigit = swap;

		// Replacing 2nd digit with the remainder of second digit divided by 2
		secondDigit = secondDigit%2;

		// Minus 1 to the third digit of your input.
		thirdDigit = thirdDigit-1;

		// Replacing fourth digit with the remainder of the third digit divided by 3
		fourthDigit = thirdDigit%3;

		// Swapping 4th Digit with the 5th Digit
		swap = fourthDigit;
		fourthDigit = fifthDigit;
		fifthDigit = swap;

		// Displaying the new word.
		String encryptedNumber = firstDigit +""+ secondDigit +""+ thirdDigit +""+ fourthDigit +""+ fifthDigit +""+ sixthDigit;
		System.out.println("The encrypted 6-digits number is : " + encryptedNumber);
		System.out.println("Thank you for using Password Encryption Program!");

	}
}
