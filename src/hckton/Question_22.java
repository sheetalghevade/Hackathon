package hckton;

import java.util.Scanner;

//Convert int to string

public class Question_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		System.out.println("enter your input");
		try{
		int number=scan.nextInt();
		String str=String.valueOf(number);
		System.out.println("Value: "+str);		
		System.out.print("output when 100 added to integer: ");
		System.out.println(number+100);
		
		System.out.print("output when 100 added to integer converted into string: ");
		System.out.println(str+100);
		
		}
		catch(Exception e){
		System.out.println("Exception" + e);
		System.out.println("please enter valid input");
		}
		scan.close();
	}

}
