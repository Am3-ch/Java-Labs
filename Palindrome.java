
import java.util.Scanner;

public class Palindrome{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String s1 = input.next();
		int count = 0;

		for(int i = 0;i < s1.length()/2; i++){
			if(s1.charAt(i) == s1.charAt(s1.length()-1-i))
				count += 1;
		}
		if(count == s1.length()/2)
			System.out.print(s1 + " is a palindrome.");
		else
			System.out.print(s1 + " is not a palindrome.");
	}
}