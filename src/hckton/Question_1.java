package hckton;

import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1st Boolean(true or false): ");
		boolean b1 = input.nextBoolean();
		System.out.println("Enter 2nd Boolean(true or false): ");
		boolean b2 = input.nextBoolean();
		System.out.println("Enter 3rd Boolean(true or false): ");
		boolean b3 = input.nextBoolean();
		
		
		input.close();
	
		int count = 0;
		
		if(b1) {
			count = count+1;
		}
		if(b2) {
			count = count+1;
		}
		
		if(b3) {
			count = count+1;
		}
		
		if(count >= 2) {
			System.out.println("Atleast two inputs are true");
		}
		else {
			System.out.println("Two inputs are not true");
		}
	}

}
