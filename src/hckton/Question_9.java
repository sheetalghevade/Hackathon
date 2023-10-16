package hckton;

import java.util.Scanner;

public class Question_9 {

	public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner read = new Scanner(System.in);
			
			System.out.println("Enter String");
			
			String string_input = read.nextLine();
			
			read.close();
			
			
			if(string_input.isBlank()) {
				System.out.println("No String entered");
			}
				
				else {
					
					System.out.println("Input string to upper case:  "+string_input.toUpperCase());
					
				}
			}

	}