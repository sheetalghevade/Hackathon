package hckton;

import java.util.Scanner;

public class Question_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		System.out.println("enter your input");
		String str=scan.nextLine();
		try{
		int number=Integer.parseInt(str);
		System.out.println("Value: "+number);
		System.out.print("output when 100 added to string: ");
		System.out.println(str+100);
		System.out.print("output when 100 added to string converted into integer: ");
		System.out.println(number+100);
		}
		catch(Exception e){
		System.out.println("Exception: " +e);
		System.out.println("please enter valid input");
		}
		
		scan.close();
	}

}
