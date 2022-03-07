package unit2;

import java.io.*;

public class MillionWords {

	public static void main(String[] args) {


		File f = new File ("words_alpha.txt");
		int numStore = 1;
		int MARGIN = 500;
		int multiply = 69;

		BufferedReader brFile = null;
		try {
			brFile = new BufferedReader (new FileReader (f));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			String text = brFile.readLine();


			while ( text != null)
			{

				for (int i = 0; i < text.length(); i++)
				{	


			
					multiply = (int)(text.charAt(i));
					multiply -= 96;
					numStore*=multiply;


				}

				if (numStore >= 1000000-MARGIN && numStore <= 1000000+MARGIN)
				{
					System.out.println(text + " is around 1 million");
					System.out.println(numStore);

				}

				text = brFile.readLine();
				numStore = 1;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}

}
