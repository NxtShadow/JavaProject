package unit1;

public class NumberArrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = {9, 18, 5, 11, 15, 0, 10 };
		int[] num2 = new int [7] ; 
		
		
		for (int i = 0 ; i < num.length ; i++)
		{
			num2 [i] = num [ (i+2) %7] ;
		}
			
		
		for (int i = 0 ; i < num2.length ; i++)
		{
			System.out.print(num2 [i]  + " ");
		}
		
	}

}
