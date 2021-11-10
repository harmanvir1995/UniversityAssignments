import java.util.Scanner;

//-------------------------------------------------------------------------
//Assignment 2
//Written By: HARMANVIR SINGH (Student ID: 40019114)
//For COMP 248 Section U- Winter 2021
//-------------------------------------------------------------------------

//This program estimates the letter grade Based on Concordia undergraduate grading system.

public class GradingSystemProgram {
	public static void main(String[] args) {
		//Header
		System.out.println("************************************************************* \n"
				+"\t Welcome to Grading System Program \n" 
				+"*************************************************************\n" );
		
		//Declaring variable  and initializing some of them, according to their role in the program.
		Scanner keyIn = new Scanner(System.in);
		String nameEntered, fullName, lastName, firstName;
		int commaPlacedAt ;
		String id = "";
		String grade = "";
		String outputMessage = "";
		String exit = "";
		
		//do while loop used until user wish to exit.
		do {
			// Prompt user to enter name, id and score.
			System.out.print("Please enter your name (Lastname, Firstname seperated by comma): ");
			
			//The following algorithm is used to store the input entered by the user and then splitting 
			//it into last name and first name then assembling them as full name.  
			nameEntered = keyIn.nextLine();
			System.out.println();
			commaPlacedAt = nameEntered.indexOf(",");
			lastName = nameEntered.substring(0, commaPlacedAt).trim();
			firstName = nameEntered.substring(commaPlacedAt+1, nameEntered.length()).trim();
			fullName = firstName + " " + lastName;
			
			//This do while is repeated until user enter the correct 7 digits ID.
			do {
				System.out.print("Please enter your ID without any spaces (7 digits): ");
				id = keyIn.next();
				System.out.println();
			}
			while(!(id.length() == 7));
			
			//Prompt user to enter his score in the range of 0-100.
			System.out.print("Please enter your score (0-100): ");
			double score = keyIn.nextDouble();
			System.out.println();
			
			//This do while is repeated until user enter a number which lies between 0-100.
			do {
				if(score < 0.0 || score > 100.0) {
					System.out.print("Please enter your score (0-100): ");
					score = keyIn.nextDouble();
					System.out.println();
				}
			}
			while((score < 0.0 || score > 100.0));
			
			//Displaying Name with score.
			System.out.println(fullName + " got "+ score+".");
			System.out.println();
			
			//The following if else-if statement is used to determine the Grade.
			if(score >= 80) {
				grade = "A";
				outputMessage = "Congratulations!";
			}
			else if(score >=70) {
				grade = "B";
				outputMessage = "You are so close to A!";
			}
			else if(score >= 60) {
				grade = "C";
				outputMessage = "You can do better by more practice!";
			}
			else {
				grade = "FNS";
				outputMessage = "Please work harder to pass the course!";
			}
			
			//Displaying the grade.
			System.out.println("Based on the grading system, " + firstName 
					+ " (" + id + ")" + " will probably get " 
					+ grade + "! " + outputMessage);
			System.out.println();
			
			//Prompt user if he wants to exit the program.
			System.out.print("Exit the program?(enter Yes to exit): ");
			exit = keyIn.next();
			keyIn.nextLine();
			System.out.println();
		}
		while(exit.equals("No"));
		
		//Display closing message and terminate.
		System.out.println("Thank you for using Grading System Program!");
		keyIn.close();
	}
}
