package hckton;

import java.util.Arrays;
import java.util.Scanner;

//program for binary search. And 5 i/p has to take from user as binary elements.

public class Question_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c;
		Scanner in = new Scanner(System.in);
		int[] array = new int[5];
		System.out.println("Enter " +5 +" integers");
		if(array.length!=5){
		System.out.println("Please enter 5 values");
		}
		for (c = 0; c < 5; c++)
		array[c] = in.nextInt();
		System.out.println("Entered array: " +
		Arrays.toString(array));
		Arrays.sort(array);
		System.out.println("Sorted array: " +Arrays.toString(array));
		System.out.println("Enter the element to search: ");
		int key = in.nextInt();
		int res = Arrays.binarySearch(array,key);
		if (res >= 0) {
		System.out.println(key + " found at index = "+ res);
		}
		else {
		System.out.println(key + " Not found");
		}
		
		in.close();
	}

}
