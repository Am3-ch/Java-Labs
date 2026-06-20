/* This program demonstrates the use of threads in Java. It defines a task that prints a specific character a certain number of times, and then creates and starts a thread to execute that task. The PrintChar class implements the Runnable interface, allowing it to be executed by a thread. The main method creates an instance of PrintChar with the character 'J' and the number of times to print (12), and then starts the thread to execute the task. */
//create a tes class
public class TaskThreadDemo{
	public static void main(String[] args){
		Runnable task1 = new PrintChar('J',12);
		Thread thread1 = new Thread (task1);

		thread1.start();
	}
}
//create a task class
class PrintChar implements Runnable{
	//datafields
	private char character;
	private int noOfTimes;

	//create a constructor	
	public PrintChar(char c,int n){
		character = c;
		noOfTimes = n;
	}
	//implement the run method
	public void run(){
		for(int i = 0; i < noOfTimes; i++){
			System.out.print(character + " ");
		}

	}
	

}