/**
 * This program demonstrates the use of a constant variable in Java.
 * It declares a final variable 'a' and attempts to change its value, which will result in a compilation error.
 */
public class Constant{
	public static void main(String[] args){
		final int a = 5;
		a = 10;
		System.out.println(a);
	}
}