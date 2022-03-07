package unit1;
//Ethan sutton, this program reads how many times a string (the) is used in a given scentence and
// than outputs the a number depending on how many times it was used. 
// February 24th, 2022
public class CountingThe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String theString = "the quick brown fox jumps over the lazy dog";

		int theCount = 0;

		for ( int i = 0; i < theString.length  () -2 ; i++)
		{

			if (theString.substring(i, i+3).equals ("the")) 	theCount++;	

		}

		System.out.println("the scentence is: " + "'" +  theString + "'");
		System.out.println("the number of times 'the' is used is: " + theCount);	

	}

}
