/* This program finds the largest number in an array of integers. It iterates through the array, compares each element to the current largest number, and updates the largest number accordingly. Finally, it prints the largest number found in the array. */
public class LargestNumber{
	public static void main(String[] args){
		
		int[] numbers = {5,7,1,14,6,4};
		int n = numbers[0];
		for(int i = 1; i<numbers.length; i++){
			if(n<= numbers[i]){
				n = numbers[i];
			
			}
		}
		System.out.println(n);
	}
}