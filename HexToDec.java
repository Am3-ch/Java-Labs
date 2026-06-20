//This program converts hexadecimal numbers to decimal.
import java.util.Scanner;
import java.lang.Math;

public class HexToDec{
	public static void main(String[] args){
		double inDec = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your hexadecimal number: ");
		String myArray = input.next().toUpperCase();
		int position = myArray.length();
		while( position >= 1){
			if(myArray.substring(position-1,position).equals("1"))
				inDec = inDec + Math.pow(16,(myArray.length()-position));
			else if(myArray.substring(position-1,position).equals("2"))
				inDec = inDec + (Math.pow(16,(myArray.length()-position))*2);
			else if(myArray.substring(position-1,position).equals("3"))
				inDec = inDec + (Math.pow(16,(myArray.length()-position))*3);
			else if(myArray.substring(position-1,position).equals("4"))
				inDec = inDec + (Math.pow(16,(myArray.length()-position))*4);
			else if(myArray.substring(position-1,position).equals("5"))
				inDec = inDec + (Math.pow(16,(myArray.length()-position))*5);
			else if(myArray.substring(position-1,position).equals("6"))
				inDec = inDec + (Math.pow(16,(myArray.length()-position))*6);
			else if(myArray.substring(position-1,position).equals("7"))
				inDec = inDec + (Math.pow(16,(myArray.length()-position))*7);
			else if(myArray.substring(position-1,position).equals("8"))
				inDec = inDec + (Math.pow(16,(myArray.length()-position))*8);	
			else if(myArray.substring(position-1,position).equals("9"))
				inDec = inDec + (Math.pow(16,(myArray.length()-position))*9);
			else if(myArray.substring(position-1,position).equals("A"))
				inDec = inDec + (Math.pow(16,(myArray.length()-position))*10);
			else if(myArray.substring(position-1,position).equals("B"))
				inDec = inDec + (Math.pow(16,(myArray.length()-position))*11);
			else if(myArray.substring(position-1,position).equals("C"))
				inDec = inDec + (Math.pow(16,(myArray.length()-position))*12);
			else if(myArray.substring(position-1,position).equals("D"))
				inDec = inDec + (Math.pow(16,(myArray.length()-position))*13);
			else if(myArray.substring(position-1,position).equals("E"))
				inDec = inDec + (Math.pow(16,(myArray.length()-position))*14);
			else if(myArray.substring(position-1,position).equals("F"))
				inDec = inDec + (Math.pow(16,(myArray.length()-position))*15);
			else 
				inDec = inDec + (Math.pow(16,(myArray.length()-position))*0);
			position--;
	
		}
		System.out.printf("%s is %3f in decimal.", myArray,inDec);
	}
}