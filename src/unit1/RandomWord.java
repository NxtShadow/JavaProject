package unit1;

// Ethan Sutton, this program randomly generates 6 constanants than randomly replaces
// 1-2 of them with vowels, than prints it out
// February 24th, 2022 

public class RandomWord {

	public static void main(String[] args) {
		

		char [] vowels = new char [] { 'a', 'e', 'i', 'o', 'u'};
		char [] other = new char [] {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
		char [] str = new char [6];

		for (int j = 0; j < 6; j++)
		{
			str[j] = other [(int)(Math.random()*21)];

		}

		for (int j = 0; j < 2 ; j++)
		{
			int vowelspot = (int)(Math.random()*6);
			int vowel = (int)(Math.random()*5);
			str[vowelspot] = vowels[vowel];
			if((Math.random() <= 0.5)) break;
		}
		
		
		System.out.println("randomly generated letters, 1-2 vowels");
		System.out.print(str);



	}

}
