package unit1;

public class Grades {

	public static void main(String[] args) {
		
		// get the grade
		
		int mark = 6;
		String grade = null;
		
		
		if (mark <50)
				{
		grade = "F";
				}
		if (mark >= 50 && mark <=59)
		{
			grade = "D";
		}
		if (mark >= 60 && mark <=69)
		{
			grade = "C";
		}
		if (mark >= 70 && mark <=79)
		{
			grade = "B";
		}
		if (mark >= 80 && mark <=89)
		{
			grade = "A";
		}
		if (mark >= 90)
		{
			grade = "A+";
		}

		System.out.print("Your grade is: " + grade);
	

	
	}

}
