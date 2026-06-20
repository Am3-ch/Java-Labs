/* This program sorts an array of random integers in ascending order. It generates an array of 10 random integers between 0 and 19, prints the unsorted list, sorts the array using a simple bubble sort algorithm, and then prints the sorted list. */
public class Sort{
	public static void main(String[] args){
		int[] myList = new int[10];
		int swap = 0;
		for(int i = 0; i < myList.length; i++)
			myList[i] = (int)(Math.random() * 20);

		System.out.print("The unsorted list is " );
		for(int value: myList)
			System.out.print(value + " ");
		
		
		for(int i = 0; i < myList.length; i++){
			for(int j = i + 1; j < myList.length; j++){
				if( myList[i] > myList[j]){
					swap = myList[j];
					myList[j] = myList[i];
					myList[i] = swap;
				}
			}			
		}
		System.out.print("\nThe sorted list is " );
		for(int value: myList)
			System.out.print(value + " ");				
	}
}