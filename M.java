/* This program demonstrates the difference between post-increment and pre-increment operators in Java. It initializes a variable 'a' with a value of 6, then uses both post-increment (a++) and pre-increment (++a) to show how they affect the value of 'a' and the assigned variable 'b'. The results are printed to the console. */
public class M{
	public static void main(String[] args){
		int a = 6;
		int b = a++;
		System.out.println(a);
 		System.out.println(b);
		a = 6;
		b = ++a;
		System.out.println(a);
		System.out.println(b);
	}
}