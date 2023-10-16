package hckton;

import java.util.Scanner;

public class Question_2 {

	public static int factorial(int n){
		int fact=1;
		
		for(int i=1;i<=n;i++)
		{
		fact=fact*i;
		}
		return fact;
		}
	
		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter value of n");
		int n=scan.nextInt();
		int result=factorial(n);
		System.out.println("Factorial of " +n+" is "+ result);
		
		scan.close();
		
}
}
