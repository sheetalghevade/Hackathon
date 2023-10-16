package hckton;

import java.util.Scanner;

public class Question_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Input String");
		String input = s1.nextLine();
		s1.close();
		
		String str_arr[] = input.split(" ");
		int j = str_arr.length-1;
		
				
      for(int i=j;i>=0;i--) {	  
    	  System.out.print(str_arr[i]+" ");
      }
	}

}
