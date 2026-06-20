/* 	This program calculates the average of a list of numbers and counts how many numbers are greater than the average. */
public class Average {
	public static void main(String[] args) {
		int[] myList = new int[] { 1, 2, 7, 9, 8, 4, 12, 3, 20, 5 };
		int sum = 0;
		int count = 0;

		for (int value : myList) {
			sum += value;
		}
		int avg = sum / myList.length;
		for (int value : myList) {
			if (value > avg) {
				count += 1;
			}
		}
		System.out.println(
				"The average is " + avg + "\nThe number of digits that are greater than the average is: " + count);
	}
}