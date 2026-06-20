/* This program implements a simple exam system. It presents a set of questions to the user, collects their answers, and calculates the total score based on correct answers. */
public class Exam{
	public  static void main(String[] args){

		int count = 0;
		
		String[][] questions = {{"1) What is your name? \n a)Humphrey \n b)Sandra \n d)Enoch", "2) how old are you? \n a) 20 \n b) 21 \n c)15", "3)What is java \n a) a programming language \n b) object oriented \n c) all of the above"},
					{"a","b","c"}};

		java.util.Scanner input = new java.util.Scanner(System.in);
		for (int i = 0; i < questions[0].length; i++)
			System.out.println(questions[0][i]);
		
		System.out.println("enter answers:");
		String a1 = input.nextLine();
		String a2 = input.nextLine();
		String a3 = input.nextLine();

		if(a1.equals(questions[1][0])){
			count +=1;
			System.out.println(a1 + " Correct");
		}
		else{
			System.out.print(a1 + " Wrong");
		}
		if(a2.equals(questions[1][1])){
			count +=1;
			System.out.println(a2 + " Correct");
		}
		else{
			System.out.println(a2 + " Wrong");
		}
		if(a3.equals(questions[1][2])){
			count +=1;
			System.out.println(a3 + " Correct");
		}
		else{
			System.out.print(a3 + " Wrong");
		}
		System.out.println("total marks " + count);
		
		

		
	}
}