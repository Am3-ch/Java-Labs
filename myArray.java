/* This program counts the occurrences of a specific number in an array of integers. It iterates through the array, compares each element to the target number, and increments a counter accordingly. Finally, it prints the count of occurrences. */
public class myArray{
 	public static void main(String[] args){
		int [] myArray = {1,2,3,4,2,2,5,3};
		int k = 2;
		int c = 0;
		for (int i = 0; i< myArray.length; i++){
			if (k == myArray[i]){
				c += 1;
			}
       		}
		System.out.println(c);
	}					
}