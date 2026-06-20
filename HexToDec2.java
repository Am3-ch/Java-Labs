/** this program aims to simplify the hexadecimal to decimal code convertion that i recently created*/
import java.lang.Integer;
import java.util.Scanner;

public class HexToDec2 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
       		System.out.println("Hello, this program converts Hexadecimal numbers to decimal numbers\nEnter Your Hexadecimal number to get results or enter \"quit\"  to stop.");
		
		while (true){
			System.out.print("Enter number: ");
			String v = input.nextLine();
			if(v.toLowerCase().equals("quit")){
				System.out.println("stop");
				break;		
			
			}
			
			System.out.println("The floating point number is \n " + Integer.parseInt(v, 16));
		}	//note... Double.parseDouble(v, 16) never works (error) and Double.valueOf(v, 16) is an error, though both Double.parseDouble(v) and Double.valueOf(v) work.
 	}
}