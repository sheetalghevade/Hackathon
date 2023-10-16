package hckton;

import java.util.Scanner;

public class Question_13 {

	
	static void reversestring(String input_string)
	{
		StringBuilder reversed_string = new StringBuilder(input_string);
		
		int j = input_string.length()-1;
		for(int i=0;i<j;i++)
		{
		  	   char temp = input_string.charAt(i);

		  	   reversed_string.setCharAt(i, input_string.charAt(j));  
			    reversed_string.setCharAt(j, temp);
			    j--;
				
			    
			  }
			  
		System.out.println("Reversed String is: " +reversed_string);
		
			
	}
	
      public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
    	 Scanner input = new Scanner(System.in);
  		System.out.println("Enter String");
  		String input_string = input.nextLine();
		
  		input.close();
						
		reversestring(input_string);
		
				
	}
}
