
/* This program implements a binary search algorithm. The user is prompted to enter a key and the size of an array, followed by the elements of the array. The program then searches for the key in the array using binary search and outputs the index of the key if found, or the index where it should be if not found. */
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter key: ");
		int key = input.nextInt();
		System.out.print("Enter size of array: ");
		int size = input.nextInt();
		int high = size - 1;
		int low = 0;
		int mid = 0;

		System.out.printf("Enter %d numbers: ", size);
		int[] myList = new int[size];
		for (int i = 0; i < myList.length; i++) {
			myList[i] = input.nextInt();
		}
		for (int i = 0; i < myList.length; i++) {
			mid = (high + low) / 2;
			if (key == myList[mid]) {
				System.out.println("The key is at index " + mid);
				break;
			} else if (key < myList[mid])
				high = mid;
			else
				low = mid;
		}
		if (key != myList[mid])
			System.out.println("the key is supposed to be at this index " + (mid + 1));
	}
}