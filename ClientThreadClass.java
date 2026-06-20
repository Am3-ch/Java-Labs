/* 	This is a simple example of using threads in java
 * 	threads are used to run multiple tasks at the same time
 * 	threads can be created by extending the thread class or implementing the runnable interface
 * 	threads can be started by calling the start() method
 * 	threads can be paused by calling the sleep() method
 * 	threads can be stopped by calling the stop() method
 * 	threads can be interrupted by calling the interrupt() method
 * 	threads can be joined by calling the join() method
 * 	threads can be set to daemon threads by calling the setDaemon() method
 * 	daemon threads run in the background and are terminated when all user threads have finished executing
 * 	threads can be given names by calling the setName() method
 * 	threads can be given priorities by calling the setPriority() method
 * 	threads can be checked if they are alive by calling the isAlive() method
 * 	threads can be checked if they are daemon threads by calling the isDaemon() method
 */

//client class for using the threads
public class ClientThreadClass {
	public static void main(String[] args) {
		Thread thread1 = new MyThreadClass('A', 15);
		Thread thread2 = new MyThreadClass('B', 15);

		// set thread names
		thread1.setName("wow");
		thread2.setName("smile");

		// start the threads
		thread1.start();
		try {
			thread1.join(10000);// falses other threads to wait for thread one to finish running
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		thread2.start();

		// check how many threads are currently running
		System.out.println(Thread.activeCount());

		// check the name of the currently running thread which is the main thread
		System.out.println(Thread.currentThread().getName());
		System.out.println(thread1.getName());
		System.out.println(thread2.getName());

		// set thread priorities
		Thread.currentThread().setPriority(10);// highest priority. default priority is 5
		thread1.setPriority(9);// the system automatically assings priorities, this is just for user
								// preferences
		thread2.setPriority(3);// low priority

		// get thread priorities
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(thread1.getPriority());
		System.out.println(thread2.getPriority());

		// check if threads are alive or not
		System.out.println(Thread.currentThread().isAlive());
		System.out.println(thread1.isAlive());
		System.out.println(thread2.isAlive());

		// creating daemon thread
		thread1.setDaemon(true);

		// check if a thread is a daemon thread or user thread
		// Daemon threads run in the background .e.g garbage collection, they get
		// terminated when one thread gets an error
		System.out.println(thread1.isDaemon());

	}
}

// Create a class that extends the threada
class MyThreadClass extends Thread {
	private int number;
	private char character;

	// create the constructor
	public MyThreadClass(char c, int n) {
		number = n;
		character = c;
	}

	// overide the run method and implement it
	public void run() {
		for (int i = 0; i < number; i++) {
			System.out.println(character + " ");
			/*
			 * if(i == 7){
			 * try{
			 * Thread.sleep(2000);
			 * }
			 * catch(InterruptedException ex){
			 * ex.printStackTrace();
			 * }
			 * }
			 */
		}
	}

}