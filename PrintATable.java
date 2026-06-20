/* This program prints a table of values based on a 2D array. It initializes a 2D array with specific values, then iterates through the array to print each value. The values in the array are calculated based on a previous value that is updated in each iteration. Finally, it prints the values in a formatted manner. */
public class PrintATable{
	public static void main(String [] args){
		int previousValue = 1;
		int[][] myArray = new int [5][4];
		

		for(int row = 0; row < myArray.length; row++){
			for(int col = 0; col < myArray[row].length; col++){
				myArray[row][col] = previousValue;
				System.out.println(myArray[row][col] );
				System.out.println();
				for(int power = 1; power <= row; power++){
					previousValue = previousValue * power;
				}
			} 
		} 
	}
}