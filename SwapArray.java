/* This program creates a new array that contains the elements of an existing array in reverse order. It initializes an array with specific values, then iterates through the original array from the last element to the first, copying each element into the new array. Finally, it prints the elements of the new array to the console. */
public class SwapArray{
	public static void main(String[] args){
		int[] myList = {1,2,3,4,5,6,7,8,9,10};
		int[] myList2 = new int[myList.length];
		for(int i = myList.length-1; i >= 0; i--){
			myList2[myList.length-1-i] = myList[i];
			System.out.print(myList2[myList.length-1-i] + "  ");
		}
		
	}
}