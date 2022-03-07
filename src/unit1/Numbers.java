package unit1;
//Ethan sutton, this program converts a string of letters and numbers into ascii
// and than increases only the numbers by 1, wrapping around a 10 into a 0 instead
// February 24th, 2022

public class Numbers {

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