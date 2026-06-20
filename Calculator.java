
/* This is a simple calculator that takes in two numbers and an operator and returns the result of the operation. */
import java.util.Scanner;

public class Calculator {
   public static void main(String[] args) {
      // This will collect a number,operator and another number input from the
      // terminal
      Scanner input = new Scanner(System.in);
      System.out.print("Enter number: ");
      double num1 = input.nextDouble();
      System.out.print("Enter operator: ");
      String oper = input.next();
      System.out.print("Enter number: ");
      double num2 = input.nextDouble();

      System.out.println(hey(num1, oper, num2));
   }

   public static double hey(double num1, String oper, double num2) {
      if (oper.equals("*")) {
         return num1 * num2;
      } else if (oper.equals("+")) {
         return num1 + num2;
      } else if (oper.equals("-")) {
         return num1 - num2;
      } else if (oper.equals("/")) {
         return num1 / num2;
      } else if (oper.equals("^")) {
         return Math.pow(num1, num2);
      }
      return 0;
   }
}
