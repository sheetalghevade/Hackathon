package hckton;

import java.util.Scanner;

public class Question_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your input");
		String input=scan.nextLine();
		//System.out.println("you have entered: " + input);
		int i=0;
		int j=input.length()-1;
		while(i<=j){
		if(input.charAt(i)==input.charAt(j)){ //Works for both characters and numbers
		i++;
		j--;
		}
		else{
		break;
		}
		}
		if(i>j){
		System.out.println(input+" is a palindrome");
		}
		else{
		System.out.println(input+ " is not a palindrome");
	}
		scan.close();

}
	}
