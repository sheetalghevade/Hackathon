package hckton;

import java.util.Scanner;

public class Question_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the input");
		String str=scan.nextLine();
		int upperCaseCount=0, lowerCaseCount=0, integerCount=0;
		for(int i=0;i<str.length();i++){
		if(Character.isUpperCase(str.charAt(i))){
		upperCaseCount++;
		}
		else if(Character.isLowerCase(str.charAt(i))){
		lowerCaseCount++;
		}
		else if(Character.isDigit(str.charAt(i))){
		integerCount++;
		}
		}
		System.out.println("upperCaseCount: "+ upperCaseCount);
		System.out.println("lowerCaseCount: "+ lowerCaseCount);
		System.out.println("integerCount: "+integerCount);
		
        scan.close();
	}

}
