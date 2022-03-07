package unit1;
//Ethan sutton, learning how scanner works

import java.util.Scanner;

public class ScannerPractice {

	// global varriable

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("What do you have for lunch?");
		String food = sc.next(); // one word only
		sc.nextLine(); // clear the rest
		System.out.println("I like " + food + " too...yum");

		System.out.println("How many pieces do you have?");
		int num = getInt();

		if (num > 1) {
			System.out.println("Can i buy one? I have 25¢");

		}
	}

	static int getInt() {
		while (true) {
			if (!sc.hasNextInt()) {
				System.out.println("please enter an integer (a number with no decimals)");
				sc.nextLine(); // clear
			} else {
				break;
			}

			
			
		}

		int x = sc.nextInt();
		return x;
	}

}
