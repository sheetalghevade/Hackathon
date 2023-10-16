package hckton;


//to find factorial of a number using recursion


import java.util.Scanner;

public class Question_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		//Stored the entered value in variable
		int num = scanner.nextInt();
		//Called the user defined function fact
		int factorial = fact(num);
		System.out.println("Factorial of entered number is: "+factorial);
		scanner.close();
		}
		static int fact(int n)
		{
		int output;
		if(n==1){
		return 1;
		}
		//Recursion: Function calling itself!!
		output = fact(n-1)* n;
		return output;
		
	}

}
