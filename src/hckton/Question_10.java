package hckton;

import java.util.Scanner;

public class Question_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter String");
		
		String string_input = read.nextLine();
		
		System.out.println("String length is: "+string_input.length());
		
				
		if(string_input.isBlank()) {
			System.out.println("No String entered");
		}
			
			else {
				int a = 0;
				int b = 0;
						while (true) {	
				System.out.println("Enter valid start index");
				
				 a = read.nextInt();
				if(a>=0 && a< string_input.length()) {
					break;
				}
				
					}
						while (true) {	
							System.out.println("Enter valid end index");
							
						 b = read.nextInt();
							if(b>a && b<= string_input.length()) {
								break;
							}
								}
				                		
				System.out.println("Subsequence of string: "+string_input.substring(a, b));
			}
		
		read.close();
	}

}
