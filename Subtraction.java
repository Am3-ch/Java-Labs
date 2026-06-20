/* This program generates two random integers, prompts the user to subtract the smaller number from the larger one, and checks if the user's answer is correct. It uses the Math.random() method to generate random numbers, the Scanner class to read user input, and a simple conditional statement to compare the user's answer with the correct result. Finally, it provides feedback to the user based on whether their answer is correct or not. */
import java.util.Scanner;
import java.lang.Math;
public class Subtraction{
	public static void main(String[] args){
		int num1 = (int)(Math.random()*6);
		int num2 = (int)(5 + Math.random()*5);
		Scanner input = new Scanner(System.in);
		System.out.print("What is " + num2 + " - " + num1 + "?\nWrite your answer here: ");
		int answer = input.nextInt();
		boolean okay= answer == num2 - num1;
		if(okay)
			System.out.println("correct");
		else
			System.out.println("Ubukopo uleke!!!");
 	}
}