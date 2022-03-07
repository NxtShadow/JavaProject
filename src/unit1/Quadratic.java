package unit1;
import java.util.Scanner;
import java.text.*; 

public class Quadratic {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		NumberFormat d = new DecimalFormat ("#0.00");
		
		double x1 = 0;
		double x2 = 0;
		
		System.out.print("please enter the first number ");
		double a = getDub();
		
		System.out.print("please enter the second number ");
		double b = getDub();
		
		System.out.print("please enter the third number ");
		double c = getDub();
		
		double discrim = b*b - 4*a*c;
		
		if (discrim < 0)
		{
			System.out.println("no roots");
		}
		
		if (discrim > 0)
		{
		   x1 = (- b - Math.sqrt(discrim)) / ( 2*a);
		  x2 = (- b + Math.sqrt(discrim)) / ( 2*a);
		System.out.println("x1 = " + d.format(x1) + ", " + "x2 = " + d.format(x2));
		}
		
		if (discrim == 0) 
		{
			 x1 = (- b - Math.sqrt(discrim)) / ( 2*a);
			System.out.println("One root x = " +d.format(x1));
		}
		
	}
		
		
	static double getDub() {
	
		while (true) {
		
			if (!sc.hasNextDouble()) {
				System.out.println("Please enter a number");
				sc.nextLine(); // clear
				} else {
					break;
				}

				
				
		}

			double x = sc.nextDouble();
			return x;
	}

	

}
