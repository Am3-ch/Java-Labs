//This program gets the user's weight and height and then uses it to determine there weight class
import java.util.Scanner;

public class BodyMass{
	/**Main method*/
	public static void main(String[] args){
        	//this part gets input from the user
		Scanner input= new Scanner(System.in);
		System.out.print("enter your weight in KG: ");
		double weight = input.nextDouble();
		System.out.print("enter your height in meters: ");
		double height = input.nextDouble();

		//this part calculates the bodymass and checks the users weight class
		double mass = weight/Math.pow(height,2);
		if (mass < 18.5){
			System.out.println("Mmmm, it looks like you are underweight");	
		}
		else if ((18.5 <= height) && (height < 25.0)){
			System.out.println("Normal and all good");
		}
		else if ((25.0 <= height) && (height < 30.0)){
			System.out.println("Overweight");
    		}
		else {
			System.out.println("obese");
		}
	}
}

	 


	