//ethan sutton, The purpose of this program is to test the printf command as well as %8 %n etc. uploaded Feb 22nd, 2022
//completed wednesday feb 16th, 2022

package unit1;

public class printfAssignment {

	public static void main(String[] args) {
		
		//1
		
		System.out.printf("%d divided by %d = %.5f%n", 1, 7, 1/7.0  );
		
		
		//2
		
		String name = "Bessy";
		String colour = "brown";
		int weight = 1200;
		
		System.out.printf("The cow's name is %s, she is %s and weights %d kg.%n", name, colour, weight);

		//3
		
		int xx = 12324;
		System.out.println("| 12345678 |");
		System.out.println("| ======== |");
		System.out.printf("| %8d |%n", xx);
		System.out.printf("| %08d |%n" ,xx);
		System.out.printf("| %+8d |%n" ,xx );
		System.out.printf("| %-8d |%n" ,xx);
		System.out.printf("| %8.1f | %n" ,(double)xx);
	}

}
