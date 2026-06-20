/* This program searches for a specific number in an array of integers. It prompts the user to enter a number, then iterates through the array to check if the number is present. If the number is found, it prints a message indicating that the value has been found; otherwise, it prints a message indicating that the value has not been found. */
public class Search2 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Enter a number to search for in the array: ");
		int a = input.nextInt();
		int b = 0;
		int[] myArray = { 5, 7, 5, 12, 3, 2 };
		for (int i = 0; i < myArray.length; i++) {
			if (a == myArray[i]) {
				System.out.println("value has been found");
				b += 1;
			} else {
				if ((i == myArray.length - 1) && (b == 0))
					System.out.println("value has not been found");
			}
		}
	}
}