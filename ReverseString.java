/* This program takes a string input from the user and reverses it. It uses the StringBuilder class to create a mutable sequence of characters, appends the user input to it, and then calls the reverse() method to reverse the string. Finally, it prints the reversed string to the console. */
import java.util.Scanner;
import java.lang.StringBuilder;

public class ReverseString{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter string ");

		StringBuilder s = new StringBuilder();
		s.append(input.next());
		
		s.reverse();
		System.out.println(s);
	}
}