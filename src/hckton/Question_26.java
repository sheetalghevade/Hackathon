package hckton;

import java.util.Arrays;

// merge two sorted array.(Do not use third array) array1[10] =1,2,4,6,9,10 
//array2[4] = 3, 5,7,8 After merge : array1[10] =1,2,3,4,5,6,7,8,9,10

public class Question_26 {

	public static void merge(int array1[], int array2[]) {
			int m = array1.length-1;
			for(int i=array1.length-1; i>=0; i--) {
			if(array1[i] != 0) {
			array1[m] = array1[i];
			m = m-1;
			}
			}
			int i = m+1;
			int j=0, k=0;
			while((i<array1.length) && (j<array2.length)) {
			if(array1[i] < array2[j]) {
			array1[k++] = array1[i++];
			}
			else
			array1[k++] = array2[j++];
			}
			while(j < array2.length) {
				array1[k++] = array2[j++];
			}
			}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array1[] = {1,2,4,6,9,10,0,0,0,0};
		int array2[] = {3,5,7,8};
		merge(array1, array2);
		System.out.println("Merged array : " +Arrays.toString(array1));
		
		
		
	}

}
