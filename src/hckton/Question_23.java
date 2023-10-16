package hckton;

import java.util.Scanner;

public class Question_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input;
		int ch1;
		Scanner one = new Scanner(System.in);
		System.out.println("enter your input");
		input = one.nextLine();
		try {
		ch1 = Integer.parseInt(input);
		System.out.println("Input is an integer");
		return;
		}
		catch (NumberFormatException e) {
			
		}
		try {
		if(input.equalsIgnoreCase("true")||input.equalsIgnoreCase("false")){
		System.out.println("Input is a boolean");
		return;
		}
		else{
		System.out.println("Input is a String");
		return;
		}
		} catch (NumberFormatException e) {
			System.out.println("exception");
		}
		
		

	}

}
