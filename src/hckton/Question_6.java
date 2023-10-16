package hckton;

import java.util.Scanner;

public class Question_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=scan.nextInt();
		System.out.println("enter the array values");
		int [] arr=new int[size];
		
		
		for( int i = 0; i < arr.length; i++ ){
		arr[i]=scan.nextInt();
		}
		for ( int i = 0; i < arr.length; i++ ) {
		//find minimum, starting from index i
		int minIndex = i;
		int min = arr[i];
		for ( int j = i + 1; j < arr.length; j++ ) {
		if ( arr[ j ] < min ) {
		minIndex = j;
		min = arr[j];
		}
		}
		// now move the smallest element to the front, and the element at index i to the index of the minimal element
		int temp = arr[ i ];
		arr[ i ] = min;
		arr[ minIndex ] = temp;
		}
		for ( int i = 0; i < arr.length; i++ ) {
		System.out.print(arr[i]+" ");
		scan.close();
	}

}
}
