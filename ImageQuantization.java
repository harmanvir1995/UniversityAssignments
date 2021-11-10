
//-------------------------------------------------------------------------
//Assignment 3
//Written By: HARMANVIR SINGH (Student ID: 40019114)
//For COMP 248 Section U- Winter 2021
//-------------------------------------------------------------------------


/** This program perform some basic compression on an image. Assuming that we 
 * are operating only on a single row of the image, and that pixel colors 
 * are represented as simple numbers in the array.**/

import java.util.Scanner;

public class ImageQuantization {

	public static void main(String[] args) {
		//Declaration and initialization of an array to store quantized values.
		int[] quantizedValuesArray = new int[10];
		//Scanner object creation.
		Scanner input = new Scanner(System.in);
		System.out.println("Please input pixel values: ");
		
		int value;
		int quantizedValue = 0;
		int counter = 0;
		
		//This loops helps to store values in the array till 9th index.
		while(counter<10) {
			System.out.print("pixel " + (counter+1) + "  :  ");
			value = input.nextInt();
			//quantizedValue variable helps in achieving the desired compressed value. 
			//Condition for end points.
			if(value%20 == 0) {
				quantizedValue = (2*(value/20)-1)*10;
			} 
			else {
				quantizedValue = (2*(value/20)+1)*10;
			}
			//Condition if quantized value moves out of range 0-180.
			if(quantizedValue>180) {
				quantizedValue = 190;
			}
			else if(quantizedValue < 0) {
				quantizedValue = 10;
			}
			quantizedValuesArray[counter] = quantizedValue;
			counter++;
		}		
		
		//This loops displays the array.
		for(int i=0; i<quantizedValuesArray.length; i++) {
			System.out.print(quantizedValuesArray[i]+"  ");
		}
		
		input.close();
	}
}
