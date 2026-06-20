/*This program demonstrates a race condition in a multithreaded environment*/

import java.util.concurrent.*;

public class AccountWithoutSync {
	// create account object
	private static Account account = new Account();

	public static void main(String[] args) {
		ExecutorService executor = Executors.newCachedThreadPool();

		// Create and launch 100 threads
		for (int i = 0; i < 100; i++) {
			executor.execute(new AddAPennyTask());
		}

		executor.shutdown();

		// Wait until all tasks are finished
		while (!executor.isTerminated()) {
		}

		System.out.println("What is balance? " + account.getBalance());
	}

	// A thread for adding a penny to the account
	private static class AddAPennyTask implements Runnable {
		public void run() {
			account.deposit(1);
			/*
			 * this also works to syncronize
			 * synchronized (account){
			 * account.deposit(1);
			 * }
			 */
		}
	}

	// An inner class for account
	static private class Account {
		private int balance = 0;

		public int getBalance() {
			return balance;
		}

		// note that the deposit method is synchronized to prevent data corruption
		public synchronized void deposit(int amount) {
			int newBalance = balance + amount;

			// This delay is deliberately added to magnify the
			// data-corruption problem and make it easy to see.
			try {
				Thread.sleep(5);
			} catch (InterruptedException ex) {
			}

			balance = newBalance;
		}
	}
}
