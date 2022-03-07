package unit1;

public class StrangeMath {

	public static void main(String[] args) {
		// syso ctrl space is system.out.println();
		
			System.out.println("Strange Math");
			int n=5;
			//int n=5/0 is bad will not work
			
			double x=5.0;
			double y=x/0.0;
			double z= y*y;
			System.out.println("y=" + y);
			
	//other invalid math
			
			x = Math.sqrt(-5);
			System.out.println("x=" + x);
			y= Math.asin(2.0);
			System.out.println("y=" + y );
				
	//infinities are equal, NAN are not equal

	// big integers
			
			int big = 2_147_483_647;  // 2 billion
			big++;
			System.out.println(big);
			System.out.println(5000000*30000);
	
			long num = 5000000L*3000000L;
			System.out.println(num);
			
	//big doubles
			x = 1.7e+308;
			x *= 10; 
			x = x *10;
			System.out.println ("bigger than biggest double: " + x);
	
	//accuracy
	
			x = 1234.0;
			x = x *0.1;
			x = x* 0.1; 
			System.out.println("x it now: "+x);
			
			x = 1234.0;
			x = x /10;
			x = x /10; 
			System.out.println("x it now: "+x);
					
			// double math sucks 
			// 1/7 (1 over 7) cannot store as its not exact, it will hit the limit and break
			// 1/8 CAN store
			
			
			
	
	}
	
	

}
