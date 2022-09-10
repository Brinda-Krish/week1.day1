package week1.day1;

public class OddindexUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Pseudo Code
		 
		 * Declare String Input as Follow
		  
		 * String test = "changeme";
		 
		 * a) Convert the String to character array
		 
		 * b) Traverse through each character (using loop)
		 
		 * c)find the odd index within the loop (use mod operator)
		 
		 * d)within the loop, change the character to uppercase, if the index is odd else don't change
		  
		 */
		
		String test = "changeme";
		
		char[] input = test.toCharArray();
		for (int i=0; i<input.length; i++)
		{
		if (i%2==1)
			{input[i] = Character.toUpperCase(input [i]);
			
			}

	}
for(int i=0; i<input.length; i++)
{
	System.out.print(input[i]);
	
}
}
}

