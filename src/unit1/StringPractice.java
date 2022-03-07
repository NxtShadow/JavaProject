package unit1;

public class StringPractice {

	public static void main(String[] args) {

		String theString = "the quick brown fox jumps over the lazy dog";

		int theCount = 0;

		for ( int i = 0; i < theString.length  () -2 ; i++)
		{

			if (theString.substring(i, i+3).equals ("the")) 	theCount++;	

		}

		System.out.println("the number of times 'the' is used is: " + theCount);	
		System.out.println();

		//2

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


			//3

			String words = "abcdef" ; 

			char [] vowels = new char [] { 'a', 'e', 'i', 'o', 'u'};
			char [] other = new char [] {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
			char [] str = new char [6];

			for (int j = 0; j < 6; j++)
			{
				str[j] = other [(int)(Math.random()*5)];

			}

			for (int j = 0; j < 2 ; j++)
			{
				int vowelspot = (int)(Math.random()*6);
				int vowel = (int)(Math.random()*5);
				str[vowelspot] = vowels[vowel];
				if((Math.random() <= 0.5)) break;
			}

			System.out.println();
			System.out.print(str);


		}
	}

}
