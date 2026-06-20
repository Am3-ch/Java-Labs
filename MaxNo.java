/* This program finds the maximum number in an array of integers. It prompts the user to enter a specified number of integers, stores them in an array, and then iterates through the array to find and display the maximum value. */
import java.util.Scanner;
public class MaxNo {
	public static void main(String[] args){
		int[] myArray= new int[7];
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter %2d numbers \n", myArray.length);
		for(int i = 0; i < myArray.length; i++){
			myArray[i] = input.nextInt(); 	
		}
		int max = myArray[0];
		for(int value: myArray)
			System.out.print(value + " ");
		for(int i = 1; i < myArray.length-1; i++){
			
				if ( max <= myArray[i] )
					max = myArray[i];	
				
		}
		System.out.print("\n the maximum number is " + max);
	}
}