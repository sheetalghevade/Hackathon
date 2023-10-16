package hckton;
import java.util.Arrays;
import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
 		// TODO Auto-generated method stub
          Scanner read = new Scanner(System.in);
		
        System.out.println("How many numbers to sort");
        int n = read.nextInt();
        
		System.out.println("Enter Numbers to sort");
		int array[] = new int[n];
		for(int i=0; i<n; i++) {
		 array[i] = read.nextInt();
		}
			
		System.out.println("Input array to sort is: ");
		for(int i : array) {
			System.out.print(i +" ");
		}
		
		Arrays.sort(array);
		
		System.out.println("\nArray after sort is: ");
		for(int i : array) {
			System.out.print(i +" ");
		}
		read.close();
		
	}

}
