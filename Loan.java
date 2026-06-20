import java.util.Scanner;

/**The program must let the user enter the interest rate, the loan amount, and the number of years 
for which payments will be made, It must compute and display the monthly payment and total payment amounts*/

public class Loan{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter interest rate: ");
		double anualInterestRate = input.nextDouble();
		System.out.print("Enter loan amount: ");
 		double loanNumber = input.nextDouble();
		System.out.print("Enter number of years: ");
		double numberOfYears = input.nextDouble();

		double monthlyInterestRate = anualInterestRate/1200;
 		double monthlyPayment = (loanNumber*monthlyInterestRate)/(1-1/Math.pow(1+monthlyInterestRate,numberOfYears*12));
		double totalPayment = monthlyPayment*numberOfYears*12;
		System.out.print("your monthly payment is: " + monthlyPayment + " and your total payment is " + totalPayment);
	
	}
}