/* 	This program calculates the angles of a triangle given the lengths of its sides.
		It uses the law of cosines to calculate the angles.
		The law of cosines states that for any triangle with sides a, b, and c, and angles A, B, and C opposite those sides:
		c^2 = a^2 + b^2 - 2ab * cos(C)
		b^2 = a^2 + c^2 - 2ac * cos(B)
		a^2 = b^2 + c^2 - 2bc * cos(A)
		
		From these equations, we can solve for the angles:
		C = acos((a^2 + b^2 - c^2) / (2ab))
		B = acos((a^2 + c^2 - b^2) / (2ac))
		A = acos((b^2 + c^2 - a^2) / (2bc))
		
		The angles are then converted from radians to degrees using Math.toDegrees().
*/

import java.util.Scanner;
import java.lang.Math;

public class Angles {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter lenth sizes of a triangle");
		System.out.print("side A: ");
		double a = input.nextDouble();
		System.out.print("side B: ");
		double b = input.nextDouble();
		System.out.print("side C: ");
		double c = input.nextDouble();

		double angleA = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
		double angleB = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
		double angleC = Math.toDegrees(Math.acos((c * c - a * a - b * b) / (-2 * a * b)));

		System.out.print("the triangle has angles " + angleA + "," + angleB + " and " + angleC + ".");
	}
}