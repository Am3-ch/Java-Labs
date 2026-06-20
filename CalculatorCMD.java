/**
 * This program implements a simple commandline calculator.
 * It takes three commandline arguments: operand1, operator, and operand2.
 * It performs the specified operation and displays the result.
 * TO RUN: java CalculatorCMD 5 + 3
 */
public class CalculatorCMD {
  /** Main method */
  public static void main(String[] arg) {
    // Check number of strings passed
    if (arg.length != 3) {
      System.out.println(
          "Usage: java Calculator operand1 operator operand2");
      System.exit(0);
    }

    // The result of the operation
    int result = 0;

    // Determine the operator
    switch (arg[1].charAt(0)) {
      case '+':
        result = Integer.parseInt(arg[0]) +
            Integer.parseInt(arg[2]);
        break;
      case '-':
        result = Integer.parseInt(arg[0]) -
            Integer.parseInt(arg[2]);
        break;
      case '.':
        result = Integer.parseInt(arg[0]) *
            Integer.parseInt(arg[2]);
        break;
      case '/':
        result = Integer.parseInt(arg[0]) /
            Integer.parseInt(arg[2]);
    }

    // Display result
    System.out.println(arg[0] + ' ' + arg[1] + ' ' + arg[2]
        + " = " + result);
  }
}