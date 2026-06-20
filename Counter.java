/**
 * This program counts the occurrences of a specific integer in an array.
 * It initializes an array and a target integer, then iterates through the array
 * to count how many times the target appears.
 */
public class Counter {
	public static void main(String[] args) {
		int[] myArray = { 1, 2, 4, 2, 5 };
		int k = 2;
		int c = 0;
		for (int i = 0; i < myArray.length; i++) {
			if (k == myArray[i]) {
				c += 1;
			}
		}
		System.out.print(c);
	}
}