package unit1;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String numChange = "abc351def90";
		
		System.out.println(numChange);
		
		
		for ( int i = 0; i < numChange.length  ()  ; i++)
		{
		 char c = numChange.charAt(i);
		 
		 int check = c; 
		 
		 if (check == 57)
		 {
			 check = 48;
		 }
		 
		 else if (check > 47 && check < 57 )
		 {
			 check += 1; 		 
		 }
		
		 
		 char numChange2 = (char) check; 		 
		
		System.out.print(numChange2);	
		}
		
	}

}
