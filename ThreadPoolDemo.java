//this program just puts thread pools to the test
import java.util.concurrent.*;

public class ThreadPoolDemo {
	public static void main(String[] args){

		//create a threadpool
		ExecutorService executor = Executors.newFixedThreadPool(4);
		
		//assign tasks to the threadpool
		executor.execute(new PrintChar('A',15));
		executor.execute(new PrintChar('B',15));
		executor.execute(new PrintChar('C',15));	
		executor.execute(new PrintChar('D',15));
		executor.execute(new PrintChar('E',15));
		executor.execute(new PrintChar('F',15));

		executor.shutdown();

		
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
			System.out.println(character + " ");
		}

	}
	

}