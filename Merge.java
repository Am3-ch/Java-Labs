
/* This program merges two sorted arrays into one sorted array. It creates a new array with a size equal to the sum of the sizes of the two input arrays, copies the elements from both arrays into the new array, and then sorts the new array. Finally, it prints the elements of all three arrays. */
public class Merge{
	static public void main(String[] args){
		int[] a ={1,12,3,16,5};
		int[] b ={6,7,8,9,10,11};
		int[] c = new int[b.length + a.length];
		
		System.arraycopy(a,0,c,0,a.length);
		System.arraycopy(b,0,c,a.length, b.length);
		java.util.Arrays.sort(c);

		System.arraycopy(c,0,a,0,a.length);
		System.arraycopy(c,a.length,b,0,b.length);
		
		System.out.print("The values for A: ");
		for(int value: a)
			System.out.print(value + " ");
		System.out.print("\nThe values for B: ");
		for(int value: b)
			System.out.print(value + " ");
		System.out.print("\nThe values for c: ");
		for(int value: c)
			System.out.print(value + " ");
				
	}
}