package hckton;

import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner read = new Scanner(System.in);
		System.out.println("Enter length of array");
		int n = read.nextInt();
		
		System.out.println("Enter integers");
		int array[] = new int[n];
		
		for(int i=0;i<n;i++) {
			array[i]=read.nextInt();
		}
		boolean result = true;
		
		for(int i=0;i<n;i++) {
			if(array[i] != array[n-1-i]) {
				result = false;
				break;
			}
		}
        if(result == true) {
		System.out.println("Given set of integers are palindrome");
        }
        else {
        	System.out.println("Given set of integers are not palindrome");
        	
        }
        read.close();
	}

}
