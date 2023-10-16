package hckton;

import java.util.Scanner;

public class Question_16 {

	public static void RemoveCharacter(String string_input, String char_input) {
		
		String in_string = string_input;
		String in_char = char_input;
		
		System.out.println("OutputString after removing char is: " +in_string.replaceAll(in_char,""));
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter String");
		
		String string_input = read.nextLine();
		
        System.out.println("Enter Character to remove from string");
		
		String char_input = read.next();
		
		RemoveCharacter(string_input, char_input);
		
		
		read.close();
		
		
	}
	
	
}
