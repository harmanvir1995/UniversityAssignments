import java.util.Scanner;

//-------------------------------------------------------------------------
//Assignment 2
//Written By: HARMANVIR SINGH (Student ID: 40019114)
//For COMP 248 Section U- Winter 2021
//-------------------------------------------------------------------------

//This program help the customer order food online and calculate the total price.

public class OnlineOrderProgram {
	public static void main(String[] args) {
		//Header
		System.out.println("************************************************************* \n"
				+"\t Welcome to Online Order Program \n" 
				+"*************************************************************" );
		Scanner keyIn = new Scanner(System.in);
		
		//Displaying Menu
		System.out.println("\t 1. Hamburger \n" 
				+ "\t 2. Pizza \n"
				+ "\t 3. Noodle \n"
				+ "\t 4. Salad \n"
				+ "\t 5. Sandwich \n"
				+ "\t 6. Exit \n"
				+"*************************************************************\n");
		
		//Declaring variable and initializing some of them, according to their role in the program.
		double price = 0.0, tips = 0.0;
		int comboNumber;
		String choice = "", wantMeat, meatChoice, orderAgain = "";
		
		//Using do while loop to ask input from user if he is interested in buying more stuff.
		do {
			System.out.print("Please enter your choice (1-6): ");
			comboNumber = keyIn.nextInt(); //Store the value for the item selected.
			System.out.println();
			keyIn.nextLine();
			
			//Selecting an item from the menu.
			switch(comboNumber) {
			case 1 :
				choice = "Hamburgur.";
				break;
			case 2 :
				choice = "Pizza.";
				break;
			case 3 :
				choice = "Noodle.";
				break;
			case 4 :
				choice = "Salad.";
				break;
			case 5 :
				choice = "Sandwich.";
				break;
			case 6 :
				choice = "Finish the order!";
				break;
			default : 
				System.out.println("This is wrong input please try again!");
				orderAgain = "Yes";
			}
			
			//Using this if statement to follow up for the menu option he selected for 1 to 5.
			if(comboNumber > 0 && comboNumber < 6) {
				System.out.println("Your choice is: " + choice );
				price = price + 7.5;
				System.out.print("Would you like to have some meat on your Sandwich? ");
				wantMeat = keyIn.nextLine();
				System.out.println();
				
				//Using this if statement if he wants meat.
				if(wantMeat.equalsIgnoreCase("Yes")) {
					System.out.print("Beef or Pork ");
					meatChoice = keyIn.nextLine();
					System.out.println();
					if(meatChoice.equalsIgnoreCase("beef")) {
						price = price + 18.0;
					}
					else if(meatChoice.equalsIgnoreCase("pork")) {
						price = price + 10.0;
					}	
				}
				
				//Prompt user if he wants to order more food.
				System.out.print("Would you like to have more food? ");
				orderAgain = keyIn.nextLine();
				System.out.println();
			}
			if(comboNumber == 6) {
				orderAgain = "No";
				System.out.println("Your choice is: " + choice );
			}	
		}
		while(orderAgain.equalsIgnoreCase("Yes"));
		
		//Verifying if the price is less than 50$ then customer has to pay $5 extra.
		if(price < 50 && price >0) {
			System.out.println("The total price is less than $50. You need to pay the delivery fee $5.\n");
			price = price + 5;
		}
		else {
			System.out.println();
			System.out.println("No need to pay for delivery fee.\n");
		}
		
		//If the user has selected an item from 1 to 5 only then he will add tips. 
		if(comboNumber > 0 && comboNumber < 6) {
			System.out.print("Would you like to pay some tips? Please enter the amount: ");
			tips = keyIn.nextDouble();
			System.out.println();
			price = price + tips;
		}
		
		//Displaying the total price and closing message.
		System.out.println("The total price is $" + price +".\n");
		System.out.println("Thank you for using Online Order Program!");
		keyIn.close();
	}
}
