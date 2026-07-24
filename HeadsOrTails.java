package working.Java_projects;

import java.util.Scanner;

import java.util.Random;

public class HeadsOrTails extends Thread {

	private static Object thread;

	// May improve in future
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Flip the coin and Guess it's HEADS or TAILS");
		System.out.println("HEADS OR TAILS..??");
		String Flip = sc.nextLine();

		Thread.sleep(5000);

		boolean coin = random.nextBoolean();
		if (coin) {
			System.out.println("It's HEADS");
		} else {
			System.out.println("It's TAILS");
		}
		sc.close();
	}

}
