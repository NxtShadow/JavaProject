// Ethan Sutton, feb 15th 2022
//this program generates 12 numbers and than finds the smallest and largest number in the array
package unit1;

public class ArrayReview {

	public static void main(String[] args) {
		
  int[] test = new int [12];
  int hold = 0; 
  int biggest = 0;
  int smallest = 100;
  
  for (int i = 0; i <12; i++)
  {
	  test [i]  = (int)(Math.random()*100)+1;
			  System.out.print(test[i]+ " ");
 
			  if (test [i] > biggest )
			  {
				  biggest = test [i];
			  }
			  
			  if (test [i] < smallest )
			  {
				  smallest = test [i];
			  }
	
			  
  }
  
  			  System.out.println(" ");
			  System.out.println("the smallest number is " +smallest+" ");
			  System.out.println("the biggest number is " +biggest+" ");
  
  
 
		
		
	}

}
