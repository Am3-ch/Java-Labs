/**This program checks the position of a day in a week based on user input*/
import java.util.Scanner;

public class CheckDay{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter day,e.g,monday,tuesday, etc: ");
		String day = input.nextLine().toLowerCase();

		switch (day){
			case "friday": System.out.println("It is the sixth day of the week.");
				break;
			case "monday": System.out.println("It is the second day of the week.");
				break;
			case "tuesday": System.out.println("It is the third day of the week.");
				break;
			case "wednesday": System.out.println("It is the fourth day of the week.");
				break;
			case "sunday": System.out.println("It is the first day of the week.");
				break;
			case "thursday": System.out.println("It is the fifth day of the week.");
				break;
			case "saturday": System.out.println("It is the seventh and last day of the week.");
				break;
			default: System.out.println("please enter a valid day!");
		}
	}
}