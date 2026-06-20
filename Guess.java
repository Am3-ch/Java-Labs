/* This program implements a simple number guessing game. The computer generates a random number between 0 and 100, and the user tries to guess it. The program provides feedback on whether the user's guess is too low, too high, or correct. */
import java.util.Scanner;
import java.lang.Math;
public class Guess{
	public static void main(String[] args){
		int number = (int)(Math.random()*100);
		Scanner input = new Scanner(System.in);
		System.out.print("Guess number between 0 and 100: ");
		while (number > 0 && number < 100) {
			int enteredValue = input.nextInt(); 
			if(number == enteredValue){
				System.out.printf("yes the number %d is correct, you win K%f", enteredValue, 1000.05);
				break;
			}
			else if(enteredValue < number){
				System.out.printf("the number %d you entered is less than the actual number.\ntry again!!", enteredValue);
			}
			else {
				System.out.printf("the number %d is greater than the actual value.\nPlease try again ", enteredValue);
			}
		}
	}
}
			