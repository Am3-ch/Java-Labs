
// this program counts the occurences of eac letter in an array of characters
import java.util.Scanner;

public class Appearance {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String s1 = input.next();
		char[] s2 = s1.toCharArray();

		for (char value : s2) {
			check(value, s2);
		}
	}

	static void check(char value, char[] s2) {
		int count = 0;
		for (char e : s2) {
			if (value == e) {
				count += 1;
			}
		}
		System.out.printf("The letter %c appears %d times in the entered word\n", value, count);
	}
}
