package unit1;
// Ethan sutton
//this program is designed to show the different ways of using modulus
//Friday Feb 11th, 2022


public class Modulus {

	public static void main(String[] args) {

		// start of first in console
		System.out.println("Number 1:");
		System.out.println(" ");

		// modulus 1
		int x = 0;
		int y = 0;

		for (x = 0; x <= 100; x++) {
			System.out.println(x + "\t" + y++ % 8);

		}

		// spacer and start of next in console
		System.out.println(" ");
		System.out.println("Number 2:");
		System.out.println(" ");

		// modulus 2

		int mod2 = 1;

		for (mod2 = 1; mod2 <= 200; mod2++) {

			if (mod2 % 13 == 0)
				System.out.print(mod2 + " ");

		}

		// spacer and start of next in console
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Number 3:");
		System.out.println(" ");

		// modulus 3

		int mod3 = 1;

		for (mod3 = 1; mod3 <= 200; mod3++) {

			if (mod3 % 12 == 0) {
				System.out.printf("%4d %n", mod3);

			} else {
				System.out.printf("%4d ", mod3);
			}

		}
	}

}
