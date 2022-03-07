package unit2;

import java.io.*; 

public class FileIO {

	public static void main(String[] args) {


		File f = new File ("words_alpha.txt");

		BufferedReader brFile = null;
		try {
			brFile = new BufferedReader (new FileReader (f));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			String text = brFile.readLine();
			for (int i = 0 ; i <15; i++ )
			{
				System.out.println(text);
				text = brFile.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}




	}

}
